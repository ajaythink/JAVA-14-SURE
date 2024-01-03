public class better {
    static int a = 10;
    static void helper(){
        int b = 32;
        System.out.print(a+ " " +b );
        a++;
        b++;
        System.out.println();
    }
    public static void main(String ar[]){
        helper();
        helper();
        helper();
    }
}
