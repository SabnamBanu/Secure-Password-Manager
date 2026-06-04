package self_practice;

class MyThread3 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class ThreadUsingRunnable {
    public static void main(String[] args){
        MyThread3 obj1 = new MyThread3();
        MyThread3 obj2 = new MyThread3();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
