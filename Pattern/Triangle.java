public class Triangle{
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int j=0; j<=n; j++){
            for(int i=n; i>j; i--){
                System.out.print("*");
            }
            System.out.println();
        }

        // *************second********
        int x = 8;
          int j = 0;
        for(int i=x; i>0; i--){

            for(j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int a=0; a<=x-i; a++){
                System.out.print("*");
            }           
            System.out.println();
        }
        for(int i=x; i>0; i--){
            for(int a=0; a<=x-i; a++){
                System.out.print(" ");
            }
            for(j=0; j<i; j++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}