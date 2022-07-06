public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex ();
        float x = 75;
        float y = 1.8F;
        // х - масса тела,кг, y - рост,м.
        float bodyMassIndex = service.calculate(x,y);
        System.out.println(bodyMassIndex);

    }
}
