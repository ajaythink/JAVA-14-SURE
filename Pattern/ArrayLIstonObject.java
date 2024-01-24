import java.util.ArrayList;

/**
 * ArrayLIstonObject
 */
class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class ArrayLIstonObject {

    public static void main(String[] args) {
        ArrayList<Integer> s= new ArrayList<>();
        s.add(new Student("Ajay", 21));
        s.add(new Student("Aman", 20));
        s.add(new Student("Prince", 22));
        s.add(new Student("Anirudh", 5));
        s.add(new Student("Ajay", 21));

        s.forEach(e->{
            System.out.println("name: "+e.getname()+ " Age: "+e.getage());
        });
        // Interator it = s.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
    }
}