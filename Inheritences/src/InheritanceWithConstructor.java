class Box2{
    int x;
    Box2(){
        System.out.println("This is Box2 Constructor");
    }
    Box2(int x){
        this.x=x;
        System.out.println("This is Box2 "+x);
    }
}
class Box3 extends Box2{
    int y;
    Box3(){
        super(7);
        System.out.println("This is Box3 Constructor");
    }
}
public class InheritanceWithConstructor  {
    public static void main(String[] args) {
        Box3 obj1=new Box3();
    }
}
