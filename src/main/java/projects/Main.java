package projects;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MyBenchmark myBenchmark = new MyBenchmark();
        myBenchmark.setup();
        myBenchmark.testMethod();
        myBenchmark.testMethod();
    }
}
