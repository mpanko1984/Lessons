import java.util.ArrayList;

public class Hometask1 {

private static ArrayList stringList = new ArrayList();
    private static void setList(ArrayList list) {
        Hometask1.stringList = list;
        list.add("dfg1");
        list.add("dfg2");
        list.add("dfg3");
        list.add("dfg4");
        list.add("dfg5");
    }

    private static ArrayList integerList = new ArrayList();
    private static void setIntegerList(ArrayList integerList) {
        Hometask1.integerList = integerList;
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);
        integerList.add(0);
        integerList.add(-5);
    }

    private static void createAndPrintVariables(boolean a, boolean b, String string1, String string2, int i, int y) {
        System.out.println(" a = " + a + " b = " + b);
        System.out.println("string1 = " + string1 + " string2 = " + string2);
        System.out.println("i = " + i + " y = " + y);
    }

    private static void addVarInListAndPrint(boolean a, boolean b, String string1, String string2, int i, int y) {
        ArrayList<Boolean> boolList = new ArrayList();
        boolList.add(a);
        boolList.add(b);
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add(string1);
        stringList.add(string2);
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(i);
        intList.add(y);
        System.out.println("Boolean list = " + boolList);
        System.out.println("String list = " + stringList);
        System.out.println("Integer list = " + intList);
    }

    private static void findAndPrintMax(int i, int y) {
        if (i > y) {
            System.out.println("Max is " + i);
        } else if (y < i) {
            System.out.println("Max is " + y);
        } else {
            System.out.println("I equal Y");
        }
    }

    private static void printSecondAndFifthElement(ArrayList list) {
        setList(list);
        if (list.size()>=5) {
            System.out.println("index 2 = " + list.get(1));
            System.out.println("index 5 = " + list.get(4));
        }
        else
            System.out.println("ArrayList has less than 5 elements");
    }


    private static void findAndPrintMin(ArrayList<Integer> list) {
        setIntegerList(list);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Min is " + min);
    }


    public static void main(String[] args) {
        createAndPrintVariables(true, false, "dfg", "qwe", 2, 4);
        addVarInListAndPrint(false, false, "str1", "str2", 8, 6);
        findAndPrintMax(0, 0);
        printSecondAndFifthElement(stringList);
        findAndPrintMin(integerList);
    }
}