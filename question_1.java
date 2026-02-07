public abstract class Student {

    private int rollNumber;
    private String name;
    private int semester;

    public static String universityName;

    final int MAX_SEMESTER = 8;

    static {
        universityName = "National Tech University";
    }

    public Student(int rollNumber, String name, int semester) {
        this.rollNumber = rollNumber;
        setSemester(semester);
        this.name = name;
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

    public void setSemester(int semester) {
        if (semester > 0 && semester <= MAX_SEMESTER) {
            this.semester = semester;
        }
    }

    public abstract double calculateGrade();

    public void displayDetails() {
        System.out.println(rollNumber + " " + name + " " + semester);
    }

    public static void displayUniversityName() {
        System.out.println(universityName);
    }

    final void showRules() {
        System.out.println("University rules must be followed");
    }
}
