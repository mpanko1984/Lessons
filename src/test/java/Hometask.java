import java.util.ArrayList;

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

    public static void setA(boolean a) {
        Hometask.a = a;
    }

    public static void setB(boolean b) {
        Hometask.b = b;
    }

    public static void setString1(String string1) {
        Hometask.string1 = string1;
    }

    public static void setString2(String string2) {
        Hometask.string2 = string2;
    }

    public static void setString3(String string3) {
        Hometask.string3 = string3;
    }

    public static void setString4(String string4) {
        Hometask.string4 = string4;
    }

    public static void setString5(String string5) {
        Hometask.string5 = string5;
    }

    public static void setI(int i) {
        Hometask.i = i;
    }

    public static void setY(int y) {
        Hometask.y = y;
    }

    public static boolean isA() {
        return a;
    }

    public static boolean isB() {
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

    public static void doBooleanList() {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        list.add(a);
        list.add(b);
        System.out.println("a = " + isA() + " " + "b = " + isB());
    }

    public static void doStringList() {
        ArrayList<java.lang.String> list = new ArrayList<>();
        list.add(string1);
        list.add(string2);
        System.out.println("string1 = " + getString1() + " " + "string2 = " + getString2());
    }

    public static void doIntegerList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(i);
        list.add(y);
        System.out.println("i = " + getI() + " y = " + getY());
    }

    public static void findMax(int i, int y) {
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

    public static void findNeedElement() {
        ArrayList<String> list = new ArrayList<>();
        list.add(string1);
        list.add(string2);
        list.add(string3);
        list.add(string4);
        list.add(string5);
        System.out.println("index 2 = " + list.get(1));
        System.out.println("index 5 = " + list.get(4));
    }

    public static void findMin() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 2);
        list.add(1, 5);
        list.add(2, 3);
        list.add(3, 1);
        list.add(4, 9);
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        System.out.println("Min is " + min);
    }
}
