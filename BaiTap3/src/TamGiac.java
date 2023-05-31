public class TamGiac {
    private float ma;
    private float mb;
    private float mc;
    public TamGiac(){

    }
    public TamGiac(float ma,float mb,float mc){
        if(kiemTraTamGiac(ma, mb, mc)){
            this.ma = ma;
            this.mb = mb;
            this.mc = mc;
        }else {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
        }
    }
    public float getMa(){
        return ma;
    }
    public float getMb(){
        return mb;
    }
    public float getMc(){
        return mc;
    }
    public void setMa(float ma){
        if(ma > 0){
            this.ma = ma;
        }
    }
    public void setMb(float mb){
        if(mb > 0){
            this.mb = mb;
        }
    }
    public void setMc(float mc){
        if(mc > 0){
            this.mc = mc;
        }
    }
    public boolean kiemTraTamGiac(float ma, float mb, float mc) {
        return ma > 0 && mb > 0 && mc > 0 && ma + mb >= mc && mc + mb >= ma && ma + mc >= mb;
    }
    public float chuVi(){
        return (this.ma + this.mb + this.mc) / 2;
    }
    public float tinhDienTich() {
        float chuVi = chuVi();
        return (float) Math.sqrt(chuVi * (chuVi - ma)  * (chuVi - mb) * (chuVi - mc));
    }
    public String thongTinTamGiac() {
        if (kiemTraTamGiac(ma, mb, mc)) {
            if (ma == mb && mb == mc) {
                return "Tam Giác Đều";
            } else if (ma == mb || ma == mc || mb == mc) {
                return "Tam Giác Cân";
            } else {
                return "Tam Giác Thường";
            }
        }
            return "Không Phải Tam Giác";
    }

    @Override
    public String toString() {
        return "Ma = " + ma + "\n" + "Mb = " + mb + "\n" + "Mc = " + mc + "\n" + "Chu Vi = " + chuVi() + "\n" + "Diện Tích = " + tinhDienTich() + "\n" + "Thông Tin Tam Tác : " + thongTinTamGiac() + "\n";
    }
}
