public class CalculateExecutionTime {
    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        // =========== program

        Thread.sleep(3000);


        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");

    }
}
