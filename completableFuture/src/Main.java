import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("Alternate Thread.");
            return "Future Complete";
        });
        try {
            Thread.sleep(1000);
            System.out.println("After sleep.");
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
