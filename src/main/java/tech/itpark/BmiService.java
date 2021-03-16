package tech.itpark;

public class BmiService {
    public float calculate(int weight, float height) {
        int percent = 100 * 100;
        float coefficient = (float) (weight * percent / (height * height));
        return coefficient;
    }
}