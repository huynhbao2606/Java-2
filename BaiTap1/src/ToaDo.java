public class  ToaDo {
    private int x;
    private int y;
    public ToaDo(){

    }
    public ToaDo(int x, int y, String tenToaDo){
        this.x = x;
        this.y = y;
    }

    public ToaDo(int i, int i1) {
    }

    public int setX(int x){
        return this.x;
    }
    public int setY(int y){
        return this.y;
    }
    public int getY(){
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "ToaDo{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
