package behavioral.observer.DerekB;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by fuxinyu on 2/12/16.
 */
public class TestMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService =
                Executors.newScheduledThreadPool(5);

        ScheduledFuture scheduledFuture =
                scheduledExecutorService.schedule(
                        new Callable() {
                            public Object call() throws Exception {
                                System.out.println("Executed!");
                                return "Called!";
                            }
                        }, 5, TimeUnit.SECONDS);
        System.out.println("something1");
        System.out.println("result = " + scheduledFuture.get());
        System.out.println("something");
        scheduledExecutorService.shutdown();
    }
}
