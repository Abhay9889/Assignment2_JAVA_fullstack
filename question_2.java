public abstract class Student {

    private int rollNumber;
    private String name;
    private int semester;

    public Student(int rollNumber, String name, int semester) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.semester = semester;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public abstract double calculateGrade();

    public void displayDetails() {
        System.out.println(rollNumber + " " + name + " " + semester);
    }
}
