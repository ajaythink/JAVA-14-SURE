class AddMatrix{
    public static void main(String[] args){
        int a[][] ={{2,3,4}, {4,5,6}, {7,8,9}};
        int b[][] ={{7,8,9}, {4,5,6}, {2,3,4}};
        int c[][] = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int []r: c){
            for(int e: r){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    
    }
}