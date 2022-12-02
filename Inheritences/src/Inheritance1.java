class Box{
    int x;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
}
class Box1 extends Box{
    int y;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
public class Inheritance1  {
    public static void main(String[] args) {
        Box obj=new Box();
        Box1 obj1=new Box1();
        obj.setX(5);
        obj1.setY(7);
        obj1.setX(8);
        System.out.println(obj.getX());
        System.out.println(obj1.getY());
        System.out.println(obj1.getX());
    }
}
