public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 55;
        double growth = 1.65;
        double bmi = service.calculate(weight, growth);
        System.out.println("BMI: "  + bmi);

    }
}
