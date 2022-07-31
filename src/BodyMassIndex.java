public class BodyMassIndex {
    public float calculate(float bodyWeight, float height) {
        float heightSquared = height * height;
        float result = bodyWeight / heightSquared;
        return result;
    }
}
