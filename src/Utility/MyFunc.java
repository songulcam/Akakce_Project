package Utility;

public class MyFunc {
    public static void Wait(int sc){
        try {
            Thread.sleep(sc*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
