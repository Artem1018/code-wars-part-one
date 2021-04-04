package com.marushchak;

public class BuildAPileOfCubes {
    public static void main(String[] args) {
        System.out.println(findNb(1071225));
    }
        public static long findNb(long m) {
            long mm = 0, n = 0;
            while (mm < m) mm += ++n * n * n;
            return mm == m ? n : -1;
        }

}
