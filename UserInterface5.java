import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    public String getDuplicateElement() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the size of an array");
            int size = scanner.nextInt();

            if (size <= 0) {
                return "Array size should be positive";
            }

            int[] array = new int[size];
            System.out.println("Enter the array elements");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Enter the position of the element to be replicated");
            int position = scanner.nextInt();

            if (position < 0 || position >= size) {
                return "Array index is out of range";
            }

            int replicatedElement = array[position];
            StringBuilder result = new StringBuilder("The array elements are ");
            for (int i = 0; i < size; i++) {
                result.append(array[i]).append(" ");
            }
            result.append(replicatedElement);

            return result.toString();
        } catch (InputMismatchException e) {
            return "Input was not in the correct format";
        } catch (NegativeArraySizeException e) {
            return "Array size should be positive";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        }
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        System.out.println(ui.getDuplicateElement());
    }
}