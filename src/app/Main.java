package app;

import bll.SimpleList;

public class Main {

    public static void main(String[] args) {

        SimpleList list = new SimpleList();
        System.out.println(("Test von size: erwarteter Wert: 0 - tatsächlicher Wert: "+list.size()));
        list.append(3);
        System.out.println("Test von append + toString: erwarteter Wert: 3 - tatsächlicher Wert " + list.toString());
        list.append(4);
        System.out.println("Test von append + toString: erwarteter Wert: 3 4 - tatsächlicher Wert " + list.toString());
        list.append(5);
        System.out.println("Test von append + toString: erwarteter Wert: 3 4 5 - tatsächlicher Wert " + list.toString());
        System.out.println(("Test von size: erwarteter Wert: 3 - tatsächlicher Wert: "+list.size()));
        list.prepend(1);
        System.out.println("Test von prepend + toString: erwarteter Wert: 1 3 4 5 - tatsächlicher Wert " + list.toString());
        list.prepend(0);
        System.out.println(("Test von size: erwarteter Wert: 5 - tatsächlicher Wert: "+list.size()));
        System.out.println("Test von prepend + toString: erwarteter Wert:0 1 3 4 5 - tatsächlicher Wert " + list.toString());
        list.update(3, 6);
        System.out.println("Test von update + toString: erwarteter Wert:0 1 3 6 5 - tatsächlicher Wert " + list.toString());
        list.update(0, 7);
        System.out.println("Test von update + toString: erwarteter Wert:7 1 3 6 5 - tatsächlicher Wert " + list.toString());
        list.update(4, 9);
        System.out.println("Test von update + toString: erwarteter Wert:7 1 3 6 9 - tatsächlicher Wert " + list.toString());
        System.out.println(list.remove(0));
        System.out.println(list.toString());
        System.out.println("Worked: "+list.insertAt(0,10));
        System.out.println(list.toString());
        System.out.println("Worked: "+list.removeAt(10));
        System.out.println(list.toString());
        System.out.println("**************Zweite Liste****************");
        SimpleList list1 = new SimpleList();
        list1.prepend(45);
        System.out.println("Test von prepend + toString: erwarteter Wert: 45 - tatsächlicher Wert " + list1.toString());




    }
}
