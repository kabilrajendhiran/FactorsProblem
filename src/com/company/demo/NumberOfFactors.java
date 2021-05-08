package com.company.demo;

public class NumberOfFactors {
    public void findSolution(int[] arr)
    {
        int[] factors = findFactorsArray(arr);
        insertionSort(arr,factors);
        System.out.println("Factors");
        printArray(factors);
        System.out.println("Given array");
        printArray(arr);
    }

    private int findNumberOfFactors(int num)
    {
        int count = 1;
        if(num==0||num==1)
        {
            return 1;
        }

        for (int i = 2; i < num/2; i++) {
            if(num%i==0)
            {
                count++;
            }
        }
        return count;
    }




    private int[] findFactorsArray(int[] a)
    {
        int[] b= new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i]= findNumberOfFactors(a[i]);
        }
        return b;
    }

    private void insertionSort(int[] arr, int[] arrayToSort)
    {
        for (int i = 1; i < arrayToSort.length; i++) {
            int key = arrayToSort[i];
            int key1 = arr[i];

            int j= i -1;

            while (j>=0 && arrayToSort[j]>key)
            {
                arrayToSort[j+1] = arrayToSort[j];
                arr[j+1] = arr[j];
                j = j-1;
            }
            arrayToSort[j+1] = key;
            arr[j+1] = key1;
        }
    }

    private void printArray(int[] a)
    {
        for (int j: a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }


//======================================================================================================================
                            // Improved method
//======================================================================================================================


    public void findSolution1(int[] arr)
    {
        NumberAndFactor[] factors = findFactorsArray1(arr);
        insertionSort(factors);
        printArray(factors);
    }

    private NumberAndFactor[] findFactorsArray1(int[] a)
    {
        NumberAndFactor[] b= new NumberAndFactor[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = new NumberAndFactor(a[i],findNumberOfFactors(a[i]));
        }
        return b;
    }


    private void insertionSort(NumberAndFactor[] arrToSort)
    {
        for (int i = 1; i < arrToSort.length; i++) {
            NumberAndFactor key = arrToSort[i];
            int j= i -1;
            while (j>=0 && arrToSort[j].getFactor()>key.getFactor())
            {
                arrToSort[j+1] = arrToSort[j];
                j = j-1;
            }
            arrToSort[j+1] = key;
        }
    }

    private void printArray(NumberAndFactor[] a)
    {
        for (NumberAndFactor j: a) {
            System.out.println(j.getFactor() +" "+ j.getNum());
        }
    }
}
