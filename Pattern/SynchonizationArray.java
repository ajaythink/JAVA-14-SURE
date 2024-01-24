import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchonizationArray {
    private static void incrementer(ArrayList<Integer> unsafeArray){
        synchonize(unsafeArray);
        for(int i=0; i<unsafeArray.size(); i++){
            int value = unsafeArray.get(i);
            unsafeArray.set(i,value+1);
        }
    }
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Integer> unsafeArray = new ArrayList<>();
        unsafeArray.add(1);
        unsafeArray.add(2);
        unsafeArray.add(3);
        unsafeArray.add(4);
        unsafeArray.add(5);

        ExecutorService excutorService = Executors.newFixedThreadPool(10);
        //Runable task
        Runnable task = ()->{
            incrementer(unsafeArray);
        };
        for(int i=0; i<100; i++){
            excutorService.submit(task);
        }
        excutorService.shutdown();
        excutorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(unsafeArray);
    }
}