public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Float weight = 98.0f; // Вес (кг)
        float height = 1.87f; // Рост (м)
        float bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: " + (int) bmi);
    }
}