package com.sda.algorytmy;


import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        int[] tablica = new int[]{4, 1, 6, 1, 1, 4, 3, 3, 1};
        int zliczanie = 0;
        System.out.println(Arrays.toString(tablica));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ktora liczbe chcesz zliczyc?");
        int szukanaWartosc = scanner.nextInt();

        for(int i = 0; i < tablica.length; i++){
            if (tablica[i] == szukanaWartosc){
                zliczanie++;
            }
        }
        System.out.println(zliczanie);
    }
}
