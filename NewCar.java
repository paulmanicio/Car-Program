public class NewCar extends Car {
    private String color;

    public NewCar(double cost, String color) {
        super(cost);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof NewCar)) {
            return false;
        }
        NewCar other = (NewCar) obj;

        boolean samePrice = Double.compare(this.getPrice(), other.getPrice()) == 0;

        boolean sameColor;
        if (this.color == null) {
            sameColor = (other.color == null);
        } else {
            sameColor = this.color.equals(other.color);
        }
        return samePrice && sameColor;
    }

    public void display() {
        System.out.println("Price = $ " + String.format("%.2f", getPrice()) + ", Color = " + color);
    }
}
