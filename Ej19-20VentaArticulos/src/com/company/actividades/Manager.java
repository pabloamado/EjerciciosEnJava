package com.company.actividades;

import org.omg.PortableInterceptor.ClientRequestInfo;

import java.util.ArrayList;

public class Manager {

    private Validator validator;
    private ArrayList<List> listOfLists;

    public ArrayList<List> getListOfLists(){
        if(listOfLists==null){
            listOfLists=new ArrayList<>();
        }
        return listOfLists;
    }

    public void addList(List list) throws Exception {

        if(list!=null){
            getListOfLists().add(list);
        }else{
            throw new Exception("Se ha intentado agregar una lista nula.");
        }

    }

    public void addItem(Item item, String nameList) {

        validator=new Validator();

        if(validator.itemIsValid(item)){//SI EL ITEM ES VALIDO

            for(List list:getListOfLists()){//RECORRO EL LISTADO DE LISTAS Y BUSCA EL NOMBRE DE LA LISTA

                if(list.getName().equals(nameList)){
                    list.addItem(item);

                }

            }

        }else{
             System.out.println(validator.getErrorMsg());
             validator.restartErrorMsg();
        }

    }

    public void checkPriceList() {

        for(List subList:getListOfLists()){//OBTENGO LOS LISTADOS DE LA LISTA

            modifyPrice(subList);

        }
    }

    public static void modifyPrice(List list){
        float maxPrice=0;
        float minPrice=0;


        ArrayList<Item>itemList=list.getItemsToSell();
        Item minPriceItem=itemList.get(0);
        maxPrice=minPriceItem.getSellCost();
        minPrice=minPriceItem.getSellCost();


        if(itemList.size()>0){

            for(int i=1;i<itemList.size();i++){

                if(itemList.get(i).getSellCost()<minPrice){
                    minPrice=itemList.get(i).getSellCost();
                    minPriceItem=itemList.get(i);
                }

                if(itemList.get(i).getSellCost()>maxPrice){
                    maxPrice=itemList.get(i).getSellCost();

                }

            }//FIN DEL FOR

            //AHORA ANALIZAMOS EL % DE DIFERENCIA
                //200

            if(minPriceItem!=null){

                float percentMaxPrice=maxPrice*100/minPrice;//REGLA DE 3 SIMPLE OBTENEMOS EL % DE DIFERENCIA
                //100
                float percentDiference=percentMaxPrice-100;

                if(percentDiference>=30){//SI EL % OBTENIDO ES MAYOR DE 30% ENTONCES..
                    float percentPriceRise=percentDiference-29;
                    minPriceItem.setSellCost(minPrice*(1 +percentPriceRise/100));
                    //LE AUMENTO EL PORCENTAJE CALCULADO PARA QUE HAYA UN 29% DE DIFERENCIA NOMAS
                }
            }


        }

    }



    public void printItems() {

        for(List list: getListOfLists()){

            for(Item item:list.getItemsToSell()){

               System.out.println(item.getDetail());
            }
        }
    }



}
