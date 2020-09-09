package com.catatancodingku.recyclerviewapk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private String[] namaBuah;
    private int[] gambarBuah;

    public RecyclerAdapter(String[] namaBuah, int[] gambarBuah) {
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivGamvarBuah;
        TextView tvNamaBuah;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivGamvarBuah = itemView.findViewById(R.id.item_gambar);
            tvNamaBuah = itemView.findViewById(R.id.item_text);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_buah,parent,false);
        MyViewHolder mvh = new MyViewHolder(itemView);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {

        holder.tvNamaBuah.setText(namaBuah[position]);
        holder.ivGamvarBuah.setImageResource(gambarBuah[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Anda memilih : "+ namaBuah[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return gambarBuah.length;
    }


}
