package com.javaxpert.demos.maps;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AnotherDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("starting demo , building maps");
        AnotherBo bo = new AnotherBo("toto","somewhere in the space","12/12/1942");
        Map myHashMap = new HashMap<AnotherBo,String>();
        Map myTreeMap = new TreeMap<AnotherBo,String>();
        myHashMap.put(bo,"kiki etait coco...");
        myTreeMap.put(bo,"kiki etait coco...");

        System.out.println("data inserted into maps");
        System.out.println("B.O is in the Hash map ?" + myHashMap.containsKey(bo));
        System.out.println("B.O is in the tree map ?" + myTreeMap.containsKey(bo));
        System.out.println("waiting a second...");
        Thread.sleep(1500);
        System.out.println("And now ...");
        System.out.println("B.O is in the Hash  map ?" + myHashMap.containsKey(bo));
        System.out.println("B.O is in the tree map ?" + myTreeMap.containsKey(bo));

        System.out.println("where is my BO ? ");
    }
}
