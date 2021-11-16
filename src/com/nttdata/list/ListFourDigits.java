package com.nttdata.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ListFourDigits {
    private final Integer randomNumberTwoDigits = (int) (Math.random()*99) +1;
    private ArrayList<Integer> listRandmonFourDigits = new ArrayList<>(randomNumberTwoDigits);
    //private int[] listRandmonFourDigits = new int[randomNumberTwoDigits];
    private  int sumList;

    public ListFourDigits() {
    }

    public void fillList(){
        for (int x = 0; x < randomNumberTwoDigits; x++){
            listRandmonFourDigits.add((int) (Math.random() * (9999-1000 +1) + 1000));
            //listRandmonFourDigits[x] = (int) (Math.random() * (9999-1000 +1) + 1000);
        }
    }

    public void sumList(){
        for (int x = 0; x < listRandmonFourDigits.size(); x++){
            sumList = listRandmonFourDigits.get(x) + sumList;
        }
    }

    public boolean repetedList(){
        for (int x = 0; x < listRandmonFourDigits.size(); x++){
            if(listRandmonFourDigits.indexOf(x) == listRandmonFourDigits.lastIndexOf(x)){
                return true;
            }
        }
        return false;
    }



    @Override
    public String toString() {
        return "ListFourDigits{" +
                "listRandmonFourDigits=" + listRandmonFourDigits +
                '}';
    }

    public int getRandomNumberTwoDigits() {
        return randomNumberTwoDigits;
    }

    public int getSumList() {
        return sumList;
    }

    public ArrayList<Integer> getListRandmonFourDigits() {
        return listRandmonFourDigits;
    }
}
