import org.springframework.stereotype.Component;

@Component
public class CompoundInterestCalculator {

    private static SimpleInterestCalculator simpleInterestCalculator;

    public CompoundInterestCalculator(SimpleInterestCalculator simpleInterestCalculator){
        this.simpleInterestCalculator = simpleInterestCalculator;
    }

    public float calculate(float principle, int months, float roiPerMonth, int calcPeriod){
        int intCalIterations = months / calcPeriod;
        float totalInterest = 0.0f;
        for (int i = 0; i < intCalIterations; i++) {
            float interest = simpleInterestCalculator.calculate(principle, calcPeriod, roiPerMonth);
            totalInterest = totalInterest + interest;
            principle = principle + interest;
        }
        return totalInterest;
    }

}
