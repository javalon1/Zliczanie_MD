package com.sda.algorytmy;


public class App 
{
    public static void main( String[] args )
    {

        int[] tablica = new int[]{4, 1, 6, 1, 1};
        int zliczanie = 0;
        int szukanaWartosc = 1;

        for(int i = 0; i < tablica.length; i++){
            if (tablica[i] == szukanaWartosc){
                zliczanie++;
            }
        }
        System.out.println(zliczanie);
    }
}
