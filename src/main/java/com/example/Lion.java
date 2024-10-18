package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private InterfaceFeline interfaceFeline;

    public Lion(String sex, InterfaceFeline interfaceFeline) throws Exception {
        this.interfaceFeline = interfaceFeline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() {
        return interfaceFeline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return interfaceFeline.animal.getFood("Хищник");
    }
}
