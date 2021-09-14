import java.util.List;

public class Hometask3 {

    // receiving list of numbers and print only even numbers
    private static void printEvenNumbers (List<Integer> list) {
        for (int i = 0; i<=list.size()-1; i++)
        {
           if (list.get(i)%2==0)
           {
               System.out.print(list.get(i) + " ");
           }
        }
    }

    // receiving list of number and changes places 1 and 3 element
    private static void changeIndexOfElements(List<Integer> list, int indexFirstElement, int indexSecondElement) {
        int temp = list.get(indexFirstElement);
        list.set(indexFirstElement, list.get(indexSecondElement));
        list.set(indexSecondElement, temp);
        System.out.println("\n" + list);
    }

    //receiving list of number and counts the sum of even numbers from 1 to 100
    private static void printSumOfEvenNumbers (List<Integer> list) {
        int sum = 0;
        for (int i = 0; i <= list.size() - 1; i++)
        {
            if (list.get(i) % 2 == 0)
            {
                sum = sum + list.get(i);
            }
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        printEvenNumbers(Hometask2.getIntegerList(8));
        changeIndexOfElements(Hometask2.getIntegerList(3),0,2);
        printSumOfEvenNumbers(Hometask2.getIntegerList(100));
    }
}
