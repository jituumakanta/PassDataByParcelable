package com.example.lenovo.dsfsdfs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        Person p = (Person) b.getParcelable("myPers");
        String name = p.getName();
        String surname = p.getSurname();
        String email = p.getEmail();
        Log.d("MYLOG", "Main2Activity: "+"onCreate: "+"name: "+name);
    }
}
