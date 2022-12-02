class Parents{
    int x;
    Parents(){
        System.out.println("This is Parents");
    }
    Parents(int x){
        this.x=x;
        System.out.println("This is Parents "+x);
    }
}
class Child1 extends Parents{
    int y;
    Child1(){
        super(7);
        System.out.println("This is Child1");
    }
    Child1(int x,int y){
        super(x);
        this.x=x;
        this.y=y;
        System.out.println("This is Child1 "+x+" "+y);
    }
}
class Child2 extends Child1 {
    int z;
    Child2(){
        System.out.println("This is Child2");
    }
    Child2(int x,int y,int z){
        super(x,y);
        this.x=x;
        this.y=y;
        this.z=z;
        System.out.println("This is Child2 "+x+" "+y+" "+z);
    }
}
public class InheritanceFinalConcept  {
    public static void main(String[] args) {
        Child2 obj1=new Child2(1,2,3);
    }
}
