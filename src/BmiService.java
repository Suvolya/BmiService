public class BmiService {

    double bmi;

    public double calculate(double weight, double growth) {
        bmi = weight / (growth * growth);
        return bmi;
    }
}