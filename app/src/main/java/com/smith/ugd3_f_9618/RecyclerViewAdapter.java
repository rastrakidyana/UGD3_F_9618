package com.smith.ugd3_f_9618;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.smith.ugd3_f_9618.databinding.AdapterRecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context context;
    private List<Mahasiswa> result;

    public RecyclerViewAdapter(){}

    public RecyclerViewAdapter(Context context, List<Mahasiswa> result){
        this.context = context;
        this.result = result;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
         AdapterRecyclerViewBinding adapterRecyclerViewBinding = DataBindingUtil.inflate(
                 LayoutInflater.from(viewGroup.getContext()),R.layout.adapter_recycler_view,viewGroup,false);

        MyViewHolder myViewHolder = new MyViewHolder(adapterRecyclerViewBinding);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Mahasiswa mhs = result.get(position);
        holder.adapterRecyclerViewBinding.setMhs(mhs);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
       AdapterRecyclerViewBinding adapterRecyclerViewBinding;

        public MyViewHolder(@NonNull AdapterRecyclerViewBinding itemView){
            super(itemView.getRoot());
            adapterRecyclerViewBinding = itemView;
        }
    }
}