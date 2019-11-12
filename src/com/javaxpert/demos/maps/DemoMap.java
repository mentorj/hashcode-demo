package com.javaxpert.demos.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * shows how to use  large number of objects in maps
 * at least how we should expect to use...
 * But something is broken
 */
public class DemoMap {

    public static void main(String[] args){
        Map<StupidBo,String> stupids_map = new HashMap<>(50000,0.9f);
        Map<String,String> simple_map = new HashMap(100000);

        System.out.println("About storing a lot of data into the maps...");
        for(long l=0;l<40000;l++){
            StupidBo bo = new StupidBo();
            bo.setCounter((int) Math.ceil(l/1000));
            bo.setMessage("Bo = "+ l);
            stupids_map.put(bo,"counter = "+ l);
            simple_map.put("Key"+l,"counter="+l);
        }
        System.out.println("Inserts done...");
        StupidBo another = new StupidBo();
        another.setCounter(42);
        another.setMessage("can you find me");
        stupids_map.put(another,"found");

        System.out.println("Now searching into the map containing B.Os");
        simple_map.put("key007","counter007");
        long start = System.nanoTime();
        stupids_map.containsKey(another);
        long stop = System.nanoTime();

        System.out.println("Elapsed time for stupi_map containsKey = " + (stop - start)/1000);

        System.out.println("Searcching into the map containing plain strings..");
        start= System.nanoTime();
        simple_map.containsKey("key007");
        stop= System.nanoTime();
        System.out.println("Elapsed time for simple_map containsKey = " + (stop - start)/1000);

    }
}
