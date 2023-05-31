import java.net.IDN;
import java.sql.SQLOutput;

public class SinhVien {
    private int ID;
    private String HoTen = "";
    private float DiemLT;
    private float DiemTH;
    public SinhVien(){
    }
    public SinhVien(int ID,String HoTen,float DiemLT,float DiemTH){
        this.ID = ID;
        this.HoTen = HoTen;
        this.DiemLT = DiemLT;
        this.DiemTH = DiemTH;
    }
    public int getID(){
        return ID;
    }
    public String getHoTen(){
        return HoTen;
    }
    public float getDiemLT(){
        return DiemLT;
    }
    public float getDiemTH(){
        return DiemTH;
    }
    public void setID(int ID){
        this.ID = Math.max(ID, 0);
    }
    public void setHoTen(String HoTen){
       if(HoTen.length() == 0){
           this.HoTen = "Nhờ Ghi Tên Dùm";
       }else this.HoTen = HoTen;
    }
    public void setDiemLT(float DiemLT){
        if(DiemLT <= 0 || DiemLT > 10){
            this.DiemLT = 0;
        }else this.DiemLT = DiemLT;
    }
    public void setDiemTH(float DiemTH){
        if(DiemTH <= 0 || DiemTH > 10){
            this.DiemLT = 0;
        }else this.DiemTH = DiemTH;
    }

    @Override
    public String toString() {
        float DiemTB = (DiemLT + DiemTH) / 2;
        return "ID : " + ID + "\n" +
                "Họ Tên : " + HoTen + "\n" +
                "Điểm Lý Thuyết : " + DiemLT + "\n" +
                "Điểm Thực Hành : " + DiemTH + "\n" +
                "Điểm Trung Bình : " + DiemTB;

    }
}
