package secondexeercise;

public class PerformanceTest {
    public static void main(String[] args) {
        final int iterations = 10000;
        final String appendStr = "AIET";

        // Test StringBuffer performance
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendStr);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Test StringBuilder performance
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendStr);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");

        // Justification
        if (durationBuilder < durationBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer for this operation.");
        } else if (durationBuilder > durationBuffer) {
            System.out.println("StringBuffer is faster than StringBuilder for this operation.");
        } else {
            System.out.println("Both took the same time.");
        }
    }
}
