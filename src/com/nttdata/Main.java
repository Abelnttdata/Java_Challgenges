package com.nttdata;

import com.nttdata.list.ListFourDigits;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entry =new Scanner(System.in);
        ListFourDigits listFourDigits = new ListFourDigits();

        //cargar lista
        listFourDigits.fillList();
        //Sumar lista
        listFourDigits.sumList();
        System.out.println(listFourDigits.toString());
       System.out.println(listFourDigits.getRandomNumberTwoDigits());
       System.out.println("La suma de los elementos de la lista anterior es: " + listFourDigits.getSumList());

      System.out.println("La lista contiene numeros repeidos: " + listFourDigits.repetedList());
    }
}
