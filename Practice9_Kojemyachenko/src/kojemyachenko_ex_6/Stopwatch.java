package kojemyachenko_ex_6;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch () {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0; // Сбрасываем endTime
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        Thread.sleep(2000);
        stopwatch.stop();
        System.out.println("Прошедшее время: " + stopwatch.getElapsedTime() + " ms");
    }
}
