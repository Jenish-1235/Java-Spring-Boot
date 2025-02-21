package com.java;

public class Alien {
    private int age;
    private String name;
    private UFO ufo;

    public Alien() {}

    // in constructor injection we use parameterised constructor and use constructor-arg type in config xml file and it follows sequence of variables declared in parameter.
    // or else we can use type parameter or we can use index or name attribute to specify mmore clearly. to use name attribute we use @constructorproperties annotation to inject using name attribute.

    public Alien(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UFO getUfo() {
        return ufo;
    }

    public void setUfo(UFO ufo) {
        this.ufo = ufo;
    }
}
