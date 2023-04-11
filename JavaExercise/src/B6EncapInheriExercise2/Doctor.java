package B6EncapInheriExercise2;

public class Doctor extends Person {
    private String specialization;
    private int workingHours;

    public Doctor(String name, int age, String gender, String address, String phoneNumber, String specialization, int workingHours) {
        super(name, age, gender, address, phoneNumber);
        this.specialization = specialization;
        this.workingHours = workingHours;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Specialization: " + specialization + "\n" +
                "Working hours: " + workingHours;
    }
}
