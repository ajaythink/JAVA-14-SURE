public class PrimeNumber{
    public static void main(String args[]){
        int rangeA = 2;
        int rangeB = 50;
        for(int i=rangeA; i<=rangeB; i++){
            if(i % 2 != 0 ){
                for(int j=2; j<i/2; j++){
                    if(i%j != 0)
                    System.out.println(i);
                }
            }
        }
    }
}