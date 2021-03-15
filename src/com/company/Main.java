package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Implementati o clasa PuncteDoiD care sa contina: un contructor care primeste 2 numere reale (de tip float)ce reprezinta coordonatele
        //O metoda modifica coordonate ce primeste doua numere reale si modifica cele doua coordonate ale punctului ,
         // O functie de afisare a unui punct care va afisa punctul in formatul urmator : (x, y)

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti coordonatele punctului dorit");
        float x = scan.nextFloat();
        float y = scan.nextFloat();
        PunctDoiD coordonate = new PunctDoiD(x, y);
        coordonate.printCoordinates();
        coordonate.modifyCoordinates();
        coordonate.printCoordinates();
    }
}