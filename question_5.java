public class EngineeringStudent extends Student {

    private int internalMarks;
    private int externalMarks;

    public EngineeringStudent(int rollNumber, String name, int semester,
                              int internalMarks, int externalMarks) {
        super(rollNumber, name, semester);
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    @Override
    public double calculateGrade() {
        return (internalMarks * 0.4) + (externalMarks * 0.6);
    }
}
public class MedicalStudent extends Student {

    private int theoryMarks;
    private int practicalMarks;

    public MedicalStudent(int rollNumber, String name, int semester,
                          int theoryMarks, int practicalMarks) {
        super(rollNumber, name, semester);
        this.theoryMarks = theoryMarks;
        this.practicalMarks = practicalMarks;
    }

    @Override
    public double calculateGrade() {
        return (theoryMarks + practicalMarks) / 2.0;
    }
}
