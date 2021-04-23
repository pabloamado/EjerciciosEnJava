package com.company.actividades;

public class Validator {

    private static final int MAX_LONG_NAME =15;
    private static final int MAX_LONG_OBSERV=30;
    private static final float COST_NOT_ALLOWED=0;
    private static String errorMsg="";

    // MAL IMPLEMENTADO PERO ES POR LOS COMENTARIOS DE LOS THROWS
    public  boolean itemIsValid(Item item) //throws Exception{
    {
        boolean isValid=true;

        if (item.getArticle().getCost() <= COST_NOT_ALLOWED) {
            //throw new Exception("El costo de produccion no puede ser 0 o tener un valor inferior.");
            errorMsg+="El costo de produccion no puede ser 0 o tener un valor inferior.\n";
            isValid=false;
        }

        if(item.getArticle().getName().length() > MAX_LONG_NAME) {
            //throw new Exception("El nombre del item supera los 15 caracteres.");
            errorMsg+="El nombre del item supera los 15 caracteres.\n";
            isValid=false;
        }

        if ( item.getArticle().getObservation()!=null &&
                item.getArticle().getObservation().length() > MAX_LONG_OBSERV) {
           // throw new Exception("La observacion no puede superar los 30 caracteres");
            errorMsg+="La observacion no puede superar los 30 caracteres. \n";
            isValid=false;
        }

        return isValid ;

    }

    public String getErrorMsg(){
        return errorMsg;
    }

    public void restartErrorMsg(){
        errorMsg="";
    }

}
