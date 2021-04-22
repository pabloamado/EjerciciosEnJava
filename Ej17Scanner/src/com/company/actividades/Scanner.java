package com.company.actividades;

public class Scanner {

    public void scanItem(Item item, boolean root){


        if(root) {// SI ES UN OBJETO RAIZ

            if(item.getItemList().isEmpty()) {//SI DENTRO SUYO NO HAY NADA ENTONCES...

                item.setSimple(true);
                printItemInfo(item);

            }else {// EL ITEM CONTIENE COSAS

                item.setContainer(true);
                printItemInfo(item);

                for(int i=0;i<item.getItemList().size();i++) {

                    scanItem(item.getItemList().get(i), false);
                }
            }

        } else {// SI EL ITEM NO ES RAIZ ESTA CONTENIDO

            item.setContained(true);

            if(!item.getItemList().isEmpty()){// SI EL ITEM CONTENIDO TIENE OBJETOS ENTONCES..

                item.setObjectBetween(true);
                item.setContainer(true);
                printItemInfo(item); //TENGO QUE IMPRIMIR LA INFO DEL ITEM ANTES DE QUE ENTRE AL BUCLE

                for(int i=0;i<item.getItemList().size();i++){

                    scanItem(item.getItemList().get(i), false);
                }

            }else{// SI NO CONTIENE NADA IMPRIMO LA INFO

                printItemInfo(item);
            }

        }

    }


    private void printItemInfo(Item item){

        System.out.println("material: "+item.getMaterialType() );
        System.out.println("volumen: "+item.getVolume());
        System.out.println("Es un objeto simple?: "+item.isSimple());
        System.out.println("Es un contenedor?: "+item.isContainer());
        System.out.println("Esta contenido?: "+item.isContained());
        System.out.println("Esta entre 2 objetos?: "+item.isBetween());
        System.out.println("------------------------------------------");
    }


}