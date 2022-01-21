package com.example.FragmentJava.Model;

public class User {
    String name,surname;
    int profile;

    public User(int profile,String name, String surname){
        this.profile = profile;
        this.name = name;
        this.surname = surname;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return name + " "  + surname + "\n"+ profile;
    }
}
