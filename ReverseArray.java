public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int right = arr.length-1;
        int left = 0;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}