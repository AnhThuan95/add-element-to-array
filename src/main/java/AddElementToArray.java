import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 5;
        array[1] = 2;
        array[2] = 3;

        ShowArray(array);

        AddElement(array);

        ShowArray(array);
    }

    public static void AddElement (int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int position = scanner.nextInt();
        if (position < 0 || position > array.length -1) {
            System.out.println("Can not add a element at this position!");
        } else {
            System.out.println("Enter the value: ");
            int value = scanner.nextInt();
            for (int i = array.length - 1; i > position; i--) {
                array[i] = array[i - 1];
            }
            array[position] = value;
        }
    }

    public static void ShowArray(int[] array) {
        System.out.println("Array list: ");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.println();
    }
}
