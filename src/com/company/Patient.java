package com.company;

public class Patient extends Bruger {

    public String getName() {
        String titel = "Hr." + super.getName();
        return titel;
// super = brug af metode
    }
}
