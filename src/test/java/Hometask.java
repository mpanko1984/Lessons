import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hometask {
    private static boolean a;
    private static boolean b;
    private static String string1;
    private static String string2;
    private static String string3;
    private static String string4;
    private static String string5;
    private static int i;
    private static int y;
    private ArrayList<Object> list;

    public void setA(boolean a) {
        Hometask.a = a;
    }

    public void setB(boolean b) {
        Hometask.b = b;
    }

    public String setString1(String string1) {
        Hometask.string1 = string1;
        return string1;
    }

    public String setString2(String string2) {
        Hometask.string2 = string2;
        return string2;
    }

    public void setString3(String string3) {
        Hometask.string3 = string3;
    }

    public void setString4(String string4) {
        Hometask.string4 = string4;
    }

    public void setString5(String string5) {
        Hometask.string5 = string5;
    }

    public int setI(int i) {
        Hometask.i = i;
        return i;
    }

    public int setY(int y) {
        Hometask.y = y;
        return y;
    }

    public boolean getA() {
        return a;
    }

    public boolean getB() {
        return b;
    }

    public static String getString1() {
        return string1;
    }

    public static String getString2() {
        return string2;
    }

    public static String getString3() {
        return string3;
    }

    public static String getString4() {
        return string4;
    }

    public static String getString5() {
        return string5;
    }

    public static int getI() {
        return i;
    }

    public static int getY() {
        return y;
    }


    public void createAndPrintVariables (Boolean a, Boolean b, String string1, String string2, int i, int y){}

    public void printBooleanList() {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        list.add(a);
        list.add(b);
        System.out.println("a = " + getA() + " " + "b = " + getB());
    }

    public void printStringList(String string1, String string2) {
        ArrayList<java.lang.String> list = new ArrayList<>();
        list.add(string1);
        list.add(string2);
        System.out.println("string1 = " + getString1() + " " + "string2 = " + getString2());
    }

    public void printIntegerList(int i, int y) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(y);
        System.out.println("i = " + getI() + " y = " + getY());
    }

    public void findMax(int i, int y) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(y);
        if (i > y) {
            System.out.println("Max is " + i);
        } else if (y > i) {
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

    public Integer findMin(Integer[] list) {
        this.list = new ArrayList<>();
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static void main(String... args) {
        Hometask hometask = new Hometask();
        hometask.findAndPrintMin(1, 2, 3);
        int min = hometask.findMin(new Integer[]{10, 2, 3});
        System.out.println("Min is " + min);
        hometask.printSecondAndFifthElement("qwe","qw3","sdf","vbn","qwe");
        hometask.findMax(5,10);
        hometask.printIntegerList(2,3);
        hometask.printStringList(hometask.setString1("sdf"),hometask.setString2("sdw"));
    }
}
