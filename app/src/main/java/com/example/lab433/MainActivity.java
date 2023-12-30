package com.example.lab433;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv);
        ArrayList<Contact>arrContact=new ArrayList<>();
        Contact contact1=new Contact( "Nguyen Van A", "024721774682", "RED");
        Contact contact2=new Contact("Tran Van B","0987654332", "RED");
        arrContact.add(contact1);
        arrContact.add(contact2);
        CustomAdapter adapter=new CustomAdapter(this,R.layout.item_listview.arrContact);
        lvContact.setAdapter(adapter);
    }
}