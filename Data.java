public class Data {
    private int height;
    private int weight;
    private int years;

    public Data(int height, int weight, int years) {
        this.years = years;
        this.weight = weight;
        this.height = height;
    }

    public int getYears() {
        return years;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "rost=" + height +
                ", ves=" + weight +
                ", let=" + years;
    }
}
