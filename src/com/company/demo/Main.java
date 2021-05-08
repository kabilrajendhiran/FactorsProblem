package com.company.demo;


public class Main {

    public static void main(String[] args) {

        int[] a = { 8, 2, 3, 12, 16};
        NumberOfFactors nof = new NumberOfFactors();
        System.out.println("Old method");
        nof.findSolution(a);
        System.out.println("New method");
        nof.findSolution1(a);

    }

}
