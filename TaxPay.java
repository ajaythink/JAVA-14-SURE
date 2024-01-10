public class TaxPay {

    public static void main(String[] args) {
        int salary = 1200000;
        int taxAbleAmt = 1200000 - 500000;
        double tax = 0;
        if(salary <= 500000){
            System.out.println("No need to Pay Tax: "+ tax);
        }
        else if(salary > 500000 && salary <= 700000){
             tax = taxAbleAmt * 0.2;
            System.out.println("Based on Your salary, gov tax it will be: "+ tax);
        }
        else{
            tax = taxAbleAmt * 0.5;
            System.out.println("Based on Your salary, gov tax it will be: "+ tax);
        }
    }
}