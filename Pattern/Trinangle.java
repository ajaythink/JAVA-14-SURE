
class Trinangle {
    public static void main(String[] args) {
        int row = 5;
        for(int i=1; i<=row; i++){
            for(int j=1; j<= row-i; j++){
                System.out.print (" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(i==0 || i==2*i-1 )
                System.out.print ("*");
            }
            System.out.println();
        }
        for(int i=row; i>=0; i--){
            for(int j=1; j<= row-i; j++){
                System.out.print (" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print ("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=row; i>=0; i--){
            for(int j=1; j<= row-i; j++){
                System.out.print (" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print ("*");
            }
            System.out.println();
        }
        for(int i=1; i<=row; i++){
            for(int j=1; j<= row-i; j++){
                System.out.print (" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print ("*");
            }
            System.out.println();
        }

    }

}