/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

======
bấm vô một ghế hiện thêm một jfame để nhập thông tin người bay sau đó lưu vào bảng tên người bay để gọn lại
 */


 /*
    - tạo đối tượng vé
    - Xuất mã vé tự dộng gán vào mã vé của dối tượng vé 
    - Lấy mã chuyến bay gán vào đối tượng
    - Khai báo 2 biết chưa giá cho 2 hạng phổ thông và thương gia,
duyện mảng để gán giá vé cho đúng ghế
    - Trạng thái đổi ?????
    - Trạng thái vé <thanh toán> <chưa thanh toán>
    - mở một jframe cho phép nhập thông tin của người bay, thông tin nhập được
gán vào các thuộc tính trong vé gồm : CMND, tên, email, sđt.
    - Xuất mã hóa đơn vào vé
    - Lấy mã ghế


    - Xuất thông tin ra Bảng thông tin mua để ng mua dễ dàng theo dõi 
 */
package view;

import connection.DataConnection;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MY PC
 */



//public static ArrayList <model.NguoiBay> dsNguoiBay = new ArrayList();

public class GiaoDienChonGhe extends javax.swing.JFrame {

    /**
     * Creates new form chonGhe
     */
    public static ArrayList<model.Ve> dsVe = new ArrayList(); // ds ve duoc chon   // cần có ds vé đi và ds vé về  

    public static ArrayList<model.Ve> dsVeDi = new ArrayList();
    public static ArrayList<model.Ve> dsVeVe = new ArrayList(); // thế này dược chưa ok, hóa đơn 2 chiều thì 2 danh sách truyền vào nhe, có mã hóa đơn luôn thì càng tốt
    // oke cái đó để xem, vậy phải có hóa đơn trước khi chọn vé rồi, chỉ cần mã hóa đơn thôi, lúc tạo hóa đơn t mowis 
//         /insert hóa đơn á, vậy mã Hóa đơn mình cho tự động sinh luôn ha, ừ,  còn vé thì khóa là mã vé với mã hóa đơn nên mối danh sách cứ đặt từ V01 ròi oke, về lại chỗ thêm ghế nha, ừ

        ArrayList <JTextField> listSelected = new ArrayList();  // ds cac nut dc click
        ArrayList <JTextField> dsTextField = new ArrayList();   // ds tat ca cac ghe

        ArrayList <model.Ghe> dsGhe = new ArrayList <model.Ghe>(); // ds ghe lay tu trong csdl

       // ArrayList <model.Ghe> dsGheDau = new ArrayList <model.Ghe>(); //  quen ròi :)))))))))
        private Color bg = new Color(240,240,240);


    public GiaoDienChonGhe() {
        initComponents();


//       layGhe();
        luuTextField();
        layGheTuCSDL(this.maChuyenBay);

        layMauGhe();

//        System.out.println("tre ve: " + GiaoDienChonGhe.soGheTreEmVe);
//                    System.out.println("tre di: "+ GiaoDienChonGhe.soGheTreEmDi);
//                     System.out.println("lon ve: "+ GiaoDienChonGhe.soGheNguoiLonVe);
//                     System.out.println("lon di: "+  GiaoDienChonGhe.soGheNguoiLonDi);
//layGheTuCSDL("CB01");
//           
//           layMauGhe();

        xuatThongTinVaoBang();

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
            
            
       
    }
    
    // phu vu cho nut back
    
        public GiaoDienChonGhe(String maChuyenBay) {
        initComponents();
        
        luuTextField();
        layGheTuCSDL(maChuyenBay);

        layMauGhe();
        xuatThongTinVaoBang();
        
            this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
            

    }
        
        // ket thuc phuc vu cho nut back
        
    public static String maSanBayDi;
    public static String maSanBayDen;

    public static Date ngayDi;
    public static Date ngayVe;

    public static int nguoiLonBanDau, treEmBanDau;
    public static int soGheNguoiLonDi;
    public static int soGheNguoiLonVe;
    public static int soGheTreEmDi;
    public static int soGheTreEmVe;
//    public static int nguoiLonBanDau, treEmBanDau;
//    int soGheEmBe;
    public static String maChuyenBay;
    public static boolean khuHoi;
    public static boolean di,ve;

    public GiaoDienChonGhe(String maSanBayDi, String maSanBayDen,
            //  Date ngayDi, Date ngayVe, boolean khuHoi, int soGheNguoiLon, int soGheTreEm, String maChuyenBay){
            Date ngayDi, Date ngayVe, boolean di, boolean ve,  boolean khuHoi, int soGheNguoiLon, int soGheTreEm, String maChuyenBay){
        initComponents();
        this.maSanBayDi = maSanBayDi;
        this.maSanBayDen = maSanBayDen;
        this.ngayDi = ngayDi;
        this.ngayVe = ngayVe;

        this.nguoiLonBanDau = soGheNguoiLon;
        this.soGheNguoiLonDi = soGheNguoiLon;
        this.soGheNguoiLonVe = soGheNguoiLon;

        this.treEmBanDau = soGheTreEm;
        this.soGheTreEmDi = soGheTreEm;
        this.soGheTreEmVe = soGheTreEm;
        this.maChuyenBay = maChuyenBay;
        this.di = di;
        this.ve = ve;
        this.khuHoi = khuHoi;
//        maChuyenBay = "phong";
//        luuGheVaoCSDL(maChuyenBay);



        System.out.println("chon bay di");
        layGheTuCSDL(this.maChuyenBay);

        luuTextField();
        layMauGhe();

               this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
            
           

    }
    public GiaoDienChonGhe(String maChuyenBay,int soGheNguoiLon, int soGheTreEm){
        initComponents();
        this.maChuyenBay = maChuyenBay;
        // this.soGheNguoiLonDi = soGheNguoiLon;
        this.soGheNguoiLonVe = soGheNguoiLon;
        //  this.soGheTreEmDi = soGheTreEm;
        this.soGheTreEmVe = soGheTreEm;

        System.out.println("chon bay ve");
        layGheTuCSDL(this.maChuyenBay);

        luuTextField();
        layMauGhe();
    this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirmed = JOptionPane.showConfirmDialog(null,
                        "Bạn có chắc muốn thoát chương trình không?", "Xác nhận",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                }
            }
        });
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

           
           
           

    
    @SuppressWarnings("unchecked")

    private void xuatThongTinVaoBang(){

     //   System.out.println("dsvedi "+ dsVeDi.size());
          DefaultTableModel dtm = (DefaultTableModel) jTable_ThongTinNguoiBay.getModel();

        dtm.setNumRows(0);
        Vector vt ;
          if (di){

        for(int i = 0; i < dsVeDi.size();i++){
                vt = new Vector();

                vt.add(dsVeDi.get(i).getMaChuyenBay());
                vt.add(dsVeDi.get(i).getTenNguoiBay());
                vt.add(dsVeDi.get(i).getMaGhe());
                vt.add(dsVeDi.get(i).getMaHoaDon());


                System.out.println(dsVeDi.get(i));

                dtm.addRow(vt);
            for (int j = 0 ; j < dsTextField.size();j++){

                    // đổi textfield thành màu xanh
                if(dsTextField.get(j).getName().trim().equals(dsVeDi.get(i).getMaGhe().trim())){
                    System.out.println("vonglap"+ dsTextField.get(j).getName());
                        dsTextField.get(j).setBackground(Color.GREEN);
                        listSelected.add(dsTextField.get(j));

                        break;
                }

                else {
                    System.out.println("vonglap"+ dsTextField.get(j).getName());
                        System.out.println("false");
                    }
                }
            }
            jTable_ThongTinNguoiBay.setModel(dtm);

//                for(int k =0 ; k< listSelected.size();k++){
//            System.out.println("alo: "+listSelected.get(k).getName());
//        }
        }
          
        else if (!ve && !di){
            for(int i = 0; i < dsVeVe.size();i++){
                vt = new Vector();

                vt.add(dsVeVe.get(i).getMaChuyenBay());
                vt.add(dsVeVe.get(i).getTenNguoiBay());
                vt.add(dsVeVe.get(i).getMaGhe());
                vt.add(dsVeVe.get(i).getMaHoaDon()); // fix loi bang ve ve k xuat ma hoa don


                System.out.println(dsVeVe.get(i));

                dtm.addRow(vt);
            for (int j = 0 ; j < dsTextField.size();j++){

                    // đổi textfield thành màu xanh
                if(dsTextField.get(j).getName().trim().equals(dsVeVe.get(i).getMaGhe().trim())){
                    System.out.println("vonglap"+ dsTextField.get(j).getName());
                        dsTextField.get(j).setBackground(Color.GREEN);
                        listSelected.add(dsTextField.get(j));
                        break;
                    }

//                else {
//                }
                }
            }
            jTable_ThongTinNguoiBay.setModel(dtm);

// for(int k =0 ; k< listSelected.size();k++){
////            System.out.println();
//            System.out.println("alo: "+listSelected.get(k).getName());
//        }
        }

        

        
    }
    private int luuTextField(){
        dsTextField.add(Ghe_1A);
        dsTextField.add(Ghe_1B);
        dsTextField.add(Ghe_1C);
        dsTextField.add(Ghe_1D);
        dsTextField.add(Ghe_1E);
        dsTextField.add(Ghe_1F);
        dsTextField.add(Ghe_2A);
        dsTextField.add(Ghe_2B);
        dsTextField.add(Ghe_2C);
        dsTextField.add(Ghe_2D);
        dsTextField.add(Ghe_2E);
        dsTextField.add(Ghe_2F);
        dsTextField.add(Ghe_3A);
        dsTextField.add(Ghe_3B);
        dsTextField.add(Ghe_3C);
        dsTextField.add(Ghe_3D);
        dsTextField.add(Ghe_3E);
        dsTextField.add(Ghe_3F);
        dsTextField.add(Ghe_4A);
        dsTextField.add(Ghe_4B);
        dsTextField.add(Ghe_4C);
        dsTextField.add(Ghe_4D);
        dsTextField.add(Ghe_4E);
        dsTextField.add(Ghe_4F);
        dsTextField.add(Ghe_5A);
        dsTextField.add(Ghe_5B);
        dsTextField.add(Ghe_5C);
        dsTextField.add(Ghe_5D);
        dsTextField.add(Ghe_5E);
        dsTextField.add(Ghe_5F);
        dsTextField.add(Ghe_6A);
        dsTextField.add(Ghe_6B);
        dsTextField.add(Ghe_6C);
        dsTextField.add(Ghe_6D);
        dsTextField.add(Ghe_6E);
        dsTextField.add(Ghe_6F);
        dsTextField.add(Ghe_7A);
        dsTextField.add(Ghe_7B);
        dsTextField.add(Ghe_7C);
        dsTextField.add(Ghe_7D);
        dsTextField.add(Ghe_7E);
        dsTextField.add(Ghe_7F);
        dsTextField.add(Ghe_8A);
        dsTextField.add(Ghe_8B);
        dsTextField.add(Ghe_8C);
        dsTextField.add(Ghe_8D);
        dsTextField.add(Ghe_8E);
        dsTextField.add(Ghe_8F);
        dsTextField.add(Ghe_9A);
        dsTextField.add(Ghe_9B);
        dsTextField.add(Ghe_9C);
        dsTextField.add(Ghe_9D);
        dsTextField.add(Ghe_9E);
        dsTextField.add(Ghe_9F);
        dsTextField.add(Ghe_10A);
        dsTextField.add(Ghe_10B);
        dsTextField.add(Ghe_10C);
        dsTextField.add(Ghe_10D);
        dsTextField.add(Ghe_10E);
        dsTextField.add(Ghe_10F);
        dsTextField.add(Ghe_11A);
        dsTextField.add(Ghe_11B);
        dsTextField.add(Ghe_11C);
        dsTextField.add(Ghe_11D);
        dsTextField.add(Ghe_11E);
        dsTextField.add(Ghe_11F);
        dsTextField.add(Ghe_12A);
        dsTextField.add(Ghe_12B);
        dsTextField.add(Ghe_12C);
        dsTextField.add(Ghe_12D);
        dsTextField.add(Ghe_12E);
        dsTextField.add(Ghe_12F);
        dsTextField.add(Ghe_13A);
        dsTextField.add(Ghe_13B);
        dsTextField.add(Ghe_13C);
        dsTextField.add(Ghe_13D);
        dsTextField.add(Ghe_13E);
        dsTextField.add(Ghe_13F);
        dsTextField.add(Ghe_14A);
        dsTextField.add(Ghe_14B);
        dsTextField.add(Ghe_14C);
        dsTextField.add(Ghe_14D);
        dsTextField.add(Ghe_14E);
        dsTextField.add(Ghe_14F);
        dsTextField.add(Ghe_15A);
        dsTextField.add(Ghe_15B);
        dsTextField.add(Ghe_15C);
        dsTextField.add(Ghe_15D);
        dsTextField.add(Ghe_15E);
        dsTextField.add(Ghe_15F);

        
//        System.err.println("luu ghe thanh cong");
//        
//        for (int i =0; i < dsTextField.size();i++){
//            System.err.println(dsTextField.get(i).getName());
//        }
        return 1;
    }

 

    
    private int layGheTuCSDL(String maChuyenBay){
        System.out.println("lay ghe");
        connection.DataConnection.createStatement();
        String sql = "select * from GHE";
        try {
            PreparedStatement ps = DataConnection.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                  model.Ghe ghe = new model.Ghe() ;
                // 
                  if(rs.getString("MaChuyenBay").trim().equals(maChuyenBay.trim())){

                    ghe.setMaGhe(rs.getString("MaGhe"));
                    ghe.setMaChuyenBay(rs.getString("MaChuyenBay"));
                    ghe.setLoaiGhe(rs.getString("LoaiGhe"));
                    ghe.setTrong(rs.getByte("Trong"));
                    //
//                      System.out.println(ghe.getMaGhe());
                    dsGhe.add(ghe);
                }
//                  else {
//                  }

                  
                  
                
            }
//            System.out.println(dsGhe.size());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lay that bai");
        }

        return 1;
    }

    
       private int layMauGhe(){
        byte trong = 0;
         for(int i = 0 ; i< dsGhe.size();i++){

             if (dsGhe.get(i).getTrong() == trong){
//                 System.out.println(dsGhe.get(i).getMaGhe().substring(5));

                  for (int j=0;j< dsTextField.size();j++){

                if(dsGhe.get(i).getMaGhe().substring(5).trim().equalsIgnoreCase(dsTextField.get(j).getName().trim())){
                        dsTextField.get(j).setBackground(Color.red);
//                     System.err.println("bang nhau");

                    }
//                else {
//
//                   System.out.println(dsTextField.get(j).getName());
//                }
                }

             
         }}
        return 1;

    }

    // khi mà click vào ghế thì tạm thời đổi màu
    
    // ở đây là đầu tiên là hàm đổi màu ghế nên chưa đổi tên lại

        private void xuLiSuKienClickVaMoBangNhapThongTin(JTextField a){

        // System.out.println(a.getBackground().getRed()+"-"+a.getBackground().getGreen()+"-"+a.getBackground().getBlue()); // 240 240 240
     if ((a.getBackground().getRed()) == 240 && (a.getBackground().getGreen() == 240)&&(a.getBackground().getBlue() == 240)){ // so sánh nếu mà ghế màu trắng mới cho click
//                System.err.println("trang");            //khi ông chọn xong r mở cái này lên mấy nút kia vẫn ấn đc mà, nhưng mấy cái ghế đấy nó k chạy event thì ph
            a.setBackground(Color.GREEN);
            this.listSelected.add(a);
//                System.err.println(a.getName());

               if (di){new GiaoDienNhapThongTinNguoiBayKhiChonGhe(a.getName(), this.maChuyenBay, this.soGheNguoiLonDi, this.soGheTreEmDi).setVisible(true);}
               else if (!di &&!ve) new GiaoDienNhapThongTinNguoiBayKhiChonGhe(a.getName(), this.maChuyenBay, this.soGheNguoiLonVe, this.soGheTreEmVe).setVisible(true);

            this.dispose();

            //
     }
 
            else if ((a.getBackground().getRed()) == 0 && (a.getBackground().getGreen() == 255)&&(a.getBackground().getBlue() == 0)) {

                a.setBackground(bg);
//                System.err.println("chuyen tu xanh sang trang");
                
// viet thu tim ghe moi chon de xoa ra khoi danh sach

            for(int i =0;i < listSelected.size();i++){
            

                    
                System.err.println("chuan bi xoa");
                if(listSelected.get(i) == a){
                    System.err.println("bang nhau");
                    listSelected.remove(i);

                    System.err.println("da xoa");
                }
                else {
                    System.err.println("khong bang nhau");}

                     
            }   
            
                if (di)     xoaThongTinKhiClick(a, dsVeDi, soGheNguoiLonDi, soGheTreEmDi);
                else if (!ve && !di) xoaThongTinKhiClick(a, dsVeVe, soGheNguoiLonVe, soGheTreEmVe);
            }   
     
     
                    System.out.println("sau khi xoa mot nut cong lai so luong ghe");
                    System.out.println("tre ve: " + GiaoDienChonGhe.soGheTreEmVe);
                    System.out.println("tre di: "+ GiaoDienChonGhe.soGheTreEmDi);
                     System.out.println("lon ve: "+ GiaoDienChonGhe.soGheNguoiLonVe);
                     System.out.println("lon di: "+  GiaoDienChonGhe.soGheNguoiLonDi);

}   
private void xoaThongTinKhiClick(JTextField a, ArrayList<model.Ve> dsVe,int soNguoiLon, int soTreEm  ){
//     for(int i =0;i < listSelected.size();i++){
//                
//               
//                    
//                    System.err.println("chuan bi xoa");
//                if(listSelected.get(i) == a){
//                     System.err.println("bang nhau");
//                      listSelected.remove(i);
//                      
//                    System.err.println("da xoa");                   
//                }
//                else {
//                    System.err.println("khong bang nhau");}
//                     
//            }
            
            for (int j = 0 ; j < dsVe.size(); j++){
               
                System.out.println("maghe " + dsVe.get(j).getMaGhe() );;
                System.out.println("cmnd " + dsVe.get(j).getCmndNguoiBay() + " 0");;
                System.out.println("ma jtextfield" + a.getName());
                
                
                if (dsVe.get(j).getMaGhe().trim().equals(a.getName())){
                    
                    
                    if(dsVe.get(j).getCmndNguoiBay().equals("")){
                        if(di){
                            soGheTreEmDi++;
                        }
                        else if (!ve && !di){
                            soGheTreEmVe++;
                        }
                        //soTreEm++;
//                        System.out.println("tang so tre em len 1");
//                        System.out.println("so tre em sau khi taang"+ soTreEm);
                    }
                    else {
                         if(di){
                            soGheNguoiLonDi++;
                        }
                        else if (!ve && !di){
                            soGheNguoiLonVe++;
                        }
//                        soNguoiLon++;
//                    System.out.println("tang so ng lon len 1");
//                        System.out.println("so ng lon sau khi tang" + soNguoiLon);
                    }
                    
                    dsVe.remove(j);
                }
            }
                        System.out.println("so luong ve di"+dsVe.size());
                            this.xuatThongTinVaoBang();


}
// hàm này để chuyển màu danh sách các ghế đã chọn truyền vào màu tương ứng vỡi xác nhận hoặc hủy
      
private void changeColor(Color a){
        byte trong = 1;
        DataConnection.createStatement();
        String sql = "update GHE set Trong = ? where MaGhe = ? ";

        try {
            PreparedStatement ps = DataConnection.connection.prepareStatement(sql);
        for(int i =0;i < listSelected.size();i++){
//   
              for (int j = 0;j< dsGhe.size();j++){
                  if(dsGhe.get(j).getMaGhe().trim().equals(listSelected.get(i).getName())){

                        ps.setByte(1, trong);
                        ps.setString(2, dsGhe.get(j).getMaGhe().trim());

                        JOptionPane.showMessageDialog(this, "sua thanh cong");
                        ps.executeUpdate();

                      
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "sua that bai");
        }

      for(int i =0;i < listSelected.size();i++){
            listSelected.get(i).setBackground(a);
            // nếu cái nút nào có màu đỏ thì duyệt mảng ghế có ghế nào trùng tên nút màu đỏ thì đỏi trạng thái bằng 1

              
        }


   
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Ghe_1A = new javax.swing.JTextField();
        Ghe_1B = new javax.swing.JTextField();
        Ghe_1C = new javax.swing.JTextField();
        Ghe_1D = new javax.swing.JTextField();
        Ghe_1E = new javax.swing.JTextField();
        Ghe_3A = new javax.swing.JTextField();
        Ghe_4A = new javax.swing.JTextField();
        Ghe_5A = new javax.swing.JTextField();
        Ghe_6A = new javax.swing.JTextField();
        Ghe_7A = new javax.swing.JTextField();
        Ghe_4C = new javax.swing.JTextField();
        Ghe_5C = new javax.swing.JTextField();
        Ghe_6C = new javax.swing.JTextField();
        Ghe_7C = new javax.swing.JTextField();
        Ghe_2A = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Ghe_15A = new javax.swing.JTextField();
        Ghe_10A = new javax.swing.JTextField();
        Ghe_12A = new javax.swing.JTextField();
        Ghe_11A = new javax.swing.JTextField();
        Ghe_13A = new javax.swing.JTextField();
        Ghe_14A = new javax.swing.JTextField();
        Ghe_8A = new javax.swing.JTextField();
        Ghe_9A = new javax.swing.JTextField();
        Ghe_2C = new javax.swing.JTextField();
        Ghe_3B = new javax.swing.JTextField();
        Ghe_2B = new javax.swing.JTextField();
        Ghe_5B = new javax.swing.JTextField();
        Ghe_4B = new javax.swing.JTextField();
        Ghe_6B = new javax.swing.JTextField();
        Ghe_7B = new javax.swing.JTextField();
        Ghe_8B = new javax.swing.JTextField();
        Ghe_9B = new javax.swing.JTextField();
        Ghe_10B = new javax.swing.JTextField();
        Ghe_11B = new javax.swing.JTextField();
        Ghe_12B = new javax.swing.JTextField();
        Ghe_14B = new javax.swing.JTextField();
        Ghe_13B = new javax.swing.JTextField();
        Ghe_15B = new javax.swing.JTextField();
        Ghe_3C = new javax.swing.JTextField();
        Ghe_8C = new javax.swing.JTextField();
        Ghe_9C = new javax.swing.JTextField();
        Ghe_10C = new javax.swing.JTextField();
        Ghe_11C = new javax.swing.JTextField();
        Ghe_12C = new javax.swing.JTextField();
        Ghe_13C = new javax.swing.JTextField();
        Ghe_14C = new javax.swing.JTextField();
        Ghe_15C = new javax.swing.JTextField();
        Ghe_2D = new javax.swing.JTextField();
        Ghe_3D = new javax.swing.JTextField();
        Ghe_4D = new javax.swing.JTextField();
        Ghe_15D = new javax.swing.JTextField();
        Ghe_14D = new javax.swing.JTextField();
        Ghe_13D = new javax.swing.JTextField();
        Ghe_12D = new javax.swing.JTextField();
        Ghe_11D = new javax.swing.JTextField();
        Ghe_10D = new javax.swing.JTextField();
        Ghe_9D = new javax.swing.JTextField();
        Ghe_8D = new javax.swing.JTextField();
        Ghe_5D = new javax.swing.JTextField();
        Ghe_7D = new javax.swing.JTextField();
        Ghe_2E = new javax.swing.JTextField();
        Ghe_6D = new javax.swing.JTextField();
        Ghe_3E = new javax.swing.JTextField();
        Ghe_4E = new javax.swing.JTextField();
        Ghe_5E = new javax.swing.JTextField();
        Ghe_6E = new javax.swing.JTextField();
        Ghe_15E = new javax.swing.JTextField();
        Ghe_7E = new javax.swing.JTextField();
        Ghe_1F = new javax.swing.JTextField();
        Ghe_7F = new javax.swing.JTextField();
        Ghe_8E = new javax.swing.JTextField();
        Ghe_9E = new javax.swing.JTextField();
        Ghe_12E = new javax.swing.JTextField();
        Ghe_14E = new javax.swing.JTextField();
        Ghe_11E = new javax.swing.JTextField();
        Ghe_13E = new javax.swing.JTextField();
        Ghe_10E = new javax.swing.JTextField();
        Ghe_6F = new javax.swing.JTextField();
        Ghe_9F = new javax.swing.JTextField();
        Ghe_10F = new javax.swing.JTextField();
        Ghe_8F = new javax.swing.JTextField();
        Ghe_11F = new javax.swing.JTextField();
        Ghe_13F = new javax.swing.JTextField();
        Ghe_12F = new javax.swing.JTextField();
        Ghe_14F = new javax.swing.JTextField();
        Ghe_15F = new javax.swing.JTextField();
        Ghe_4F = new javax.swing.JTextField();
        Ghe_3F = new javax.swing.JTextField();
        Ghe_5F = new javax.swing.JTextField();
        Ghe_2F = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ThongTinNguoiBay = new javax.swing.JTable();
        Huy_Chon = new javax.swing.JButton();
        Xac_Nhan = new javax.swing.JButton();
        Huy_Chon1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chọn ghế");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("A");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("B");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("C");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("D");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("E");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("F");

        Ghe_1A.setEditable(false);
        Ghe_1A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_1AMouseClicked(evt);
            }
        });
        Ghe_1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_1AActionPerformed(evt);
            }
        });

        Ghe_1B.setEditable(false);
        Ghe_1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_1BMouseClicked(evt);
            }
        });
        Ghe_1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_1BActionPerformed(evt);
            }
        });

        Ghe_1C.setEditable(false);
        Ghe_1C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_1CMouseClicked(evt);
            }
        });
        Ghe_1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_1CActionPerformed(evt);
            }
        });

        Ghe_1D.setEditable(false);
        Ghe_1D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_1DMouseClicked(evt);
            }
        });
        Ghe_1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_1DActionPerformed(evt);
            }
        });

        Ghe_1E.setEditable(false);
        Ghe_1E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_1EMouseClicked(evt);
            }
        });
        Ghe_1E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_1EActionPerformed(evt);
            }
        });

        Ghe_3A.setEditable(false);
        Ghe_3A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_3AMouseClicked(evt);
            }
        });
        Ghe_3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_3AActionPerformed(evt);
            }
        });

        Ghe_4A.setEditable(false);
        Ghe_4A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_4AMouseClicked(evt);
            }
        });
        Ghe_4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_4AActionPerformed(evt);
            }
        });

        Ghe_5A.setEditable(false);
        Ghe_5A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_5AMouseClicked(evt);
            }
        });
        Ghe_5A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_5AActionPerformed(evt);
            }
        });

        Ghe_6A.setEditable(false);
        Ghe_6A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_6AMouseClicked(evt);
            }
        });
        Ghe_6A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_6AActionPerformed(evt);
            }
        });

        Ghe_7A.setEditable(false);
        Ghe_7A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_7AMouseClicked(evt);
            }
        });
        Ghe_7A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_7AActionPerformed(evt);
            }
        });

        Ghe_4C.setEditable(false);
        Ghe_4C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_4CMouseClicked(evt);
            }
        });
        Ghe_4C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_4CActionPerformed(evt);
            }
        });

        Ghe_5C.setEditable(false);
        Ghe_5C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_5CMouseClicked(evt);
            }
        });
        Ghe_5C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_5CActionPerformed(evt);
            }
        });

        Ghe_6C.setEditable(false);
        Ghe_6C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_6CMouseClicked(evt);
            }
        });
        Ghe_6C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_6CActionPerformed(evt);
            }
        });

        Ghe_7C.setEditable(false);
        Ghe_7C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_7CMouseClicked(evt);
            }
        });
        Ghe_7C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_7CActionPerformed(evt);
            }
        });

        Ghe_2A.setEditable(false);
        Ghe_2A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_2AMouseClicked(evt);
            }
        });
        Ghe_2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_2AActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel33.setText("1");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel32.setText("2");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("3");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setText("4");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel21.setText("5");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel22.setText("6");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel23.setText("7");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel24.setText("8");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel27.setForeground(java.awt.Color.red);
        jLabel27.setText("9");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel28.setForeground(java.awt.Color.red);
        jLabel28.setText("10");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel29.setText("11");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel30.setText("12");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel19.setText("13");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel31.setText("14");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel25.setText("15");

        Ghe_15A.setEditable(false);
        Ghe_15A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_15AMouseClicked(evt);
            }
        });
        Ghe_15A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_15AActionPerformed(evt);
            }
        });

        Ghe_10A.setEditable(false);
        Ghe_10A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_10AMouseClicked(evt);
            }
        });
        Ghe_10A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_10AActionPerformed(evt);
            }
        });

        Ghe_12A.setEditable(false);
        Ghe_12A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_12AMouseClicked(evt);
            }
        });
        Ghe_12A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_12AActionPerformed(evt);
            }
        });

        Ghe_11A.setEditable(false);
        Ghe_11A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_11AMouseClicked(evt);
            }
        });
        Ghe_11A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_11AActionPerformed(evt);
            }
        });

        Ghe_13A.setEditable(false);
        Ghe_13A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_13AMouseClicked(evt);
            }
        });
        Ghe_13A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_13AActionPerformed(evt);
            }
        });

        Ghe_14A.setEditable(false);
        Ghe_14A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_14AMouseClicked(evt);
            }
        });
        Ghe_14A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_14AActionPerformed(evt);
            }
        });

        Ghe_8A.setEditable(false);
        Ghe_8A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_8AMouseClicked(evt);
            }
        });
        Ghe_8A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_8AActionPerformed(evt);
            }
        });

        Ghe_9A.setEditable(false);
        Ghe_9A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_9AMouseClicked(evt);
            }
        });
        Ghe_9A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_9AActionPerformed(evt);
            }
        });

        Ghe_2C.setEditable(false);
        Ghe_2C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_2CMouseClicked(evt);
            }
        });
        Ghe_2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_2CActionPerformed(evt);
            }
        });

        Ghe_3B.setEditable(false);
        Ghe_3B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_3BMouseClicked(evt);
            }
        });
        Ghe_3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_3BActionPerformed(evt);
            }
        });

        Ghe_2B.setEditable(false);
        Ghe_2B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_2BMouseClicked(evt);
            }
        });
        Ghe_2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_2BActionPerformed(evt);
            }
        });

        Ghe_5B.setEditable(false);
        Ghe_5B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_5BMouseClicked(evt);
            }
        });
        Ghe_5B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_5BActionPerformed(evt);
            }
        });

        Ghe_4B.setEditable(false);
        Ghe_4B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_4BMouseClicked(evt);
            }
        });
        Ghe_4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_4BActionPerformed(evt);
            }
        });

        Ghe_6B.setEditable(false);
        Ghe_6B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_6BMouseClicked(evt);
            }
        });
        Ghe_6B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_6BActionPerformed(evt);
            }
        });

        Ghe_7B.setEditable(false);
        Ghe_7B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_7BMouseClicked(evt);
            }
        });
        Ghe_7B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_7BActionPerformed(evt);
            }
        });

        Ghe_8B.setEditable(false);
        Ghe_8B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_8BMouseClicked(evt);
            }
        });
        Ghe_8B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_8BActionPerformed(evt);
            }
        });

        Ghe_9B.setEditable(false);
        Ghe_9B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_9BMouseClicked(evt);
            }
        });
        Ghe_9B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_9BActionPerformed(evt);
            }
        });

        Ghe_10B.setEditable(false);
        Ghe_10B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_10BMouseClicked(evt);
            }
        });
        Ghe_10B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_10BActionPerformed(evt);
            }
        });

        Ghe_11B.setEditable(false);
        Ghe_11B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_11BMouseClicked(evt);
            }
        });
        Ghe_11B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_11BActionPerformed(evt);
            }
        });

        Ghe_12B.setEditable(false);
        Ghe_12B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_12BMouseClicked(evt);
            }
        });
        Ghe_12B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_12BActionPerformed(evt);
            }
        });

        Ghe_14B.setEditable(false);
        Ghe_14B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_14BMouseClicked(evt);
            }
        });
        Ghe_14B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_14BActionPerformed(evt);
            }
        });

        Ghe_13B.setEditable(false);
        Ghe_13B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_13BMouseClicked(evt);
            }
        });
        Ghe_13B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_13BActionPerformed(evt);
            }
        });

        Ghe_15B.setEditable(false);
        Ghe_15B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_15BMouseClicked(evt);
            }
        });
        Ghe_15B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_15BActionPerformed(evt);
            }
        });

        Ghe_3C.setEditable(false);
        Ghe_3C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_3CMouseClicked(evt);
            }
        });
        Ghe_3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_3CActionPerformed(evt);
            }
        });

        Ghe_8C.setEditable(false);
        Ghe_8C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_8CMouseClicked(evt);
            }
        });
        Ghe_8C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_8CActionPerformed(evt);
            }
        });

        Ghe_9C.setEditable(false);
        Ghe_9C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_9CMouseClicked(evt);
            }
        });
        Ghe_9C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_9CActionPerformed(evt);
            }
        });

        Ghe_10C.setEditable(false);
        Ghe_10C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_10CMouseClicked(evt);
            }
        });
        Ghe_10C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_10CActionPerformed(evt);
            }
        });

        Ghe_11C.setEditable(false);
        Ghe_11C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_11CMouseClicked(evt);
            }
        });
        Ghe_11C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_11CActionPerformed(evt);
            }
        });

        Ghe_12C.setEditable(false);
        Ghe_12C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_12CMouseClicked(evt);
            }
        });
        Ghe_12C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_12CActionPerformed(evt);
            }
        });

        Ghe_13C.setEditable(false);
        Ghe_13C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_13CMouseClicked(evt);
            }
        });
        Ghe_13C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_13CActionPerformed(evt);
            }
        });

        Ghe_14C.setEditable(false);
        Ghe_14C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_14CMouseClicked(evt);
            }
        });
        Ghe_14C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_14CActionPerformed(evt);
            }
        });

        Ghe_15C.setEditable(false);
        Ghe_15C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_15CMouseClicked(evt);
            }
        });
        Ghe_15C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_15CActionPerformed(evt);
            }
        });

        Ghe_2D.setEditable(false);
        Ghe_2D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_2DMouseClicked(evt);
            }
        });
        Ghe_2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_2DActionPerformed(evt);
            }
        });

        Ghe_3D.setEditable(false);
        Ghe_3D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_3DMouseClicked(evt);
            }
        });
        Ghe_3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_3DActionPerformed(evt);
            }
        });

        Ghe_4D.setEditable(false);
        Ghe_4D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_4DMouseClicked(evt);
            }
        });
        Ghe_4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_4DActionPerformed(evt);
            }
        });

        Ghe_15D.setEditable(false);
        Ghe_15D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_15DMouseClicked(evt);
            }
        });
        Ghe_15D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_15DActionPerformed(evt);
            }
        });

        Ghe_14D.setEditable(false);
        Ghe_14D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_14DMouseClicked(evt);
            }
        });
        Ghe_14D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_14DActionPerformed(evt);
            }
        });

        Ghe_13D.setEditable(false);
        Ghe_13D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_13DMouseClicked(evt);
            }
        });
        Ghe_13D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_13DActionPerformed(evt);
            }
        });

        Ghe_12D.setEditable(false);
        Ghe_12D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_12DMouseClicked(evt);
            }
        });
        Ghe_12D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_12DActionPerformed(evt);
            }
        });

        Ghe_11D.setEditable(false);
        Ghe_11D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_11DMouseClicked(evt);
            }
        });
        Ghe_11D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_11DActionPerformed(evt);
            }
        });

        Ghe_10D.setEditable(false);
        Ghe_10D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_10DMouseClicked(evt);
            }
        });
        Ghe_10D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_10DActionPerformed(evt);
            }
        });

        Ghe_9D.setEditable(false);
        Ghe_9D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_9DMouseClicked(evt);
            }
        });
        Ghe_9D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_9DActionPerformed(evt);
            }
        });

        Ghe_8D.setEditable(false);
        Ghe_8D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_8DMouseClicked(evt);
            }
        });
        Ghe_8D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_8DActionPerformed(evt);
            }
        });

        Ghe_5D.setEditable(false);
        Ghe_5D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_5DMouseClicked(evt);
            }
        });
        Ghe_5D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_5DActionPerformed(evt);
            }
        });

        Ghe_7D.setEditable(false);
        Ghe_7D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_7DMouseClicked(evt);
            }
        });
        Ghe_7D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_7DActionPerformed(evt);
            }
        });

        Ghe_2E.setEditable(false);
        Ghe_2E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_2EMouseClicked(evt);
            }
        });
        Ghe_2E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_2EActionPerformed(evt);
            }
        });

        Ghe_6D.setEditable(false);
        Ghe_6D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_6DMouseClicked(evt);
            }
        });
        Ghe_6D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_6DActionPerformed(evt);
            }
        });

        Ghe_3E.setEditable(false);
        Ghe_3E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_3EMouseClicked(evt);
            }
        });
        Ghe_3E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_3EActionPerformed(evt);
            }
        });

        Ghe_4E.setEditable(false);
        Ghe_4E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_4EMouseClicked(evt);
            }
        });
        Ghe_4E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_4EActionPerformed(evt);
            }
        });

        Ghe_5E.setEditable(false);
        Ghe_5E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_5EMouseClicked(evt);
            }
        });
        Ghe_5E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_5EActionPerformed(evt);
            }
        });

        Ghe_6E.setEditable(false);
        Ghe_6E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_6EMouseClicked(evt);
            }
        });
        Ghe_6E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_6EActionPerformed(evt);
            }
        });

        Ghe_15E.setEditable(false);
        Ghe_15E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_15EMouseClicked(evt);
            }
        });
        Ghe_15E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_15EActionPerformed(evt);
            }
        });

        Ghe_7E.setEditable(false);
        Ghe_7E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_7EMouseClicked(evt);
            }
        });
        Ghe_7E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_7EActionPerformed(evt);
            }
        });

        Ghe_1F.setEditable(false);
        Ghe_1F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_1FMouseClicked(evt);
            }
        });
        Ghe_1F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_1FActionPerformed(evt);
            }
        });

        Ghe_7F.setEditable(false);
        Ghe_7F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_7FMouseClicked(evt);
            }
        });
        Ghe_7F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_7FActionPerformed(evt);
            }
        });

        Ghe_8E.setEditable(false);
        Ghe_8E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_8EMouseClicked(evt);
            }
        });
        Ghe_8E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_8EActionPerformed(evt);
            }
        });

        Ghe_9E.setEditable(false);
        Ghe_9E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_9EMouseClicked(evt);
            }
        });
        Ghe_9E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_9EActionPerformed(evt);
            }
        });

        Ghe_12E.setEditable(false);
        Ghe_12E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_12EMouseClicked(evt);
            }
        });
        Ghe_12E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_12EActionPerformed(evt);
            }
        });

        Ghe_14E.setEditable(false);
        Ghe_14E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_14EMouseClicked(evt);
            }
        });
        Ghe_14E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_14EActionPerformed(evt);
            }
        });

        Ghe_11E.setEditable(false);
        Ghe_11E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_11EMouseClicked(evt);
            }
        });
        Ghe_11E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_11EActionPerformed(evt);
            }
        });

        Ghe_13E.setEditable(false);
        Ghe_13E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_13EMouseClicked(evt);
            }
        });
        Ghe_13E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_13EActionPerformed(evt);
            }
        });

        Ghe_10E.setEditable(false);
        Ghe_10E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_10EMouseClicked(evt);
            }
        });
        Ghe_10E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_10EActionPerformed(evt);
            }
        });

        Ghe_6F.setEditable(false);
        Ghe_6F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_6FMouseClicked(evt);
            }
        });
        Ghe_6F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_6FActionPerformed(evt);
            }
        });

        Ghe_9F.setEditable(false);
        Ghe_9F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_9FMouseClicked(evt);
            }
        });
        Ghe_9F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_9FActionPerformed(evt);
            }
        });

        Ghe_10F.setEditable(false);
        Ghe_10F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_10FMouseClicked(evt);
            }
        });
        Ghe_10F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_10FActionPerformed(evt);
            }
        });

        Ghe_8F.setEditable(false);
        Ghe_8F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_8FMouseClicked(evt);
            }
        });
        Ghe_8F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_8FActionPerformed(evt);
            }
        });

        Ghe_11F.setEditable(false);
        Ghe_11F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_11FMouseClicked(evt);
            }
        });
        Ghe_11F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_11FActionPerformed(evt);
            }
        });

        Ghe_13F.setEditable(false);
        Ghe_13F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_13FMouseClicked(evt);
            }
        });
        Ghe_13F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_13FActionPerformed(evt);
            }
        });

        Ghe_12F.setEditable(false);
        Ghe_12F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_12FMouseClicked(evt);
            }
        });
        Ghe_12F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_12FActionPerformed(evt);
            }
        });

        Ghe_14F.setEditable(false);
        Ghe_14F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_14FMouseClicked(evt);
            }
        });
        Ghe_14F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_14FActionPerformed(evt);
            }
        });

        Ghe_15F.setEditable(false);
        Ghe_15F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_15FMouseClicked(evt);
            }
        });
        Ghe_15F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_15FActionPerformed(evt);
            }
        });

        Ghe_4F.setEditable(false);
        Ghe_4F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_4FMouseClicked(evt);
            }
        });
        Ghe_4F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_4FActionPerformed(evt);
            }
        });

        Ghe_3F.setEditable(false);
        Ghe_3F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_3FMouseClicked(evt);
            }
        });
        Ghe_3F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_3FActionPerformed(evt);
            }
        });

        Ghe_5F.setEditable(false);
        Ghe_5F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_5FMouseClicked(evt);
            }
        });
        Ghe_5F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_5FActionPerformed(evt);
            }
        });

        Ghe_2F.setEditable(false);
        Ghe_2F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ghe_2FMouseClicked(evt);
            }
        });
        Ghe_2F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ghe_2FActionPerformed(evt);
            }
        });

        jLabel26.setText("_____________________");

        jLabel34.setText("_____________________");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_8A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_9A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_10A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_11A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_12A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_13A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_14A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_15A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_7A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_6A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_5A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_4A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_3A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ghe_2A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(Ghe_1A, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_11B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_11C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_2B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_2C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_1B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(Ghe_1C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_10B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_10C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_9B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_9C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_8B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_8C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_7B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_7C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_6B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_6C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_5B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_5C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_4B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_4C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_3B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_3C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_13B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_13C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_12B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_12C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_15B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_15C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(Ghe_14B, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ghe_14C, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ghe_1D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_2D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_3D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_4D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_15D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_14D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_13D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_12D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_11D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_10D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_9D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_8D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_7D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_6D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_5D, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ghe_1E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_2E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_3E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_4E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_5E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_6E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_15E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_14E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_12E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_13E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_8E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_9E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_10E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_11E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_7E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ghe_1F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_7F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_15F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_14F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_13F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_12F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_11F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_10F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_9F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_8F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_6F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_5F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_4F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_3F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ghe_2F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ghe_1A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_1C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_1D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_1E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(Ghe_1F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(Ghe_2A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_2C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_2D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_2E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ghe_2F, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(Ghe_3A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_3B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ghe_3C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_3D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_3E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_3F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(Ghe_4A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_4C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_4D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_4E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ghe_4F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ghe_4B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Ghe_5A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_5B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_5C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_5D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_5E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_5F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(Ghe_6A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_6B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_6C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_6D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_6E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_6F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(Ghe_7A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_7B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_7C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_7D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_7E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_7F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(Ghe_8A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_8B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_8C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_8D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_8E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_8F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(Ghe_9A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_9B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_9C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_9D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_9E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_9F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(Ghe_10A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_10B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_10C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_10D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_10E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_10F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(Ghe_11A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_11B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_11C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_11D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_11E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_11F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(Ghe_12A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_12B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_12C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_12D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_12E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_12F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Ghe_13A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_13B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_13C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_13D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_13E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_13F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(Ghe_14A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_14B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_14C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_14D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_14E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_14F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(Ghe_15A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_15B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_15C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_15D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_15E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ghe_15F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        Ghe_1A.setName("ghe_1A");
        Ghe_1B.setName("ghe_1B");
        Ghe_1C.setName("ghe_1C");
        Ghe_1D.setName("ghe_1D");
        Ghe_1E.setName("ghe_1E");
        Ghe_3A.setName("ghe_3A");
        Ghe_4A.setName("ghe_4A");
        Ghe_5A.setName("ghe_5A");
        Ghe_6A.setName("ghe_6A");
        Ghe_7A.setName("ghe_7A");
        Ghe_4C.setName("ghe_4C");
        Ghe_5C.setName("ghe_5C");
        Ghe_6C.setName("ghe_6C");
        Ghe_7C.setName("ghe_7C");
        Ghe_2A.setName("ghe_2A");
        Ghe_15A.setName("ghe_15A");
        Ghe_10A.setName("ghe_10A");
        Ghe_12A.setName("ghe_12A");
        Ghe_11A.setName("ghe_11A");
        Ghe_13A.setName("ghe_13A");
        Ghe_14A.setName("ghe_14A");
        Ghe_8A.setName("ghe_8A");
        Ghe_9A.setName("ghe_9A");
        Ghe_2C.setName("ghe_2C");
        Ghe_3B.setName("ghe_3B");
        Ghe_2B.setName("ghe_2B");
        Ghe_5B.setName("ghe_5B");
        Ghe_4B.setName("ghe_4B");
        Ghe_6B.setName("ghe_6B");
        Ghe_7B.setName("ghe_7B");
        Ghe_8B.setName("ghe_8B");
        Ghe_9B.setName("ghe_9B");
        Ghe_10B.setName("ghe_10B");
        Ghe_11B.setName("ghe_11B");
        Ghe_12B.setName("ghe_12B");
        Ghe_14B.setName("ghe_14B");
        Ghe_13B.setName("ghe_13B");
        Ghe_15B.setName("ghe_15B");
        Ghe_3C.setName("ghe_3C");
        Ghe_8C.setName("ghe_8C");
        Ghe_9C.setName("ghe_9C");
        Ghe_10C.setName("ghe_10C");
        Ghe_11C.setName("ghe_11C");
        Ghe_12C.setName("ghe_12C");
        Ghe_13C.setName("ghe_13C");
        Ghe_14C.setName("ghe_14C");
        Ghe_15C.setName("ghe_15C");
        Ghe_2D.setName("ghe_2D");
        Ghe_3D.setName("ghe_3D");
        Ghe_4D.setName("ghe_4D");
        Ghe_15D.setName("ghe_15D");
        Ghe_14D.setName("ghe_14D");
        Ghe_13D.setName("ghe_13D");
        Ghe_12D.setName("ghe_12D");
        Ghe_11D.setName("ghe_11D");
        Ghe_10D.setName("ghe_10D");
        Ghe_9D.setName("ghe_9D");
        Ghe_8D.setName("ghe_8D");
        Ghe_5D.setName("ghe_5D");
        Ghe_7D.setName("ghe_7D");
        Ghe_2E.setName("ghe_2E");
        Ghe_6D.setName("ghe_6D");
        Ghe_3E.setName("ghe_3E");
        Ghe_4E.setName("ghe_4E");
        Ghe_5E.setName("ghe_5E");
        Ghe_6E.setName("ghe_6E");
        Ghe_15E.setName("ghe_15E");
        Ghe_7E.setName("ghe_7E");
        Ghe_1F.setName("ghe_1F");
        Ghe_7F.setName("ghe_7F");
        Ghe_8E.setName("ghe_8E");
        Ghe_9E.setName("ghe_9E");
        Ghe_12E.setName("ghe_12E");
        Ghe_14E.setName("ghe_14E");
        Ghe_11E.setName("ghe_11E");
        Ghe_13E.setName("ghe_13E");
        Ghe_10E.setName("ghe_10E");
        Ghe_6F.setName("ghe_6F");
        Ghe_9F.setName("ghe_9F");
        Ghe_10F.setName("ghe_10F");
        Ghe_8F.setName("ghe_8F");
        Ghe_11F.setName("ghe_11F");
        Ghe_13F.setName("ghe_13F");
        Ghe_12F.setName("ghe_12F");
        Ghe_14F.setName("ghe_14F");
        Ghe_15F.setName("ghe_15F");
        Ghe_4F.setName("ghe_4F");
        Ghe_3F.setName("ghe_3F");
        Ghe_5F.setName("ghe_5F");
        Ghe_2F.setName("ghe_2F");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel15)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel16)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel17)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(89, 98, 117));
        jPanel3.setForeground(java.awt.Color.white);

        jPanel4.setBackground(new java.awt.Color(48, 57, 82));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Ghi chú");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(256, 256, 256)
                    .addComponent(jLabel1)
                    .addContainerGap(268, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel1)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );

        jLabel2.setText("Chúng tôi không đảm bảo cung cấp đúng chỗ ngồi lỗi thoát hiểm quý khách đã đặt trước mà có thể ");

        jLabel7.setText("thay đổi mà không cần thông báo. Chỗ ngồi lối thoát hiểm (hàng 9 và 10) chỉ có thể sắp xếp cho");

        jLabel8.setText("những hành khách người lớn và khó khả năng hỗ trợ hành khách khác trong trường hợp khẩn cấp");

        jLabel9.setText("Xin lưu ý ràng những hành khách hạn chế về khả năng nghe nhìn, hành khách bị tàn tật hoặc hành ");

        jLabel10.setText("khách đi kèm với trẻ nhỏ sẽ không được phép ngồi ở vị trí này.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setForeground(java.awt.Color.white);

        jTextField1.setEditable(false);
        jTextField1.setBackground(java.awt.Color.red);
        jTextField1.setForeground(java.awt.Color.red);

        jTextField2.setEditable(false);
        jTextField2.setBackground(java.awt.Color.green);
        jTextField2.setForeground(java.awt.Color.green);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Không thể chọn/ Không có sẵn");

        jLabel4.setText("Đang chọn");

        jLabel5.setText("Còn trống");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Xin lưu ý");

        jLabel11.setBackground(new java.awt.Color(89, 98, 117));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setText("Chuyến bay + \" mã chuyến bay\"  ");

        jTable_ThongTinNguoiBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã chuyến bay", "Hành khách", "Ghế ngồi", "Mã hóa Đơn"
            }
        ));
        jScrollPane1.setViewportView(jTable_ThongTinNguoiBay);

        Huy_Chon.setText("Hủy chọn");
        Huy_Chon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Huy_ChonActionPerformed(evt);
            }
        });

        Xac_Nhan.setText("Xác nhận");
        Xac_Nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xac_NhanActionPerformed(evt);
            }
        });

        Huy_Chon1.setText("Quay lại");
        Huy_Chon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Huy_Chon1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Huy_Chon1)
                .addGap(62, 62, 62)
                .addComponent(Huy_Chon)
                .addGap(62, 62, 62)
                .addComponent(Xac_Nhan)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Huy_Chon)
                    .addComponent(Xac_Nhan)
                    .addComponent(Huy_Chon1))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    private void huyChon() {

         for(int i =0;i < listSelected.size();i++){

             Color bg = new Color(240,240,240);
          listSelected.get(i).setBackground(bg);
          
         }
                    if( this.di){
                          dsVeDi.removeAll(dsVeDi);
                          soGheNguoiLonDi = nguoiLonBanDau;
                          soGheTreEmDi = treEmBanDau;
                      }
                      else if (!di && !ve){
                          dsVeVe.removeAll(dsVe);
                          soGheNguoiLonVe = nguoiLonBanDau; // reset số ng lớn  
                          soGheTreEmVe = treEmBanDau;   // reset số trẻ em
                      }
         
         //   
//              for (int j = 0;j< dsGhe.size();j++){
//                  if(dsGhe.get(i).getMaGhe().trim().equalsIgnoreCase(listSelected.get(j).getName().trim())){
//
//                      
//                 
//                      if( this.di){
//                          dsVeDi.removeAll(dsVeDi);
//                          soGheNguoiLonDi = nguoiLonBanDau;
//                          soGheTreEmDi = treEmBanDau;
//                      }
//                      else if (!di && !ve){
//                          dsVeVe.removeAll(dsVe);
//                          soGheNguoiLonVe = nguoiLonBanDau;
//                          soGheTreEmVe = treEmBanDau;
//                      }
//                  }}

    }
    private void Huy_ChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Huy_ChonActionPerformed
        // TODO add your handling code here:

        // changeColor(Color.WHITE);
        huyChon();
        ((DefaultTableModel) jTable_ThongTinNguoiBay.getModel()).setRowCount(0);


       // changeColor(Color.WHITE);


    }//GEN-LAST:event_Huy_ChonActionPerformed

    private void Ghe_2AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_2AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_2AActionPerformed

    private void Ghe_7CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_7CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_7CActionPerformed

    private void Ghe_6CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_6CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_6CActionPerformed

    private void Ghe_5CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_5CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_5CActionPerformed

    private void Ghe_4CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_4CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_4CActionPerformed

    private void Ghe_7AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_7AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_7AActionPerformed

    private void Ghe_6AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_6AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_6AActionPerformed

    private void Ghe_5AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_5AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_5AActionPerformed

    private void Ghe_4AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_4AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_4AActionPerformed

    private void Ghe_3AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_3AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_3AActionPerformed

    private void Ghe_1EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_1EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_1EActionPerformed

    private void Ghe_1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_1DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_1DActionPerformed

    private void Ghe_1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_1CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_1CActionPerformed

    private void Ghe_1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_1BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_1BActionPerformed

    private void Ghe_1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_1AActionPerformed
        // TODO add your handling code here:
        // luuTextField(Ghe_1A);


    }//GEN-LAST:event_Ghe_1AActionPerformed

    private void Ghe_15AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_15AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_15AActionPerformed

    private void Ghe_10AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_10AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_10AActionPerformed

    private void Ghe_12AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_12AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_12AActionPerformed

    private void Ghe_11AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_11AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_11AActionPerformed

    private void Ghe_13AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_13AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_13AActionPerformed

    private void Ghe_14AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_14AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_14AActionPerformed

    private void Ghe_8AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_8AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_8AActionPerformed

    private void Ghe_9AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_9AActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_9AActionPerformed

    private void Ghe_2CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_2CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_2CActionPerformed

    private void Ghe_3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_3BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_3BActionPerformed

    private void Ghe_2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_2BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_2BActionPerformed

    private void Ghe_5BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_5BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_5BActionPerformed

    private void Ghe_4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_4BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_4BActionPerformed

    private void Ghe_6BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_6BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_6BActionPerformed

    private void Ghe_7BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_7BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_7BActionPerformed

    private void Ghe_8BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_8BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_8BActionPerformed

    private void Ghe_9BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_9BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_9BActionPerformed

    private void Ghe_10BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_10BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_10BActionPerformed

    private void Ghe_11BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_11BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_11BActionPerformed

    private void Ghe_12BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_12BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_12BActionPerformed

    private void Ghe_14BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_14BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_14BActionPerformed

    private void Ghe_13BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_13BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_13BActionPerformed

    private void Ghe_15BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_15BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_15BActionPerformed

    private void Ghe_3CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_3CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_3CActionPerformed

    private void Ghe_8CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_8CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_8CActionPerformed

    private void Ghe_9CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_9CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_9CActionPerformed

    private void Ghe_10CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_10CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_10CActionPerformed

    private void Ghe_11CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_11CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_11CActionPerformed

    private void Ghe_12CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_12CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_12CActionPerformed

    private void Ghe_13CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_13CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_13CActionPerformed

    private void Ghe_14CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_14CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_14CActionPerformed

    private void Ghe_15CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_15CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_15CActionPerformed

    private void Ghe_2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_2DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_2DActionPerformed

    private void Ghe_3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_3DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_3DActionPerformed

    private void Ghe_4DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_4DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_4DActionPerformed

    private void Ghe_15DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_15DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_15DActionPerformed

    private void Ghe_14DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_14DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_14DActionPerformed

    private void Ghe_13DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_13DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_13DActionPerformed

    private void Ghe_12DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_12DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_12DActionPerformed

    private void Ghe_11DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_11DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_11DActionPerformed

    private void Ghe_10DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_10DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_10DActionPerformed

    private void Ghe_9DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_9DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_9DActionPerformed

    private void Ghe_8DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_8DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_8DActionPerformed

    private void Ghe_5DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_5DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_5DActionPerformed

    private void Ghe_7DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_7DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_7DActionPerformed

    private void Ghe_2EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_2EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_2EActionPerformed

    private void Ghe_6DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_6DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_6DActionPerformed

    private void Ghe_3EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_3EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_3EActionPerformed

    private void Ghe_4EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_4EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_4EActionPerformed

    private void Ghe_5EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_5EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_5EActionPerformed

    private void Ghe_6EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_6EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_6EActionPerformed

    private void Ghe_15EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_15EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_15EActionPerformed

    private void Ghe_7EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_7EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_7EActionPerformed

    private void Ghe_1FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_1FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_1FActionPerformed

    private void Ghe_7FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_7FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_7FActionPerformed

    private void Ghe_8EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_8EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_8EActionPerformed

    private void Ghe_9EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_9EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_9EActionPerformed

    private void Ghe_12EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_12EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_12EActionPerformed

    private void Ghe_14EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_14EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_14EActionPerformed

    private void Ghe_11EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_11EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_11EActionPerformed

    private void Ghe_13EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_13EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_13EActionPerformed

    private void Ghe_10EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_10EActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_10EActionPerformed

    private void Ghe_6FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_6FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_6FActionPerformed

    private void Ghe_9FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_9FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_9FActionPerformed

    private void Ghe_10FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_10FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_10FActionPerformed

    private void Ghe_8FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_8FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_8FActionPerformed

    private void Ghe_11FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_11FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_11FActionPerformed

    private void Ghe_13FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_13FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_13FActionPerformed

    private void Ghe_12FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_12FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_12FActionPerformed

    private void Ghe_14FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_14FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_14FActionPerformed

    private void Ghe_15FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_15FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_15FActionPerformed

    private void Ghe_4FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_4FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_4FActionPerformed

    private void Ghe_3FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_3FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_3FActionPerformed

    private void Ghe_5FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_5FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_5FActionPerformed

    private void Ghe_2FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ghe_2FActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ghe_2FActionPerformed

    private void Ghe_1AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_1AMouseClicked
        // TODO add your handling code here:
        System.out.println("àaaaaa");
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_1A);
        // là sao không hiểu lắm nói rõ ra xem thử, kiểu ông ấn vào mà code nó k chạy á, chứ 2 nút hủy với xác nhân hình như vẫn ấn được
        // đúng rồi hai cái button vẫn nhấn được nhưng mà cái textfield nó bị sao á nhìn nó cũng k giống như bth, chạy lại lần nữa thử, từ lúc chọn chuyến bay áoke

    }//GEN-LAST:event_Ghe_1AMouseClicked

    private void Ghe_1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_1BMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_1B);

    }//GEN-LAST:event_Ghe_1BMouseClicked

    private void Ghe_1CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_1CMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_1C);
    }//GEN-LAST:event_Ghe_1CMouseClicked

    private void Ghe_1DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_1DMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_1D);
    }//GEN-LAST:event_Ghe_1DMouseClicked

    private void Ghe_1EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_1EMouseClicked
        // TODO add your handling code here: 
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_1E);
    }//GEN-LAST:event_Ghe_1EMouseClicked

    private void Ghe_1FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_1FMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_1F);
    }//GEN-LAST:event_Ghe_1FMouseClicked

    private void Ghe_2AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_2AMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_2A);

    }//GEN-LAST:event_Ghe_2AMouseClicked

    private void Ghe_2BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_2BMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_2B);

    }//GEN-LAST:event_Ghe_2BMouseClicked

    private void Ghe_2CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_2CMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_2C);

    }//GEN-LAST:event_Ghe_2CMouseClicked

    private void Ghe_2DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_2DMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_2D);

    }//GEN-LAST:event_Ghe_2DMouseClicked

    private void Ghe_2EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_2EMouseClicked
        // TODO add your handling code here:
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_2E);

    }//GEN-LAST:event_Ghe_2EMouseClicked

    private void Ghe_2FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_2FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_2F);

    }//GEN-LAST:event_Ghe_2FMouseClicked

    private void Ghe_3AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_3AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_3A);

    }//GEN-LAST:event_Ghe_3AMouseClicked

    private void Ghe_4AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_4AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_4A);

    }//GEN-LAST:event_Ghe_4AMouseClicked

    private void Ghe_5AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_5AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_5A);

    }//GEN-LAST:event_Ghe_5AMouseClicked

    private void Ghe_6AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_6AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_6A);

    }//GEN-LAST:event_Ghe_6AMouseClicked

    private void Ghe_7AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_7AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_7A);

    }//GEN-LAST:event_Ghe_7AMouseClicked

    private void Ghe_8AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_8AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_8A);

    }//GEN-LAST:event_Ghe_8AMouseClicked

    private void Ghe_9AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_9AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_9A);

    }//GEN-LAST:event_Ghe_9AMouseClicked

    private void Ghe_10AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_10AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_10A);

    }//GEN-LAST:event_Ghe_10AMouseClicked

    private void Ghe_11AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_11AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_11A);

    }//GEN-LAST:event_Ghe_11AMouseClicked

    private void Ghe_12AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_12AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_12A);

    }//GEN-LAST:event_Ghe_12AMouseClicked

    private void Ghe_13AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_13AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_13A);

    }//GEN-LAST:event_Ghe_13AMouseClicked

    private void Ghe_14AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_14AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_14A);

    }//GEN-LAST:event_Ghe_14AMouseClicked

    private void Ghe_15AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_15AMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_15A);

    }//GEN-LAST:event_Ghe_15AMouseClicked

    private void Ghe_3BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_3BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_3B);

    }//GEN-LAST:event_Ghe_3BMouseClicked

    private void Ghe_4BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_4BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_4B);

    }//GEN-LAST:event_Ghe_4BMouseClicked

    private void Ghe_5BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_5BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_5B);

    }//GEN-LAST:event_Ghe_5BMouseClicked

    private void Ghe_6BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_6BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_6B);

    }//GEN-LAST:event_Ghe_6BMouseClicked

    private void Ghe_7BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_7BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_7B);

    }//GEN-LAST:event_Ghe_7BMouseClicked

    private void Ghe_8BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_8BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_8B);

    }//GEN-LAST:event_Ghe_8BMouseClicked

    private void Ghe_9BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_9BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_9B);

    }//GEN-LAST:event_Ghe_9BMouseClicked

    private void Ghe_10BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_10BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_10B);

    }//GEN-LAST:event_Ghe_10BMouseClicked

    private void Ghe_11BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_11BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_11B);

    }//GEN-LAST:event_Ghe_11BMouseClicked

    private void Ghe_12BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_12BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_12B);

    }//GEN-LAST:event_Ghe_12BMouseClicked

    private void Ghe_13BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_13BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_13B);

    }//GEN-LAST:event_Ghe_13BMouseClicked

    private void Ghe_14BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_14BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_14B);

    }//GEN-LAST:event_Ghe_14BMouseClicked

    private void Ghe_15BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_15BMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_15B);

    }//GEN-LAST:event_Ghe_15BMouseClicked

    private void Ghe_3CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_3CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_3C);

    }//GEN-LAST:event_Ghe_3CMouseClicked

    private void Ghe_4CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_4CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_4C);

    }//GEN-LAST:event_Ghe_4CMouseClicked

    private void Ghe_5CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_5CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_5C);

    }//GEN-LAST:event_Ghe_5CMouseClicked

    private void Ghe_6CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_6CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_6C);

    }//GEN-LAST:event_Ghe_6CMouseClicked

    private void Ghe_7CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_7CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_7C);

    }//GEN-LAST:event_Ghe_7CMouseClicked

    private void Ghe_8CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_8CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_8C);

    }//GEN-LAST:event_Ghe_8CMouseClicked

    private void Ghe_9CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_9CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_9C);

    }//GEN-LAST:event_Ghe_9CMouseClicked

    private void Ghe_10CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_10CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_10C);

    }//GEN-LAST:event_Ghe_10CMouseClicked

    private void Ghe_11CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_11CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_11C);

    }//GEN-LAST:event_Ghe_11CMouseClicked

    private void Ghe_12CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_12CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_12C);

    }//GEN-LAST:event_Ghe_12CMouseClicked

    private void Ghe_13CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_13CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_13C);

    }//GEN-LAST:event_Ghe_13CMouseClicked

    private void Ghe_14CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_14CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_14C);

    }//GEN-LAST:event_Ghe_14CMouseClicked

    private void Ghe_15CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_15CMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_15C);

    }//GEN-LAST:event_Ghe_15CMouseClicked

    private void Ghe_3DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_3DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_3D);

    }//GEN-LAST:event_Ghe_3DMouseClicked

    private void Ghe_4DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_4DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_4D);

    }//GEN-LAST:event_Ghe_4DMouseClicked

    private void Ghe_5DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_5DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_5D);

    }//GEN-LAST:event_Ghe_5DMouseClicked

    private void Ghe_6DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_6DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_6D);

    }//GEN-LAST:event_Ghe_6DMouseClicked

    private void Ghe_7DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_7DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_7D);

    }//GEN-LAST:event_Ghe_7DMouseClicked

    private void Ghe_8DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_8DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_8D);

    }//GEN-LAST:event_Ghe_8DMouseClicked

    private void Ghe_9DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_9DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_9D);

    }//GEN-LAST:event_Ghe_9DMouseClicked

    private void Ghe_10DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_10DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_10D);

    }//GEN-LAST:event_Ghe_10DMouseClicked

    private void Ghe_11DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_11DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_11D);

    }//GEN-LAST:event_Ghe_11DMouseClicked

    private void Ghe_12DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_12DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_12D);

    }//GEN-LAST:event_Ghe_12DMouseClicked

    private void Ghe_13DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_13DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_13D);

    }//GEN-LAST:event_Ghe_13DMouseClicked

    private void Ghe_14DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_14DMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_14D);

    }//GEN-LAST:event_Ghe_14DMouseClicked

    private void Ghe_15DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_15DMouseClicked

        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_15D);


    }//GEN-LAST:event_Ghe_15DMouseClicked

    private void Ghe_3EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_3EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_3E);

    }//GEN-LAST:event_Ghe_3EMouseClicked

    private void Ghe_4EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_4EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_4E);

    }//GEN-LAST:event_Ghe_4EMouseClicked

    private void Ghe_5EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_5EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_5E);

    }//GEN-LAST:event_Ghe_5EMouseClicked

    private void Ghe_6EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_6EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_6E);

    }//GEN-LAST:event_Ghe_6EMouseClicked

    private void Ghe_7EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_7EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_7E);

    }//GEN-LAST:event_Ghe_7EMouseClicked

    private void Ghe_8EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_8EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_8E);

    }//GEN-LAST:event_Ghe_8EMouseClicked

    private void Ghe_9EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_9EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_9E);

    }//GEN-LAST:event_Ghe_9EMouseClicked

    private void Ghe_10EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_10EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_10E);

    }//GEN-LAST:event_Ghe_10EMouseClicked

    private void Ghe_11EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_11EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_11E);

    }//GEN-LAST:event_Ghe_11EMouseClicked

    private void Ghe_12EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_12EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_12E);

    }//GEN-LAST:event_Ghe_12EMouseClicked

    private void Ghe_13EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_13EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_13E);

    }//GEN-LAST:event_Ghe_13EMouseClicked

    private void Ghe_14EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_14EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_14E);

    }//GEN-LAST:event_Ghe_14EMouseClicked

    private void Ghe_15EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_15EMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_15E);

    }//GEN-LAST:event_Ghe_15EMouseClicked

    private void Ghe_3FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_3FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_3F);

    }//GEN-LAST:event_Ghe_3FMouseClicked

    private void Ghe_4FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_4FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_4F);

    }//GEN-LAST:event_Ghe_4FMouseClicked

    private void Ghe_5FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_5FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_5F);

    }//GEN-LAST:event_Ghe_5FMouseClicked

    private void Ghe_6FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_6FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_6F);

    }//GEN-LAST:event_Ghe_6FMouseClicked

    private void Ghe_7FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_7FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_7F);

    }//GEN-LAST:event_Ghe_7FMouseClicked

    private void Ghe_8FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_8FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_8F);

    }//GEN-LAST:event_Ghe_8FMouseClicked

    private void Ghe_9FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_9FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_9F);

    }//GEN-LAST:event_Ghe_9FMouseClicked

    private void Ghe_10FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_10FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_10F);

    }//GEN-LAST:event_Ghe_10FMouseClicked

    private void Ghe_11FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_11FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_11F);

    }//GEN-LAST:event_Ghe_11FMouseClicked

    private void Ghe_12FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_12FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_12F);

    }//GEN-LAST:event_Ghe_12FMouseClicked

    private void Ghe_13FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_13FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_13F);

    }//GEN-LAST:event_Ghe_13FMouseClicked

    private void Ghe_14FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_14FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_14F);

    }//GEN-LAST:event_Ghe_14FMouseClicked

    private void Ghe_15FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ghe_15FMouseClicked
        this.xuLiSuKienClickVaMoBangNhapThongTin(Ghe_15F);

    }//GEN-LAST:event_Ghe_15FMouseClicked

    private void Xac_NhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xac_NhanActionPerformed
        // TODO add your handling code here:

//        this.khuHoi = true;

       if(this.ve == true){ 
                
                
                // chặn xác nhận khi không nhập đủ số lượng vé lúc đi
                if ((soGheNguoiLonDi != 0 ) || (soGheTreEmDi != 0) ){
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin vào số lượng vé đã chọn trước khi xác nhận!");
                }
                else {
                    
                ve = false;
                di = false;
          new GiaoDienChonChuyenBayVe(this.maSanBayDen, this.maSanBayDi, this.ngayVe, this.nguoiLonBanDau, this.treEmBanDau).setVisible(true); // looix k mở được chọn chuyến bay về khi truyền thamn số vào
          // khuHoi = false;
          
          
          //  changeColor(Color.RED);
           this.dispose();
       }
       
       }
       else {
//           changeColor(Color.RED);
//            System.out.println(this.khuHoi);
             // chặn xác nhận khi không nhập đủ số lượng vé lúc đi
            
            if(true == this.khuHoi){
                if((soGheTreEmVe !=0) || (soGheNguoiLonVe !=0) ){//|| (soGheTreEmVe!=0 || soGheNguoiLonVe!=0)
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin vào số lượng vé đã chọn trước khi xác nhận!");
            }
                else {
                new GiaoDienHoaDonHaiChieu(dsVeDi, dsVeVe).setVisible(true);
                this.dispose();
            }
            }
            else {
                if((soGheTreEmDi!=0) || (soGheNguoiLonDi!=0) ){//|| (soGheTreEmVe!=0 || soGheNguoiLonVe!=0)
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin vào số lượng vé đã chọn trước khi xác nhận!");
            }
            else {
                System.out.println("di mot chieu");
                new GiaoDienHoaDonMotChieu().setVisible(true);

                this.dispose();
            }
            }
        } 
    }//GEN-LAST:event_Xac_NhanActionPerformed

    private void Huy_Chon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Huy_Chon1ActionPerformed
                // TODO add your handling code here:
                
             if (di){
                 dsVeDi.removeAll(dsVeDi);
                 new GiaoDienChonChuyenBayDi(maSanBayDi, maSanBayDen, ngayDi, ngayVe, di, ve, khuHoi, nguoiLonBanDau, treEmBanDau).setVisible(true);
                 System.out.println("so nguoi lon va tre em ban dau" + nguoiLonBanDau + "-" +treEmBanDau);
                 this.dispose();
             }   
             else if (!ve && !di) {
                 dsVeVe.removeAll(dsVeVe);
                  new GiaoDienChonChuyenBayVe(maSanBayDen, maSanBayDi, ngayVe, nguoiLonBanDau, treEmBanDau).setVisible(true);
                  System.out.println("so nguoi lon va tre em ban dau" + nguoiLonBanDau + "-" +treEmBanDau);
                 this.dispose();
                 
             }
                
    }//GEN-LAST:event_Huy_Chon1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienChonGhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChonGhe().setVisible(true);
                // new GiaoDienChonGhe(xacNhan, ve).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ghe_10A;
    private javax.swing.JTextField Ghe_10B;
    private javax.swing.JTextField Ghe_10C;
    private javax.swing.JTextField Ghe_10D;
    private javax.swing.JTextField Ghe_10E;
    private javax.swing.JTextField Ghe_10F;
    private javax.swing.JTextField Ghe_11A;
    private javax.swing.JTextField Ghe_11B;
    private javax.swing.JTextField Ghe_11C;
    private javax.swing.JTextField Ghe_11D;
    private javax.swing.JTextField Ghe_11E;
    private javax.swing.JTextField Ghe_11F;
    private javax.swing.JTextField Ghe_12A;
    private javax.swing.JTextField Ghe_12B;
    private javax.swing.JTextField Ghe_12C;
    private javax.swing.JTextField Ghe_12D;
    private javax.swing.JTextField Ghe_12E;
    private javax.swing.JTextField Ghe_12F;
    private javax.swing.JTextField Ghe_13A;
    private javax.swing.JTextField Ghe_13B;
    private javax.swing.JTextField Ghe_13C;
    private javax.swing.JTextField Ghe_13D;
    private javax.swing.JTextField Ghe_13E;
    private javax.swing.JTextField Ghe_13F;
    private javax.swing.JTextField Ghe_14A;
    private javax.swing.JTextField Ghe_14B;
    private javax.swing.JTextField Ghe_14C;
    private javax.swing.JTextField Ghe_14D;
    private javax.swing.JTextField Ghe_14E;
    private javax.swing.JTextField Ghe_14F;
    private javax.swing.JTextField Ghe_15A;
    private javax.swing.JTextField Ghe_15B;
    private javax.swing.JTextField Ghe_15C;
    private javax.swing.JTextField Ghe_15D;
    private javax.swing.JTextField Ghe_15E;
    private javax.swing.JTextField Ghe_15F;
    private javax.swing.JTextField Ghe_1A;
    private javax.swing.JTextField Ghe_1B;
    private javax.swing.JTextField Ghe_1C;
    private javax.swing.JTextField Ghe_1D;
    private javax.swing.JTextField Ghe_1E;
    private javax.swing.JTextField Ghe_1F;
    private javax.swing.JTextField Ghe_2A;
    private javax.swing.JTextField Ghe_2B;
    private javax.swing.JTextField Ghe_2C;
    private javax.swing.JTextField Ghe_2D;
    private javax.swing.JTextField Ghe_2E;
    private javax.swing.JTextField Ghe_2F;
    private javax.swing.JTextField Ghe_3A;
    private javax.swing.JTextField Ghe_3B;
    private javax.swing.JTextField Ghe_3C;
    private javax.swing.JTextField Ghe_3D;
    private javax.swing.JTextField Ghe_3E;
    private javax.swing.JTextField Ghe_3F;
    private javax.swing.JTextField Ghe_4A;
    private javax.swing.JTextField Ghe_4B;
    private javax.swing.JTextField Ghe_4C;
    private javax.swing.JTextField Ghe_4D;
    private javax.swing.JTextField Ghe_4E;
    private javax.swing.JTextField Ghe_4F;
    private javax.swing.JTextField Ghe_5A;
    private javax.swing.JTextField Ghe_5B;
    private javax.swing.JTextField Ghe_5C;
    private javax.swing.JTextField Ghe_5D;
    private javax.swing.JTextField Ghe_5E;
    private javax.swing.JTextField Ghe_5F;
    private javax.swing.JTextField Ghe_6A;
    private javax.swing.JTextField Ghe_6B;
    private javax.swing.JTextField Ghe_6C;
    private javax.swing.JTextField Ghe_6D;
    private javax.swing.JTextField Ghe_6E;
    private javax.swing.JTextField Ghe_6F;
    private javax.swing.JTextField Ghe_7A;
    private javax.swing.JTextField Ghe_7B;
    private javax.swing.JTextField Ghe_7C;
    private javax.swing.JTextField Ghe_7D;
    private javax.swing.JTextField Ghe_7E;
    private javax.swing.JTextField Ghe_7F;
    private javax.swing.JTextField Ghe_8A;
    private javax.swing.JTextField Ghe_8B;
    private javax.swing.JTextField Ghe_8C;
    private javax.swing.JTextField Ghe_8D;
    private javax.swing.JTextField Ghe_8E;
    private javax.swing.JTextField Ghe_8F;
    private javax.swing.JTextField Ghe_9A;
    private javax.swing.JTextField Ghe_9B;
    private javax.swing.JTextField Ghe_9C;
    private javax.swing.JTextField Ghe_9D;
    private javax.swing.JTextField Ghe_9E;
    private javax.swing.JTextField Ghe_9F;
    private javax.swing.JButton Huy_Chon;
    private javax.swing.JButton Huy_Chon1;
    private javax.swing.JButton Xac_Nhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_ThongTinNguoiBay;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
