package self_practice;

class MyThread1 extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Thread1: "+i);
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("Thread2: "+i);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

    }
}
