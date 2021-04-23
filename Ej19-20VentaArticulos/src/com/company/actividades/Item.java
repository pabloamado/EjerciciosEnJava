package com.company.actividades;

public class Item {

    private Article article;
    private float sellCost;

    public Item(Article article, float sellCost) {
        this.article = article;
        this.sellCost = sellCost;
    }

    public Article getArticle() {
        return article;
    }

    public float getSellCost() {
        return sellCost;
    }

    public void setSellCost(float sellCost) {
        this.sellCost=sellCost;
    }

    public String getDetail(){
        String detail="";
       detail+="Articulo: "+ article.getName()+ "\nPrecio de venta: "+ sellCost +
                "\nCosto de produccion: "+ article.getCost();
       if(article.getObservation()!=null){
           detail+="\nObservacion: " + article.getObservation();
       }

    return detail;

    }


}
