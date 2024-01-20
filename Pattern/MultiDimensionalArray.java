import java.util.*;
class MultiDimensionalArray{
    public static void main(String[] args){
        int [][]arr= new int[2][3];
        int [][]arr1 = {{2,3,4,5,6},
                        {4,3,2,5,5} };
        Scanner sc= new Scanner(System.in);
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