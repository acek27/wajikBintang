package wajik;

public class Wajik {

    public static void main(String[] args) {
        int x = 1, y = 9;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= i + 4 || j <= 4 - i) {
                    System.out.print(" ");
                } else if (i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(x);
                    x++;
                }
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 7; j++) {
                if (j <= i + 1 || j >= 9 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(y);
                    y--;
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = i; j <= 9; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i - j);
            }
            System.out.println("");
        }
    }
}
