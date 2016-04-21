package test;

import main.ImperativeReduceExample;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImperativeReduceExampleTest {

    @Test
    public void testImperativeReduceSumsNumbers() {
        ImperativeReduceExample example = new ImperativeReduceExample();

        int sum = example.sum(new int[] {1, 2, 3, 4, 5} );

        assertEquals(15, sum);
    }
}
