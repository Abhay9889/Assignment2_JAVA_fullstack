public abstract class Student {

    final int MAX_SEMESTER = 8;

    final void showRules() {
        System.out.println("University rules must be followed");
    }
}
public class EngineeringStudent extends Student {

    void showRules() {
        System.out.println("Different rules");
    }
    
}
