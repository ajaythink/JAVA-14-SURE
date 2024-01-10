public class BasicIf{
    public static void main(String[] args){
        // int a = 9;
        // if(a % 2 == 0){
        //     System.out.println("even");
        // }
        int year = 2024;
        if((year%4 == 0) &&(year%100 != 0) || (year%400 == 0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}