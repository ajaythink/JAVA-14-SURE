
//move all zero's to the end of the array .Write a code for it
// the array is [6,0,3,2,4,1,3,5,0,6,0,2,0,4] and also print the sum of the arrays
class MoveZero {
    public static void main(String[] args) {
        int arr[] = { 6, 0, 3, 2, 4, 1, 3, 5, 0, 6, 0, 2, 0, 4 };
        int sum = 0;
        int n = arr.length;
        int k = 0;
        int l = n - 1;
        int endZero[] = new int[n];
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (arr[i] != 0) {
                endZero[k] = arr[i];
                k++;
            } else {
                endZero[l--] = 0;
            }
        }
        System.out.println("Total sum of the Array:  " + sum);
        for (int a : endZero) {
            System.out.print(a + " ");
        }

    }
}