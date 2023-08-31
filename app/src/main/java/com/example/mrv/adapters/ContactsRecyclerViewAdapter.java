package com.example.mrv.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mrv.R;
import com.example.mrv.pojo.ContactsModel;

import java.util.List;

public class ContactsRecyclerViewAdapter extends RecyclerView.Adapter<ContactsRecyclerViewAdapter.ViewHolder> {

    List<ContactsModel> contacts;

    public ContactsRecyclerViewAdapter(List<ContactsModel> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_contact, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContactsModel contact = contacts.get(position);
        holder.name.setText(contact.getName());
        holder.state.setText(contact.getState());
        if (holder.state.getText().toString().equals("Offline")) {
            holder.state.setTextColor(Color.RED);
            holder.stateIcon.setCardBackgroundColor(Color.RED);
        } else {
            holder.state.setTextColor(Color.GREEN);
            holder.stateIcon.setCardBackgroundColor(Color.GREEN);
        }
        holder.image.setImageResource(contact.getImage());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, state;
        ImageView image;
        CardView stateIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.contactNameTV);
            state = itemView.findViewById(R.id.contactStateTV);
            image = itemView.findViewById(R.id.contactIV);
            stateIcon = itemView.findViewById(R.id.stateIcon);
        }
    }

}
