import java.util.ArrayList;

public class Hometask2 {

    static ArrayList list1 = new ArrayList();
    static ArrayList list2 = new ArrayList();
    static ArrayList intList = new ArrayList();

    private static void setIntList (ArrayList list) {
        for (int i = 0; list.size()<=10; i++ ) {
            list.add(i++);
        }
    }

    private static void setStringList1(ArrayList list) {
        Hometask2.list1 = list;
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");
        list.add("str9");
        list.add("str10");
    }

    private static void setStringList2(ArrayList list) {
        Hometask2.list2 = list;
        list.add("str11");
        list.add("str12");
        list.add("str13");
        list.add("str14");
        list.add("str15");
        list.add("str16");
        list.add("str17");
        list.add("str18");
        list.add("str19");
        list.add("str10");
    }



    private static void printFirstAndNinthElement(ArrayList list) {
        setStringList1(list);
        System.out.println("index 1 = " + list.get(0));
        System.out.println("index 9 = " + list.get(8));
    }

    private static void printReverseList (ArrayList list) {
        setIntList(list);
        for ( int i=list.size()-1; i>=0; i --) {
            System.out.print(list.get(i)+" ");
        }
    }

    private static void unitedAndPrintTwoLists(ArrayList list1, ArrayList list2) {
        setStringList1(list1);
        setStringList2(list2);
        list1.addAll(list2);
        System.out.println("\n"+"United list = "+list1);
    }


    public static void main(String[] args) {
        printFirstAndNinthElement(list1);
        printReverseList(intList);
        unitedAndPrintTwoLists(list1,list2);
    }
}
