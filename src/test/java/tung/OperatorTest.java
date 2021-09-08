package tung;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperatorTest {

    @Test
    public void shouldReturnSumWhenAddTwoNumber() {
        assertEquals(3, Operator.add(1, 2));
        assertEquals(5, Operator.add(2, 3));
    }
}
