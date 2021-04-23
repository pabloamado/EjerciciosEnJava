package com.company;

import com.company.actividades.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Article art1=new Article("mesa Roble",3000,"hecha de roble");
        Article art2=new Article("mesa Vidrio",1000,"hecha de vidrio");
        Article art3=new Article("mesa Cedro",2000,"hecha de cedro");

        Article art4=new Article("silla plastico",200,"hecha de plastico");
        Article art5=new Article("silla madera",500,"hecha de madera");
        Article art6=new Article("silla metal",1000,"hecha de metal");

        Item artForSale1= new Item(art1,6000);
        Item artForSale2= new Item(art2,2000);
        Item artForSale3= new Item(art3,4000);

        Item artForSale4= new Item(art4,400);
        Item artForSale5= new Item(art5,1000);
        Item artForSale6= new Item(art6,2000);

        List wholeSailerList=new List("mayorista",true,2020,05,02);
        List retailerList=new List("minorista",false,2020,06,05);


        Manager manager=new Manager();
        manager.addList(wholeSailerList);
        manager.addList(retailerList);
        manager.addItem(artForSale1,"minorista");
        manager.addItem(artForSale2,"minorista");
        manager.addItem(artForSale3,"minorista");
        manager.addItem(artForSale4,"mayorista");
        manager.addItem(artForSale5,"mayorista");
        manager.addItem(artForSale6,"mayorista");



        manager.checkPriceList();

        manager.printItems();

    }
}
