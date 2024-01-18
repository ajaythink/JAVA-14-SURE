import java.util.*;

class SortArray {
    public static void main(String[] args) {
        int arr[] ={5,2,5,2,56,7,1,9};
        Arrays.sort(arr);
        for(int e: arr){
            // System.out.print(e+ " ");
        }
        int newarr[]= new int[5];
        Arrays.fill(newarr,-1);
        for(int e:newarr){
            // System.out.print(e+" ");
        }

        int copyArr[]= Arrays.copyOf(arr, arr.length);
        for(int e:copyArr){
            System.out.print(e+" ");
        }
        System.out.println();
        Arrays.fill(arr, 9);
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
        for(int e:copyArr){
            System.out.print(e+" ");
        }

    }
    
}