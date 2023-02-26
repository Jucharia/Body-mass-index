public class BmiService {
    public int calculate(double weight, double height) {
        double result;
        double degree = 2;
        double exponentiation = Math.pow(height, degree); // возведение числа в квадрате(рост)
        result = weight / exponentiation;
        int totalResult = (int) result;
        return totalResult;

    }
}
