package com.example.mrv.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mrv.R;
import com.example.mrv.adapters.ContactsIconRecyclerViewAdapter;
import com.example.mrv.adapters.ContactsRecyclerViewAdapter;
import com.example.mrv.pojo.ContactsIconModel;
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
        iconsAdapter = new ContactsIconRecyclerViewAdapter(setContactsIcon());

        contactsRV = findViewById(R.id.contactRV);
        iconsRV = findViewById(R.id.iconRV);

        contactsRV.setAdapter(contactsAdapter);
        iconsRV.setAdapter(iconsAdapter);

    }

    protected List<ContactsIconModel> setContactsIcon() {
        List<ContactsIconModel> icons  = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            icons.add(new ContactsIconModel(R.drawable.user));
        }

        return icons;
    }

    protected List<ContactsModel> setContacts() {
        List<ContactsModel> contacts = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            contacts.add(new ContactsModel(R.drawable.user, "UserName" + i, i % 3 == 0 ? "Online" : "Offline"));
        }

        return contacts;
    }

}