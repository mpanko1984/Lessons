import java.util.ArrayList;

public class Hometask2 {

    private static void printElementsByIndex(ArrayList list, int indexOfElement1, int indexOfElement2) {
        if (indexOfElement2 <= list.size()) {
            System.out.println("element1 = " + list.get(indexOfElement1));
            System.out.println("element2 = " + list.get(indexOfElement2));
        } else {
            System.out.println("Size of the list is less than index of the element2, size=" + list.size() + ". Index of the second element is incorrect");
        }
    }

    private static void printReverseIntegerList(ArrayList intList) {
        for (int i = intList.size() - 1; i >= 0; i--) {
            System.out.print(intList.get(i) + " ");
        }
    }

    private static void combineAndPrintTwoLists(ArrayList list1, ArrayList list2) {
        list1.addAll(list2);
        System.out.println("\n" + "Combined list = " + list1);
    }

    private static double calculateSumOfElements(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
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

    public static ArrayList createIntegerList(int size) {
        ArrayList list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(1 + i);
        }
        return list;
    }

    private static ArrayList createStringList(int size) {
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add("str" + i);
        }
        return list;
    }

    private static ArrayList combineLists(ArrayList list1, ArrayList list2) {
        ArrayList result = new ArrayList();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    private static void printList(ArrayList list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        printElementsByIndex(createStringList(10), 5, 10);
        printReverseIntegerList(createIntegerList(10));
        combineAndPrintTwoLists(createStringList(3), createStringList(5));
        printList(combineLists(createStringList(7), createStringList(5)));
        System.out.println(calculateSumOfElements(createIntegerList(6)));
        System.out.println(combineAllStrings("qwe1", "qwe", "gdf", "vcx", "dfg"));
    }
}
