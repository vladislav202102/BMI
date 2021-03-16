package tech.itpark;

import tech.itpark.BmiService;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float coefficient = service.calculate(70, 193);
        System.out.println(coefficient);
    }
}