package com.example.miguel.realmejemplo.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import com.example.miguel.realmejemplo.application.MyApplication;
public class Dog extends RealmObject {

    @PrimaryKey
    private int Id;
    private String Name;

    public Dog() {} // Only for Realm

    public Dog(String name) {
        Id = MyApplication.DogID.incrementAndGet();
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}