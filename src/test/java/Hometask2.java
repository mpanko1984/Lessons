import java.util.ArrayList;
import java.util.List;

public class Hometask2 {

    private static void printElementsByIndex(List<String> list, int indexOfElement1, int indexOfElement2) {
        if (indexOfElement2 <= list.size()) {
            System.out.println("element1 = " + list.get(indexOfElement1));
            System.out.println("element2 = " + list.get(indexOfElement2));
        } else {
            System.out.println("Size of the list is less than index of the element2, size=" + list.size() + ". Index of the second element is incorrect");
        }
    }

    private static void printReverseIntegerList(List<Integer> intList) {
        for (int i = intList.size() - 1; i >= 0; i--) {
            System.out.print(intList.get(i) + " ");
        }
    }

    private static void combineAndPrintTwoLists(List<String> list1, List<String> list2) {
        list1.addAll(list2);
        System.out.println("\n" + "Combined list = " + list1);
    }

    private static double getSumOfElements(List<Integer> list) {
        int sum = 0;
        for (Integer aList : list) {
            sum = sum + aList;
        }
        return sum;
    }

    private static String getAllStrings(String str1, String str2, String str3, String str4, String str5) {
        List<String> list = new ArrayList<>();
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

    public static List getIntegerList(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(1 + i);
        }
        return list;
    }

    private static List getStringList(int size) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("str" + i);
        }
        return list;
    }

    private static List getCombineLists(List<String> list1, List<String> list2) {
        List<String> combinedList = new ArrayList<>();
        combinedList.addAll(list1);
        combinedList.addAll(list2);
        return combinedList;
    }

    private static void printList(List list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        printElementsByIndex(getStringList(10), 5, 9);
        printReverseIntegerList(getIntegerList(10));
        combineAndPrintTwoLists(getStringList(3), getStringList(5));
        printList(getCombineLists(getStringList(7), getStringList(5)));
        System.out.println(getSumOfElements(getIntegerList(7)));
        System.out.println(getAllStrings("qwe1", "qwe", "gdf", "vcx", "dfg"));
    }
}
