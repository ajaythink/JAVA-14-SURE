
class PascalTrangle {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1; i<=row; i++){
            for(int j=1; j<= row-i; j++){
                System.out.print (" ");
            }
            int num = 1;
            for(int j=0; j<=i; j++){
                System.out.print (num +" ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }
    }
    
}