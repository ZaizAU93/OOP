public class Calculator {
    double weight;
    double cost;
    String color;

    public Calculator(double weight, double cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    public double getSum(double x, double y) {
        return x + y;
    }

    public double getDifference(double x, double y) {
        return x - y;
    }

    public double getDivision(double x, double y) {
        return x / y;
    }

    public double getMultiplication(double x, double y) {
        return x * y;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}