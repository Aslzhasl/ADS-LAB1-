import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String inputString = input.nextLine();
            if (checkDigits(inputString)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        public static boolean checkDigits(String inputString) {
            if (inputString.isEmpty()) {
                return true;
            }
            if (Character.isDigit(inputString.charAt(0))) {
                return checkDigits(inputString.substring(1));
            } else {
                return false;
            }
        }
    }


