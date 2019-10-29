package com.example.testfirebasephone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHolder> {
    ArrayList<Phone> list;

    public AdapterClass(ArrayList<Phone> list){
        this.list = list;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        View mview;
        TextView iphone;
        public MyViewHolder(View itemView){
            super(itemView);
            mview = itemView;
            iphone = mview.findViewById(R.id.iphone);


        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.iphone.setText(list.get(position).getIphone());
    }



    @Override
    public int getItemCount() {
        return list.size();
    }
}
