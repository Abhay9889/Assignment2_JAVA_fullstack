public abstract class Student {

    private int rollNumber;
    private String name;
    private int semester;

    static String universityName;

    static {
        universityName = "National Tech University";
    }

    public Student(int rollNumber, String name, int semester) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.semester = semester;
    }

    public static void displayUniversityName() {
        System.out.println(universityName);
    }
}
public class TestStatic {
    public static void main(String[] args) {

        Student.displayUniversityName();
    }
}
