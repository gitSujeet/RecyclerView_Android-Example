package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrContacts;
    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageContact.setImageResource(arrContacts.get(position).image);
        holder.textNum.setText(arrContacts.get(position).number);
        holder.textName.setText(arrContacts.get(position).name);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textName, textNum;
        ImageView imageContact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textName = itemView.findViewById(R.id.txtName);
            textNum = itemView.findViewById(R.id.txtNumber);
            imageContact = itemView.findViewById(R.id.imageContact);
        }

    }
}
