class TaskCounter extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task Count: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class TaskManager {
    public static void main(String[] args) {
        TaskCounter counter = new TaskCounter();
        counter.start();
    }
}