public class BmiService {
    public int calculate(double weight, double height) {
        double x;
        double y = 2;
        double z = Math.pow(height, y); // возведение числа в квадрате(рост)
        x = weight / z;
        int result = (int) x;
        return result;

    }
}
