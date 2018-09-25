package it.codedoge;

import it.codedoge.NameProvider;

public class Greeter {

    private NameProvider nameProvider;

    public Greeter(NameProvider nameProvider) {
        this.nameProvider = nameProvider;
    }

    public String greet() {
        return String.format("Hi! %s.", nameProvider.getName());
    }

}
