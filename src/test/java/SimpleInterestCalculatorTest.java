import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SimpleInterestCalculatorTest {

    private final static SimpleInterestCalculator simpleInterestCalculator = new SimpleInterestCalculator();

    @Test
    void calculate() {
        float interest = simpleInterestCalculator.calculate(10000, 12, 2);
        Assert.assertTrue(interest == 2400.0f);
    }
}
