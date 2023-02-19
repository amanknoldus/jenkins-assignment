import java.util.Arrays;
import  java.util.HashMap;
public class ReducedArrayForm {
    //function to transform the array in reduced form.
    public static void reduceMethod(int[] inputArray) {
        //copying and sorting duplicate array
        int copyArray[] = inputArray.clone();
        Arrays.sort(copyArray);
        HashMap<Integer,Integer> reducedForm = new HashMap<>();
        int index1 = 0;

        for (int reducedElements: copyArray) {
            reducedForm.put(copyArray[index1], index1);
            index1++;
        }
        //assigning value of map(reducedForm) to original array which were in sorted form.
        int index2 = 0;
        for (int transformedElements: inputArray) {
            inputArray[index2] = reducedForm.get(inputArray[index2]);
            index2++;
        }
    }
    //function to print transformed array elements.
    public static void printReducedForm(int[] inputArray) {
        System.out.print("Reduced Array Form is: ");
        for (int printElement: inputArray) {
            System.out.print(printElement+"  ");
        }
    }
    //main class in which asking user to enter size and elements of array.
    public static void main (String args[]) {
          System.out.println("Auto Trigger Build: ")
        int[] inputArray = {8,3,5,40,7,9,13};
        int arrayCount = 0;
        
        //calling functions of reducing and printing transformed array.
        reduceMethod(inputArray);
        printReducedForm(inputArray);
    }
}
