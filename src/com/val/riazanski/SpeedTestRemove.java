package com.val.riazanski;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class SpeedTestRemove {
         //fields
        private static long linkRemoveTime = 0;
        private static long arrayRemoveTime = 0;
        private static long hashRemoveTime = 0;
        private static final long anInt = 400000;
        //methods
        static void getLinkTime() {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < anInt; i++) {
                linkedList.add(i);
            }
            long s = System.currentTimeMillis();
            for (int i = 0; i < linkedList.size(); i++) {
                linkedList.remove(i);
            }
            long f = System.currentTimeMillis();
            linkRemoveTime = f - s;
        }
        static void getArrayTime() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < anInt; i++) {
                arrayList.add(i);
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.remove(i);
            }
            long finish = System.currentTimeMillis();
            arrayRemoveTime = finish - start;
        }
        static void getHashSetTime() {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < anInt; i++) {
                hashSet.add(i);
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < hashSet.size(); i++) {
                hashSet.remove(i);
            }
            long finish = System.currentTimeMillis();
            hashRemoveTime = finish - start;
        }
        public static void main(String[] args) {
            int nSeries = 3;
            long aLinkRemoveTime = 0;
            for (int i = 0; i < nSeries; i++) {
                getLinkTime();
                System.out.println(linkRemoveTime);
                aLinkRemoveTime = aLinkRemoveTime + linkRemoveTime;
            }
            System.out.println("среднее время удаления в LinkedList = " + aLinkRemoveTime / nSeries);

            long aArrayRemoveTime = 0;
            for (int i = 0; i < nSeries; i++) {
                getArrayTime();
                System.out.println(arrayRemoveTime);
                aArrayRemoveTime = aArrayRemoveTime + arrayRemoveTime;
            }
            System.out.println("среднее время удаления в ArrayList = " + aArrayRemoveTime / nSeries);

            long aHashRemoveTime = 0;
            for (int i = 0; i < nSeries; i++) {
                getHashSetTime();
                System.out.println(hashRemoveTime);
                aHashRemoveTime = aHashRemoveTime + hashRemoveTime;
            }
            System.out.println("среднее время добавления в HashSet = " + aHashRemoveTime / nSeries);

        }

}
