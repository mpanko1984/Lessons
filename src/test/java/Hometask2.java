import java.util.ArrayList;

public class Hometask2 {

    private static void printElementsByIndex(int indexOfElement1, int indexOfElement2, int listSize) {
        ArrayList list1 = new ArrayList();
        for (int element = 0; element <= listSize; element++) {
            list1.add(element, "str" + ((int) (Math.random() * 10)));
        }
        System.out.println(list1);
        if (indexOfElement2 < listSize) {
            System.out.println("element1 = " + list1.get(indexOfElement1));
            System.out.println("element2 = " + list1.get(indexOfElement2));
        } else {
            System.out.println("Size of the list is less than index of the element2 = " + list1.size() + ". Index of the second element is incorrect");
        }
    }

    private static void printReverseIntegerList(int intSize) {
        ArrayList intList = new ArrayList();
        while (intList.size() < intSize) {
            intList.add((int) (Math.random() * 10));
        }
        System.out.println(intList);
        for (int i = intList.size() - 1; i >= 0; i--) {
            System.out.print(intList.get(i) + " ");
        }
    }

    private static void combineAndPrintTwoLists(int listSize1, int listSize2) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int element = 0; element < listSize1; element++) {
            list1.add(element, "str" + ((int) (Math.random() * 10)));
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (int element = 0; element < listSize2; element++) {
            list2.add(element, "str" + ((int) (Math.random() * 10)));
        }
        list1.addAll(list2);
        System.out.println("\n" + "Combined list = " + list1);
    }

    private static double calculateSumOfElements(int size) {
        ArrayList<Integer> intList = new ArrayList<>();
        while (intList.size() <= 10) {
            intList.add((int) (Math.random() * 10));
        }
        double sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            sum = sum + intList.get(i);
        }
        return sum;
    }

    private static String combineAllStrings(String str1, String str2, String str3, String str4, String str5) {
        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        String newCombineString = " ";
        for (int i = 0; i <= list.size() - 1; i++) {
            newCombineString = newCombineString + list.get(i);
        }
        return newCombineString;
    }

    public static ArrayList createList(int size) {
        ArrayList list = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            list.add("str" + i);
        }
        return list;
    }

    public static ArrayList combineLists(ArrayList list1, ArrayList list2){
        ArrayList result = new ArrayList();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    public static void printList(ArrayList list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        printElementsByIndex(1, 5, 10);
        printReverseIntegerList(10);
        combineAndPrintTwoLists(2, 4);
        System.out.println(calculateSumOfElements(5));
        System.out.println(combineAllStrings("qwe1", "qwe", "gdf", "vcx", "dfg"));
        printList(combineLists(createList(7), createList(5)));
    }
}
