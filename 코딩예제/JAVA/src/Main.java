// Java 프로그래밍 - 변수와 자료형_4


import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

//      1-1. add
        l1.add(1);
        l1.add("Hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("World!");
        System.out.println("l1 = " + l1);

        l1.add(0,10);
        System.out.println("l1 = " + l1);

//      1-2. get
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

//      1-3. size
        System.out.println(l1.size());

//      1-4. remove

        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);
        System.out.println(l1.remove(Integer.valueOf(2)));
        System.out.println("l1 = " + l1);



//      1-5. clear
        l1.clear();
        System.out.println("l1 = " + l1);

//      1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(6);
        l2.add(7);
        System.out.println("l2 = " + l2);
        
        l2.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("l2 = " + l2);

        l2.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println("l2 = " + l2);



//      1-7. contains
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(5));


//      2. Maps
        System.out.println("== Maps ==");
        HashMap map = new HashMap();

//      2-1. put
        map.put("Kiwi", 9000);
        map.put("banana", 1000);
        map.put("apple", 800);
        System.out.println("map = " + map);

//      2-2. get
        System.out.println(map.get("mandarin"));
        System.out.println(map.get("apple"));


//      2-3. size
        System.out.println(map.size());

//      2-4. remove
        System.out.println(map.remove("Kiwi"));
        System.out.println(map.remove("Mandarin"));
        System.out.println("map = " + map);

//      2-5. containsKey
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("Kiwi"));


//      3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("Hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();
       // l4.add(1);
        l4.add("Hello");
        System.out.println("l4 = " + l4);

        HashMap map2 = new HashMap();
        map2.put(123,"ID");
        System.out.println("map2 = " + map2);

        HashMap<String,Integer> map3 = new HashMap<String, Integer>();
        //map3.put(123,123);
        map3.put("ID",123);
        System.out.println("map3 = " + map3);

    }

}
