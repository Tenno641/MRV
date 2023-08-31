package com.example.mrv.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mrv.R;
import com.example.mrv.pojo.ContactsModel;

import java.util.List;

public class ContactsIconRecyclerViewAdapter extends RecyclerView.Adapter<ContactsIconRecyclerViewAdapter.ViewHolder> {

    List<ContactsModel> icons;

    public ContactsIconRecyclerViewAdapter(List<ContactsModel> icons) {
        this.icons = icons;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_icon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ContactsModel contact = icons.get(position);
        holder.icon.setImageResource(contact.getImage());
        if (contact.getState().equals("Offline")) {
            holder.stateIcon.setCardBackgroundColor(Color.RED);
        } else {
            holder.stateIcon.setCardBackgroundColor(Color.GREEN);
        }
    }

    @Override
    public int getItemCount() {
        return icons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        CardView stateIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.userIcon);
            stateIcon = itemView.findViewById(R.id.stateIcon);
        }
    }

}
