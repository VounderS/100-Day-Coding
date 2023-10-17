public class Day011 {
    public static void main(String[] args) {
        hurufA();
        hurufB();
        hurufC();
        hurufD();
        hurufE();
        hurufF();
        hurufG();
    }

    public static void hurufA() {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 5 || i == 6) {
                for (int k = 0; k < 16; k++) {
                    System.out.print("*");
                }
            }
            System.out.print("             ");
            for (int l = 0; l < 3; l++) {
                if (i == 1 || i == 2 || i == 5 || i == 6) {
                    break;
                }
                System.out.print("*");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public static void hurufB() {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 5 || i == 6 || i == 9 || i == 10) {
                for (int k = 0; k < 14; k++) {
                    System.out.print("*");
                }
            }
            if (i == 3 || i == 4 || i == 7 || i == 8) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.print("           ");
            for (int l = 0; l < 3; l++) {
                if (i == 1 || i == 2 || i == 5 || i == 6 || i == 9 || i == 10) {
                    break;
                }
                System.out.print("*");
            }

            System.out.println("");
        }
        System.out.println();
    }

    public static void hurufC() {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 9 || i == 10) {
                for (int k = 0; k < 16; k++) {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
        System.out.println();
    }

    public static void hurufD() {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 9 || i == 10) {
                for (int k = 0; k < 14; k++) {
                    System.out.print("*");
                }
            }
            if (i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.print("           ");
            for (int l = 0; l < 3; l++) {
                if (i == 1 || i == 2 || i == 9 || i == 10) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void hurufE() {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 5 || i == 6 || i == 9 || i == 10) {
                for (int k = 0; k < 16; k++) {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
        System.out.println();
    }

    public static void hurufF() {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 5 || i == 6) {
                for (int k = 0; k < 16; k++) {
                    System.out.print("*");
                }
            }

            System.out.println("");
        }
        System.out.println();
    }

    public static void hurufG() {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 9 || i == 10) {
                for (int k = 0; k < 16; k++) {
                    System.out.print("*");
                }
            }
            if (i == 5 || i == 6) {
                System.out.print("    ");
                for (int k = 0; k < 12; k++) {
                    System.out.print("*");
                }
            }
            System.out.print("             ");
            for (int l = 0; l < 3; l++) {
                if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 10) {
                    break;
                }
                System.out.print("*");
            }

            System.out.println("");
        }
        System.out.println();
    }

}
