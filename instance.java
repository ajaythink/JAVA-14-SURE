class subinstance{
    String name = "Ajay";
}
public class instance{
    String name = "Kumar";
     void changename(){
        this.name="arpit";
    }

    public static void main(String []a ){
        instance i = new instance();
        instance s =  new instance();
        subinstance b =new subinstance();
        i.changename();
        System.out.println(i.name);
        System.out.println(b.name);
        System.out.println(s.name);
    }
}