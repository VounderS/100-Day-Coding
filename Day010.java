/* 
Output

  ***           ***
  ***           ***
  ***           ***
  ***           ***
  *****************
  *****************
  ***           ***
  ***           ***
  ***           ***
  ***           ***

  *****************
  *****************
  ***           ***
  ***           ***
  *****************
  *****************
  ***           ***
  ***           ***
  ***           ***
  ***           ***
         ***
         ***
         ***
         ***
         ***
         ***
         ***
         ***
         ***
         ***
 */

public class Day010 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 5 || i == 6) {
                for (int k = 0; k < 14; k++) {
                    System.out.print("*");
                }
            }
            System.out.print("           ");
            for (int l = 0; l < 3; l++) {
                if (i == 5 || i == 6) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i < 11; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }
            if (i == 1 || i == 2 || i == 5 || i == 6) {
                for (int k = 0; k < 14; k++) {
                    System.out.print("*");
                }
            }
            System.out.print("           ");
            for (int l = 0; l < 3; l++) {
                if (i == 1 || i == 2 || i == 5 || i == 6) {
                    break;
                }
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int i = 1; i < 11; i++) {
            System.out.print("         ");
            for (int j = 0; j < 3; j++) {

                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
