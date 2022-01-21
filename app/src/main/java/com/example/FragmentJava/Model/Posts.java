package com.example.FragmentJava.Model;

public class Posts {
    String name,surname;
    int profile,image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Posts(int profile, String name, String surname, int image){
        this.profile = profile;
        this.name = name;
        this.surname = surname;
        this.image = image;
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
        return name + " "  + surname + "\n"+ profile; }
}