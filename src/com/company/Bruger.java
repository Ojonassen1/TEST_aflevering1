package com.company;

public abstract class Bruger {
    int id;
    String name;
    private int count = 0;

    public int getId(){
        //System.out.println(id);
        return id;
    }

    public void setId(){

    }

    public void setName(String inputstring){

        count++;
        name = inputstring;
    }

    public String getName() {
        //System.out.println(name);
        return name;
    }
}