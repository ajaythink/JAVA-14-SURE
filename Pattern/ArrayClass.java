public class ArrayClass{
    public static void main(String[] args){
        int []arr = {4,2,6,7,3,7,2,9};
        System.out.println("Original array");
        for(int a: arr){
            System.out.print (a+" ");
        }

        System.out.println("Clone Array");
        int cloneArr[] = arr.clone();
        for(int i: cloneArr){
            System.out.print (i+" ");
        }
        System.out.println(arr == cloneArr);
        
    }
}