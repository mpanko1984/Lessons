import java.util.List;

public class Hometask3 {

    // receiving list of numbers and print only even numbers
    private static void printEvenNumbers (List list) {
        for (int i = 0; i<=list.size()-1; i++){
           if ((int) list.get(i)%2==0)
               System.out.println(list.get(i));
        }
    }

    // receiving list of number and changes places 1 and 3 element
    private static void changeIndexOfElements(List list, int indexFirstElement, int indexSecondElement) {
        int a = (int) list.get(indexFirstElement);
        list.set(indexFirstElement, list.get(indexSecondElement));
        list.set(indexSecondElement, a);
        System.out.println(list);
    }

    //receiving list of number and counts the sum of even numbers from 1 to 100
    private static void printSumOfEvenNumbers (List list) {
        int sum = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            if ((int) list.get(i) % 2 == 0) {
                sum = sum + (int) list.get(i);
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        printEvenNumbers(Hometask2.createIntegerList(8));
        changeIndexOfElements(Hometask2.createIntegerList(3),0,2);
        printSumOfEvenNumbers(Hometask2.createIntegerList(100));
    }
}
