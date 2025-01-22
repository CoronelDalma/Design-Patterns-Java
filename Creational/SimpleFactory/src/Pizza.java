public class Pizza {
    private int numberOfSlices;

    public Pizza(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public String toString() {
        return "Number of slices : " + this.getNumberOfSlices();
    }

}
