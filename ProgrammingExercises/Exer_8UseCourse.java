import javax.swing.*;

public class Exer_8UseCourse {
    public static void main(String[] args)
    {
        String dept, inStr;
        String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};
        int id, credits;
        int found = 0;
        int x;
        dept = JOptionPane.showInputDialog(null, "Enter department");
        inStr = JOptionPane.showInputDialog(null,
                "Enter course number");
        id = Integer.parseInt(inStr);
        inStr = JOptionPane.showInputDialog(null, "Enter credits");
        credits = Integer.parseInt(inStr);
        for(x = 0; x < labCourses.length; ++x)
            if(dept.equals(labCourses[x]))
                found = 1;
        if(found == 1)
        {
            LabCourse course = new LabCourse(dept, id, credits);
            course.display();
        }
        else
        {
            CollegeCourse course = new CollegeCourse(dept, id, credits);
            course.display();
        }
    }

    private static class LabCourse {
        public LabCourse(String dept, int id, int credits) {

        }

        public void display() {

        }
    }

    private static class CollegeCourse {
        public CollegeCourse(String dept, int id, int credits) {

        }

        public void display() {

        }
    }
}

