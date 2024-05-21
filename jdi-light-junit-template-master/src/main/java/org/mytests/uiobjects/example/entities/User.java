package org.mytests.uiobjects.example.entities;


import com.jdiai.tools.DataClass;

public class User extends DataClass<User> {
    public String name = "technopol60";
    public String password = "technopolisPassword";
    public long id;

    public User(){}

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, long id){
        this(name, password);
        this.id = id;
    }
}
