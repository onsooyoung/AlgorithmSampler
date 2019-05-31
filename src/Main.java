import common.ArrUtil;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;
import sort.Sorter;

public class Main {


    static int[] sortedBeforeArray = ArrUtil.makeArrayRandomNumber(10);

    private static void resetArray(){
        sortedBeforeArray = ArrUtil.makeArrayRandomNumber(10);
    }

    public static void main(String[] args) {

        System.out.println("Hello Bubble Sort!!");
        ArrUtil.printArray(sortedBeforeArray);
        ArrUtil.printArray(new BubbleSort().sort(sortedBeforeArray));

        resetArray();
        System.out.println("Hello Selection Sort!!");
        ArrUtil.printArray(sortedBeforeArray);
        ArrUtil.printArray(new SelectionSort().sort(sortedBeforeArray));

        resetArray();
        System.out.println("Hello Insertion Sort!!");
        ArrUtil.printArray(sortedBeforeArray);
        ArrUtil.printArray(new InsertionSort().sort(sortedBeforeArray));

    }
}
