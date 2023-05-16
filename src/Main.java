public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // рост в метрах
        double weight = 98;   // вес в килограммах

        int bodyMassIndex = service.calculate(height, weight); // должно получиться 28
        System.out.println("Ваш индекс массы тела = " + bodyMassIndex);
    }
}