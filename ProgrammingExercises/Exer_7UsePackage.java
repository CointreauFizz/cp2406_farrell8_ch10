public class Exer_7UsePackage {

        public static void main(String args[])
        {
            Package p1;
            p1 = new Package(4,'A');
            Package p2;
            p2 = new Package(10,'T');
            Package p3 = new Package(20,'M');
            InsuredPackage p4 = new InsuredPackage(4,'A'),
                    p5 = new InsuredPackage(10,'T'),
                    p6 = new InsuredPackage(20,'M');
            System.out.println("Packages:");
            p1.getClass();
            p2.getClass();
            p3.getClass();
            System.out.println("Insured packages:");
            p4.getClass();
            p5.getClass();
            p6.getClass();
        }

    private static class InsuredPackage {
        public InsuredPackage(int i, char t) {
        }
    }
    private static class Package {
        public Package(int i, char t) {
        }
    }
}
