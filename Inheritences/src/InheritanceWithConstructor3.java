class Base1{
    int x;
    Base1(){
        System.out.println("This is Base1");
    }
    Base1(int x){
        this.x=x;
        System.out.println("This is Base1 "+x);
    }
}
class Base2 extends Base1{
    int y;
    Base2(){
        super(7);
        System.out.println("This is Base2");
    }
    Base2(int x,int y){
        super(x);
        this.x=x;
        this.y=y;
        System.out.println("This is Base2 "+x+" "+y);
    }
}
public class InheritanceWithConstructor3  {
    public static void main(String[] args) {
        Base2 obj1=new Base2(5,9);
    }
}
