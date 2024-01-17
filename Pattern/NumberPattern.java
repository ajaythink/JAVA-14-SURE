public class NumberPattern{
    public static void main(String[] args) {
        int row = 5;
        int k = 0;
        for(int i=1; i<=row; i++){
            k = i;
            for(int j=1; j<=i; j++){                
                System.out.print(k++ +" ");
            }            
            System.out.println();
        }
    }
}