package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	koszykProduktow koszyk = new koszykProduktow();
    koszyk.dodajProduktDoKoszyka("produkt 1");
    koszyk.dodajProduktDoKoszyka("produkt 8");
    koszyk.dodajProduktDoKoszyka("produkt 6");

    koszyk.pokarzZamowienie();
    }
}

class koszykProduktow{
    private LinkedList produkty = new LinkedList();

    void pokarzZamowienie(){
        System.out.println("Zamawiane produkty");
        System.out.println(produkty);
    }
    void dodajProduktDoKoszyka(String produkt){
        produkty.add(produkt);
    }
}