package com.company;

import java.util.Arrays;
public class Main {
    public static void main(String args[])
    {
        int[] array = {1, 5, 4, 3, 7};
        Arrays.sort(array, 0, 4);
        System.out.println(Arrays.toString(array));
    }
}
