package com.vincent.Modul1.Pass;

//Class Main
public class Pass {
    public static void main(String[] args) {
        int nomer1, nomer2;

        TestPass passed = new TestPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;

        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer2\t: " + nomer2);

        passed.calculate(nomer1, nomer2);
        System.out.println("Nilai sesudah passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer2\t: " + nomer2);
        System.out.println();

        //Passed by Reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("passed.nomer1\t: " + passed.nomer1);
        System.out.println("passed.nomer2\t: " + passed.nomer2);
        System.out.println();

        passed.calculate(passed);
        System.out.println("Nilai sesudah passed by reference\t: ");
        System.out.println("passed.nomer1\t: " + passed.nomer1);
        System.out.println("passed.nomer2\t: " + passed.nomer2);
        System.out.println();
    }
}
