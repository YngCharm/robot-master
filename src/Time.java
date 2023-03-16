import java.util.TimerTask;
import java.util.Timer;

public class Time {
    Timer timer = new Timer();
    TimerTask task = new TimerTask() {

        @Override
        public void run() {
            System.out.println("Уборка окончена");
            task.cancel();
        }
    };

    public void goFirst() throws InterruptedException {
        System.out.println("Начало уборки");
        timer.schedule(task, 5000);

        task = new TimerTask() {

            public void run() {
                System.out.println("Уборка окончена");
                timer.cancel();
            }
        };
        timer.scheduleAtFixedRate(task, 5000, 1);
    }
}
