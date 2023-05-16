public class BmiService {
    public int calculate(double height, double weight) {
        double index;
        index = weight / (height * height);
        return (int) index;
    }
}
