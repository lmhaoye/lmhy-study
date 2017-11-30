package com.lmhy;



/**
 * @author Forest
 * @date 2017/11/30 17:02
 * @note **
 */
public class Main {
    public static void main(String[] args) {
        LmhyHashMap lmhyHashMap = new LmhyHashMap();
        lmhyHashMap.put("abc","2");
        lmhyHashMap.put("aa","1");

        System.out.println(lmhyHashMap.get("xx"));
    }
}
