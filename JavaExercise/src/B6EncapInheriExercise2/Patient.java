package B6EncapInheriExercise2;

public class Patient extends Person{
    private int medicalRecordNumber;
    private String admissionDate;

    public Patient(String name, int age, String gender, String address, String phoneNumber, int medicalRecordNumber, String admissionDate) {
        super(name, age, gender, address, phoneNumber);
        this.medicalRecordNumber = medicalRecordNumber;
        this.admissionDate = admissionDate;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "medicalRecordNumber: " + medicalRecordNumber + "\n" +
                ", admissionDate: '" + admissionDate;
    }
}
