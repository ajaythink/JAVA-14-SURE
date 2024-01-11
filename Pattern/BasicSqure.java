import java.util.*;
// Pascal tangle
public class BasicSqure{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}