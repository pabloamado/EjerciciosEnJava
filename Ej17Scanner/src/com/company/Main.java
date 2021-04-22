package com.company;

import com.company.actividades.Item;
import com.company.actividades.Material;
import com.company.actividades.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner();

        Item valija=new Item(Material.LEATHER,1000);
        Item  mochila=new Item(Material.LEATHER,500);
        Item  remera=new Item(Material.TEXTIL,150);
        Item  botella=new Item(Material.GLASS,100);
        Item  bolita=new Item(Material.GLASS,1);

        botella.addItem(bolita);
        mochila.addItem(botella);
        valija.addItem(mochila);
        valija.addItem(remera);

        scanner.scanItem(valija, true);

    }
}
