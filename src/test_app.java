import java.util.Random;

public class test_app {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        System.out.println("Random number generator started...");

        while (true) {
            int number = random.nextInt(100); // число от 0 до 99
            System.out.println("Generated number: " + number);

            Thread.sleep(1000); // пауза 1 секунда
        }
    }
}
