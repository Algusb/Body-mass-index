public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        float bodyWeight = 86;
        float height = 1.7F;
        float bodyMassIndex = service.calculate(bodyWeight, height);
        System.out.println(bodyMassIndex);

    }
}
