public class LeftRotate{
    public static void main(String[] args){
        int arr[] = {3,4,5,6,7,8};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println("Rotate Array");
        arr[arr.length-1] = temp;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}