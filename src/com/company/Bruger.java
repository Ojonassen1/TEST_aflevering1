package com.company;

import java.sql.SQLOutput;

public abstract class Bruger {
    private int id ;
    String name;
    private int count = 0;

    public void getId(){
        System.out.println(id);

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