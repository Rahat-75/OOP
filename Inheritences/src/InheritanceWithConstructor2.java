class Base{
    int x;
    Base(){
        System.out.println("This is Base Constructor");
    }
    Base(int x){
        this.x=x;
        System.out.println("This is Base "+x);
    }
}
class Base0 extends Base{
    int y;
    Base0(){
        super(7);
        System.out.println("This is Base0 Constructor");
    }
    Base0(int y){
        this.y=y;
        System.out.println("This is Base0 "+y);
    }
}
public class InheritanceWithConstructor2  {
    public static void main(String[] args) {
        Base0 obj1=new Base0(5);
    }
}

/*Output=
        This is Base Constructor
        This is Base0 5*/
