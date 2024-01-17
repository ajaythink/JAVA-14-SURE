class AnanumsArray {;
    static int[] printarr(int []arr){
        int k = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = k++;
        }
        return arr;
        // for(int i:arr){
        //     System.out.print (i+" ");
        // }
    }
    public static void main(String[] args) {

    // printarr(new int[5]);
    int newarr[] = printarr(new int[5]);
    for(int i: newarr){
        System.out.print(i+" ");
    }
    int boleanArr = new boolean[9];
    System.out.println(newarr.getClass().getName());
    System.out.println(boleanArr.getClass().getName());
}
}
