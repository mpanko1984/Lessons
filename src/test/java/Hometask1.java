import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hometask1 {


    public void createAndPrintVariables(boolean a, boolean b, String string1, String string2, int i, int y) {
        System.out.println(" a = " + a + " b = " + b);
        System.out.println("string1 = " + string1 + " string2 = " + string2);
        System.out.println("i = " + i + " y = " + y);
    }

    public void addVarInListAndPrint(boolean a, boolean b, String string1, String string2, int i, int y) {
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

    public void findAndPrintMax(int i, int y) {
        if (i > y) {
            System.out.println("Max is " + i);
        } else if (y < i) {
            System.out.println("Max is " + y);
        } else {
            System.out.println("I equal Y");
        }
    }

    public void printSecondAndFifthElement(String str1, String str2, String str3, String str4, String str5) {
        ArrayList<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        System.out.println("index 2 = " + list.get(1));
        System.out.println("index 5 = " + list.get(4));
    }


    public void findAndPrintMin(Integer... a) {
        List<Integer> list = Arrays.asList(a);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Min is " + min);
    }


    public static void main(String[] args) {
        Hometask1 hometask1 = new Hometask1();
        hometask1.createAndPrintVariables(true, false, "dfg", "qwe", 2, 4);
        hometask1.addVarInListAndPrint(false, false, "str1", "str2", 8, 6);
        hometask1.findAndPrintMax(0, 0);
        hometask1.printSecondAndFifthElement("qwe", "qw3", "sdf", "vbn", "qwe");
        hometask1.findAndPrintMin(3, 4, 6);
    }
}