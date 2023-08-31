package com.example.mrv.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mrv.R;
import com.example.mrv.adapters.ContactsIconRecyclerViewAdapter;
import com.example.mrv.adapters.ContactsRecyclerViewAdapter;
import com.example.mrv.pojo.ContactsModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ContactsRecyclerViewAdapter contactsAdapter;
    ContactsIconRecyclerViewAdapter iconsAdapter;
    RecyclerView contactsRV;
    RecyclerView iconsRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsAdapter = new ContactsRecyclerViewAdapter(setContacts());
        iconsAdapter = new ContactsIconRecyclerViewAdapter(setContacts());

        contactsRV = findViewById(R.id.contactRV);
        iconsRV = findViewById(R.id.iconRV);

        contactsRV.setAdapter(contactsAdapter);
        iconsRV.setAdapter(iconsAdapter);

    }

    protected List<ContactsModel> setContacts() {
        List<ContactsModel> contacts = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            contacts.add(new ContactsModel("UserName" + i, i % 3 == 0 ? "Online" : "Offline", R.drawable.one));
            contacts.add(new ContactsModel("UserName" + i, i % 3 == 0 ? "Online" : "Offline", R.drawable.two));
            contacts.add(new ContactsModel("UserName" + i, i % 3 == 0 ? "Online" : "Offline", R.drawable.three));
            contacts.add(new ContactsModel("UserName" + i, i % 3 == 0 ? "Online" : "Offline", R.drawable.four));
            contacts.add(new ContactsModel("UserName" + i, i % 3 == 0 ? "Online" : "Offline", R.drawable.five));
            contacts.add(new ContactsModel("UserName" + i, i % 3 == 0 ? "Online" : "Offline", R.drawable.six));
            contacts.add(new ContactsModel("UserName" + i, i % 3 == 0 ? "Online" : "Offline", R.drawable.seven));
        }

        return contacts;
    }

}