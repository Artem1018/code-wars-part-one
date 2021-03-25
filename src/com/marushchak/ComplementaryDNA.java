package com.marushchak;

public class ComplementaryDNA {
    public static void main(String[] args) {
        System.out.println(makeComplement("TGATG"));
    }
    public static String makeComplement(String dna) {
        char[] dnaChars = dna.toCharArray();
        dna = "";
        for (char dnaChar : dnaChars) {
            if (dnaChar == 'A')
                dna = dna.concat("T");
            else if (dnaChar == 'T')
                dna = dna.concat("A");
            else if (dnaChar == 'C')
                dna = dna.concat("G");
            else dna = dna.concat("C");
        }
        return dna;
    }
}
