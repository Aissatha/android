package com.example.aissatha;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.CookieManager;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));


    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nomView.setText(items.get(position).getNom());
        holder.descView.setText(items.get(position).getDesc());
        holder.imageView.setImageResource(items.get(position).getImage());


    }

    @Override
    public int getItemCount() {
        return   items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Vos champs ViewHolder...

        public ViewHolder(View itemView) {
            super(itemView);

        }
    }

    // Reste du code de l'adapter...

}
