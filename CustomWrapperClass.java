class Max{
    int max = 0;
    int size = 0;
    public void insert(int x){
        this.size++;
        if(x <= max){
            return ;
        }
        max = x;
    }
public int top() {
    return max;
}
public int getSize(){
    return size;
}
}
class CustomWrapperClass{
    public static void main(String ar[]){
        Max p = new Max();
        p.insert(13);
        p.insert(12);
        p.insert(42);
        p.insert(2);
        System.out.println("max element: " +p.top());
        System.out.println("Inserted element" +p.getSize());
    }
}