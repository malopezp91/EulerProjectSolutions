package project_euler;

import org.junit.Assert;
import org.junit.Test;

public class Problem1_Test {

    @Test
    public void testProblem1_10() {
        Assert.assertEquals(23, Problem1.multiplesOf3And5(10));
    }

    @Test
    public void testProblem1_1000() {
        Assert.assertEquals(233168, Problem1.multiplesOf3And5(1000));
    }

    @Test
    public void testProblem1_stream_10() {
        Assert.assertEquals(23, Problem1.multipleOf3And4_streams(10));
    }

    @Test
    public void testProblem1_stream_1000() {
        Assert.assertEquals(233168, Problem1.multipleOf3And4_streams(1000));
    }
}
