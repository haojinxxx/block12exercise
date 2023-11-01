package exercises.ex2arrays;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Arrays {

    /* The input functions */
    public static final Scanner input = new Scanner(in);

    public static int[] getArrayOfIntsFromUser() {
        out.println("Give me 5 ints, write all numbers in one line with a whitespace in between: ");
        String ord = input.nextLine(); //1 2 3 5 6
        String[] arr = ord.split(" ");//this will return an array, split will always return an array
        int[] iar = new int[5];

        for (int el = 0; el < 5; el++) {
            iar[el] = Integer.parseInt(arr[el]);
        }

        return iar;
    }

    public static int getValueFromUser() {
        out.println("Insert a value to find: ");
        int value = input.nextInt();

        return value;
    }

    /* The output functions */
    public static void printIndexToUser(int the_index, int the_value) {
        out.println("Value: " + String.valueOf(the_value) + "is at index: " + String.valueOf(the_index));

    }

    public static void printNotFoundToUser(int the_value) {
        out.println("Value: " + String.valueOf(the_value) + " is not present in list");
    }

    public static void printResultToUser(int the_index, int the_value) {
        if (the_index == -1) {
            printNotFoundToUser(the_value);
        }
        else {
            printIndexToUser(the_index, the_value);
        }
    }


    /* The Algorithm */
    public static int findIndexOfValue(int[] a_list, int a_value) {
        for (int el = 0; el < a_list.length; el++) {
            if (a_value == a_list[el]) {
                return el;
            }
        }
        return -1;
    }


    /* The top-level behavior */
    public static void listBasicsProgram() {
        // INPUT
        int[] theList = getArrayOfIntsFromUser(); //iar
        int theValue = getValueFromUser();  //value
        // PROCESS
        int theIndex = findIndexOfValue(theList, theValue); // done
        // OUTPUT
        printResultToUser(theIndex, theValue);
    }


    /* Required way to make module executable */
    public static void main(String[] args) {
        listBasicsProgram();
    }
}
