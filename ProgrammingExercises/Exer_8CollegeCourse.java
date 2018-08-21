import javax.swing.*;

public class Exer_8CollegeCourse {

        private String dept;
        private int id;
        private double credits;
        private double price;

   public Exer_8CollegeCourse(String dep, int num, double cr)
        {
            final int FEE_PER_CREDIT;
            FEE_PER_CREDIT = 120;
            dept = dep;
            id = num;
            credits = cr;
            price = cr * FEE_PER_CREDIT;
        }
        public void display()
        {
            JOptionPane.showMessageDialog(null,
                    dept + id + "\nNon-lab course\n" +  credits +
                            " credits\nTotal fee is $" + price);
        }
    }


