import java.util.Scanner;
class JaggedArray{
    public static void main(String[] args){
        int arr[][] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[2];
        arr[2] = new int[5];
        Scanner sc = new Scanner (System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing the array");
        for(int row[]: arr){
            for(int e: row){
                System.out.println();
            }
            System.out.println();
            
        }


    }
}