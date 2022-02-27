package com.nhuy.recyclerviewexample;

public class Persion {
    private String name;
    private boolean isMale;

    public Persion(String duong, boolean b) {
    }

    public void persion(String name, boolean isMale){
        this.name = name;
        this.isMale = isMale;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale(){
        return isMale;
    }

    public void setMale(boolean ismale) {
        this.isMale = ismale;
    }
}
