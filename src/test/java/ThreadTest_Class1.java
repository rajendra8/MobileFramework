import Util.InitiatDriver;
import org.junit.Test;

public class ThreadTest_Class1 {


    InitiatDriver initiatDriver = new InitiatDriver();
    StartAppium startAppium =new StartAppium();
    StartAppium_2 startAppium_2 = new StartAppium_2();


    public static void main(String[] args) {
        Thread thread1 = new Thread("startAppium");
        Thread thread2 = new Thread("startAppium_2");
        thread1.start();
       String thread=   thread1.getState().toString();
        System.out.println(thread);
        thread2.start();
    }





}
