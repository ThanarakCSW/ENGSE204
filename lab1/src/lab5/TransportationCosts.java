package lab5;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    // Returns the base fee
    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee); // Call parent constructor
    }

    @Override
    public double calculateTotalFee() {
        // Add 5% processing fee
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee); // Call parent constructor
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        // Must call super to get base fee
        double base = super.calculateTotalFee();
        return base + insuranceFee;
    }
}

public class TransportationCosts {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // ----- Input for StandardShipping -----
        String id1 = sc.next();
        double base1 = sc.nextDouble();

        // ----- Input for PremiumShipping -----
        String id2 = sc.next();
        double base2 = sc.nextDouble();
        double insurance = sc.nextDouble();

        // Create objects
        Shipping s1 = new StandardShipping(id1, base1);
        Shipping s2 = new PremiumShipping(id2, base2, insurance);

        // Store in array of parent class
        Shipping[] list = { s1, s2 };

        // Display final fees
        for (Shipping s : list) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
    }
}
