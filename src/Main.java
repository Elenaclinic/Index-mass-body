public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 81;
        double height = 1.66;
        double index = service.calculate(weight / (height * height));
        System.out.println(index);
    }
}