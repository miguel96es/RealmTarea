package com.example.miguel.realmejemplo.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import com.example.miguel.realmejemplo.application.MyApplication;

public class Person extends RealmObject {

    @PrimaryKey
    private int Id;
    private String Name;
    private RealmList<Dog> Dogs;

    public Person() {} // Only for Realm

    public Person(String name) {
        Id = MyApplication.PersonID.incrementAndGet();
        Name = name;
        Dogs = new RealmList<Dog>();
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

    public RealmList<Dog> getDogs() {
        return Dogs;
    }

}