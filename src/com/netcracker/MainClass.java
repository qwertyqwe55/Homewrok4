package com.netcracker;

import com.netcracker.circle.Circle;
import com.netcracker.list.MyLinkedList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Circle> list = new MyLinkedList<>();
        Circle circle = new Circle(1000,1000);
        System.out.println("Add elements in mylinkedlist");
        list.add(new Circle(10,20));
        list.add(new Circle(15,25));
        list.add(new Circle(20,30));
        list.add(new Circle(25,40));

        list.add(2,new Circle(100,50));
        list.add(0,new Circle(150,80));
        list.add(5,new Circle(200,100));

        System.out.println(list);


        System.out.println("=====================================");
        System.out.println("Remove elements in mylinkedlist");
        list.remove(4);
        list.remove(0);
        System.out.println(list);
        System.out.println("======================================");
        list.add(2, circle);
        System.out.println("Index of circle: " + list.indexOf(circle));
        System.out.println("Get of circle: " + list.get(2));
        System.out.println("Set circle" + list.set(3, new Circle(1,1)));

        System.out.println("Test iteration work");
        for(Circle circle1 : list){
            System.out.print(circle1);
        }
        System.out.println();
        list.clear();

        System.out.println(list);

    }
}
