package com.netcracker;

import com.netcracker.circle.Circle;
import com.netcracker.list.MyLinkedList;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {




        System.out.println("========================Test List======================");
        testList();
        System.out.println("========================Test Set=======================");
        testSet();
        System.out.println("========================Test Map=======================");
        testMap();


    }



    public static void testMap(){

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();

        Random random = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedHashMap.put(i,i);
        }

        long finish = System.currentTimeMillis();
        System.out.println("LinkedHashMap add operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            hashMap.put(i,i);
        }

        finish = System.currentTimeMillis();
        System.out.println("HashMap add operation: " + (finish - start));


        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            treeMap.put(i,i);
        }
        finish = System.currentTimeMillis();
        System.out.println("TreeMap add operation: " + (finish - start));


        //Seacrh operation
        start = System.currentTimeMillis();

        for (int i = 0; i < linkedHashMap.size(); i++) {
            linkedHashMap.get(i);
        }

        finish = System.currentTimeMillis();
        System.out.println("LinkedHashMap get operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < hashMap.size(); i++) {
            hashMap.get(i);
        }

        finish = System.currentTimeMillis();
        System.out.println("HashMap get operation: " + (finish - start));


        start = System.currentTimeMillis();

        for (int i = 0; i < treeMap.size(); i++) {
            treeMap.get(i);
        }

        finish = System.currentTimeMillis();
        System.out.println("TreeMap get operation: " + (finish - start));


        //remove operation
        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedHashMap.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("LinkedHashMap remove operation: " + (finish - start));


        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            hashMap.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("HashMap remove operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            treeMap.remove(i);
        }

        finish = System.currentTimeMillis();
        System.out.println("TreeMap remove operation: " + (finish - start));

    }

    public static void testSet(){

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Random random = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);

        }
        long finish = System.currentTimeMillis();
        System.out.println("HashSet add operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedHashSet.add(i);

        }
        finish = System.currentTimeMillis();
        System.out.println("LinkedHashSet add operation: " + (finish - start));


        start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("TreeSet add operation: " + (finish - start));

        //Seacrh operation
        start = System.currentTimeMillis();

        for (int number : hashSet) {
            number++;
        }

        finish = System.currentTimeMillis();
        System.out.println("HashSet get operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int number : treeSet) {
            number++;
        }

        finish = System.currentTimeMillis();
        System.out.println("LinkedHashSet get operation: " + (finish - start));


        start = System.currentTimeMillis();

        for (int number : linkedHashSet) {
            number++;
        }

        finish = System.currentTimeMillis();
        System.out.println("TreeSet get operation: " + (finish - start));

        //remove operation


        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            hashSet.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("HashSet remove operation: " + (finish - start));


        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedHashSet.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("LinkedHashSet remove operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            treeSet.remove(i);
        }

        finish = System.currentTimeMillis();
        System.out.println("TreeSet remove operation: " + (finish - start));

    }


    public static void testList(){

        ArrayList<Circle> arrayList = new ArrayList<>();
        LinkedList<Circle> linkedList = new LinkedList<>();

        Random random = new Random();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Circle(random.nextInt(100),random.nextInt(100)));

        }
        long finish = System.currentTimeMillis();
        System.out.println("ArrayList add operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedList.add(new Circle(random.nextInt(100),random.nextInt(100)));

        }
        finish = System.currentTimeMillis();
        System.out.println("LinkedList add operation: " + (finish - start));

        //Insert operation
        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            arrayList.add(i,new Circle(random.nextInt(100),random.nextInt(100)));
        }

        finish = System.currentTimeMillis();
        System.out.println("ArrayList insert operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedList.add(i,new Circle(random.nextInt(100),random.nextInt(100)));
        }

        finish = System.currentTimeMillis();
        System.out.println("LinkedList insert operation: " + (finish - start));


        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            arrayList.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("ArrayList remove operation: " + (finish - start));

        start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            linkedList.remove(i);
        }
        finish = System.currentTimeMillis();
        System.out.println("LinkedList remove operation: " + (finish - start));
    }
}
