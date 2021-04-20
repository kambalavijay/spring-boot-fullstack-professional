import org.springframework.stereotype.Component;

@Component
public class SimpleInterestCalculator {

    public float calculate(float principle, int months, float roiPerMonth){
        return (float) ((principle * months * roiPerMonth) / 100);
    }
}
