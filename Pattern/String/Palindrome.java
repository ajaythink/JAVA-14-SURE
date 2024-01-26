class Palindrome{
    static boolean isPalidrome(String a){
        int left = 0;
        int right = a.length()-1;
        while(left<= right){
            if(a.charAt(left) != a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "madama";
        if(isPalidrome(s)){
            System.out.print("This a palindrome");
        }else{
            System.out.print("This a not palindrome");
        }        
    }
}