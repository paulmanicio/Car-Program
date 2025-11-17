public class UsedCar extends Car {
    private int mileage;

    public UsedCar(double cost, int mileage) {
        super(cost);
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof UsedCar))
            return false;

        UsedCar other = (UsedCar) obj;

        boolean samePrice = Double.compare(this.getPrice(), other.getPrice()) == 0;

        boolean sameMileage = this.mileage == other.mileage;

        return samePrice && sameMileage;
    }

    public void display() {
        System.out.println("Price = $ " + String.format("%.2f", getPrice()) + ", Mileage = " + mileage);
    }
}
