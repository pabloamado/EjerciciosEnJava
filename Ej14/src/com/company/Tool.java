package com.company;

public class Tool {

    private String toolName;
    private float weight;

    public Tool (String toolName, float weight){
        this.toolName=toolName;
        this.weight=weight;
    }

    public void setToolName(String name){
        toolName=name;

    }

    public void setWeight(float weight){
        this.weight=weight;

    }

    public float getWeight(){
        return weight;

    }

    public String getToolName (){
         return toolName;
    }
}
