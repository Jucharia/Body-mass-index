public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 62; // масса тела в кг
        double height = 1.55; //рост в м
        int bmi = service.calculate(weight, height); // индекс получается 25
        System.out.println(bmi);
    }
}