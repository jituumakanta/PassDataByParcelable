package com.example.lenovo.dsfsdfs;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Lenovo on 09-02-2018.
 */

public class Person implements Parcelable {
    private String name;
    private String surname;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeString(email);
    }

    // We reconstruct the object reading from the Parcel data
    public Person(Parcel p) {
        name = p.readString();
        surname = p.readString();
        email = p.readString();
    }

    public Person() {
    }




}