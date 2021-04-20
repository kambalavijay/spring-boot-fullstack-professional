import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.util.Assert;

@RunWith(MockitoJUnitRunner.Silent.class)
public class CompoundInterestCalculatorTest {

    @Mock
    private SimpleInterestCalculator simpleInterestCalculator;
    private CompoundInterestCalculator compoundInterestCalculator;

    @Before
    public void setUp(){
        compoundInterestCalculator = new CompoundInterestCalculator(simpleInterestCalculator);
    }

    @Test
    public void calculate() {
        Mockito.when(simpleInterestCalculator.calculate(10000.0f, 3, 2.0f)).thenReturn(600.0f);
        Mockito.when(simpleInterestCalculator.calculate(10600.0f, 3, 2.0f)).thenReturn(636.0f);
        float interest = compoundInterestCalculator.calculate(10000.0f, 6, 2, 3);
        Assert.isTrue(interest == 1236.0f);
    }

}