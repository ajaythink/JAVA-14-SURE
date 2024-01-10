public class GradeCal{
    public static void main(String[] args) {
        int mark = 90;
        if(mark <= 33){
            System.out.println("fail");
        }
        else if(mark > 33 && mark<50){
            System.out.println("Grade c");
        }
        else if( mark > 50 && mark<70){
            System.out.println("Grade B");
        }
        else if(mark > 70 && mark<90){
            System.out.println("Grade A");
        }
        else{
            System.out.println("Excelent");
        }
    }
}