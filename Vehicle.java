public class Vehicle {

    public Vehicle() {
        // Empty constructor
    }

    public void testSpeed(int speed) throws TooFastException {
        if (speed > 90) {
            throw new TooFastException(speed);
        } else {
            System.out.println("Speed " + speed + " is within limit.");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        try {
            v.testSpeed(80);
            v.testSpeed(100);
        } catch (TooFastException e) {
            e.printStackTrace();
        }
    }
}
