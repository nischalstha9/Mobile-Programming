package com.nischalstha9.lab15_databaseintegrationcontactapp;

public class Contact {
    public int id;
    public String name;
    public String _phone_number;

    public Contact(){}

    public Contact(String name, String phn_no){
        this.name = name;
        this._phone_number=phn_no;
    }

    public Contact(int id, String name, String phn_no){
        this.id = id;
        this.name = name;
        this._phone_number=phn_no;
    }
}
