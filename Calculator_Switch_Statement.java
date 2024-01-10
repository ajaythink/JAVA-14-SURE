import java.util.Scanner;

public class Calculator_Switch_Statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first");
        int a = 5;
        System.out.println("enter second");
        int b =8;
        char symbole = '*';
        int operation = 0;

        switch (symbole) {
            case '+':
                operation = a + b;
                System.out.println(operation);                
                break;

            case '-':
                operation = a - b;
                System.out.println(operation);                
                break;
            case '*':
                operation = a * b;
                System.out.println(operation);                
                break;
        
            default:
                    System.out.println("Invalid");
                break;
        }
    }
}