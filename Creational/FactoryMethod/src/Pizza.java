public class Pizza {
    private int numberOfSlices;
    private String specialty;

    public Pizza(int numberOfSlices, String specialty) {
        this.numberOfSlices = numberOfSlices;
        this.specialty = specialty;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }


    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String toString() {
        return "Number of slices : " + this.getNumberOfSlices() + " especialty : " + this.getSpecialty();
    }

}
