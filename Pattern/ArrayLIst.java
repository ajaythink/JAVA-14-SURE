import java.util.*;

class ArrayLIst{
    public static void main(String[] args){
        // ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hS = new HashSet<>();
        int arr[] = {10,20, 30, 30, 20, 50, 90};
        for(int e: arr){
            hS.add(e);
        }
        System.out.print(hS+" ");
        ArrayList<Integer> list = new ArrayList<>(hS);
        System.out.println(hS+" ");
        int x = 3, y=5, z=10;
        int ans = ++z + y - y + z + x++;
        System.out.println(ans);

        char charr [] = new char[10];
        for(int i=0; i<10; ++i){
            charr[i]='i';
            System.out.print(charr[i]+" ");
        }

        int ar1 []= {0,1,2,3,4,5,6,7,8,9};
        int n = 6;
        n=ar1[ar1[n]/2];
        System.out.println(ar1[n]/2);
    }
}