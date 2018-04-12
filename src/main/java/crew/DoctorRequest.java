package crew;

import operations.Operation;

import java.io.Serializable;

public class DoctorRequest implements Serializable {
    private Worker doctor;
    private String patientName;
    private Operation operation;

    public DoctorRequest(Worker doctor, String patientName, Operation operation) {
        this.doctor = doctor;
        this.patientName = patientName;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return String.format("Badanie: %s Pacjent: %s Zlecił: %s", operation, patientName, doctor);
    }
}
