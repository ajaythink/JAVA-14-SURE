class RightRotate {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9};
        int len = arr.length;
        int temp = arr[len-1];
        for(int e: arr){
            System.out.print(e + " ");
        }
        System.out.println();

        for(int i=len-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0]=temp;
        for(int e: arr){
            System.out.print(e + " ");
        }
    }    
}