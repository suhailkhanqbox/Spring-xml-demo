package com.stackroute.domain;

public class Actor {

    private String name;
    private String gender;
    private int age;

  /*  public Actor(String name,String gender,int age) {
        System.out.println("actor object created");
        this.name=name;
        this.age=age;
        this.gender=gender;
    }*/



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
