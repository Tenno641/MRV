package com.example.mrv.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mrv.R;
import com.example.mrv.pojo.ContactsIconModel;

import java.util.List;

public class ContactsIconRecyclerViewAdapter extends RecyclerView.Adapter<ContactsIconRecyclerViewAdapter.ViewHolder> {

    List<ContactsIconModel> icons;

    public ContactsIconRecyclerViewAdapter(List<ContactsIconModel> icons) {
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
        ContactsIconModel iconModel = icons.get(position);
        holder.icon.setImageResource(iconModel.getImage());
    }

    @Override
    public int getItemCount() {
        return icons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.userIcon);
        }
    }

}
