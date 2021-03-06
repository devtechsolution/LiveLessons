import utils.AsyncTester;

/**
 * This example shows how to apply Project Reactor features
 * synchronously to reduce and display BigFractions via basic
 * Mono operations, including fromCallable(), map(), doOnSuccess(),
 * and then().
 */
@SuppressWarnings("StringConcatenationInsideStringBufferAppend")
public class ex1 {
    /**
     * Main entry point into the test program.
     */
    public static void main (String[] argv) throws InterruptedException {
        // Test synchronous BigFraction reduction using a mono and a
        // pipeline of operations that run on the calling thread.
        AsyncTester.register(MonoEx::testFractionReductionSync1);

        // Test synchronous BigFraction reduction using a mono and a
        // pipeline of operations that run on the calling thread.
        // Combines the mono with Java functional programming
        // features.
        AsyncTester.register(MonoEx::testFractionReductionSync2);

        @SuppressWarnings("ConstantConditions")
        long testCount = AsyncTester
            // Run all the tests.
            .runTests()

            // Block until all the tests are done to allow future
            // computations to complete running.
            .block();

        // Print the results.
        System.out.println("Completed " + testCount + " tests");
    }
}
