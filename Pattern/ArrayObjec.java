class Student{
    int rollNo;
    String name;
    String village;
    String city;    
    Student(int r,String n, String v, String c){
        this.rollNo = r;
        this.name = n;
        this.village = v;
        this.city = c;
    }
}
public class ArrayObjec{
    public static void main(String []aregs){
        Student s[] = new Student[5];
        s[0] = new Student(1,"Ajay", "Bhopal", "Bhopal");
        s[1] = new Student(2,"Mohan", "Delhi", "Bhopal");
        s[2] = new Student(3,"Shohan", "Bhopal", "Bhopal");
        s[3] = new Student(4,"Sundar", "Mumbai", "Bhopal");
        s[4] = new Student(5,"Modi", "Bhopal", "Bhopal");

        for(int i=0; i<s.length; i++){
            System.out.println("Roll No: "+ s[i].rollNo  +", Name: "+s[i].name  +", Village: "+s[i].village  +", City: "+s[i].city);
        }

    }
}