package com.example.techinasia888.kumpulanhadist.adapter;


import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.TextView;

import com.example.techinasia888.kumpulanhadist.DetailActivity;
import com.example.techinasia888.kumpulanhadist.R;
import com.example.techinasia888.kumpulanhadist.model.Doa;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by techinasia888 on 10/22/18.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaAdapter.DoaHolder>{

    Context context;
    List<Doa> item;

    public DoaAdapter(List<Doa> item) {
        this.context = context;
        this.item = item;
    }



    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, null);
        return new DoaHolder(v);
    }

    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.namaDoa.setText(item.get(position).getJudul());
        //holder.txtAyatDoa.setText(item.get(position).getAyat());
        holder.artiDoa.setText(item.get(position).getArti());

        holder.kartuDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DetailActivity.class);
                i.putExtra("id_judul", item.get(position).getJudul());
                i.putExtra("id_ayat", item.get(position).getAyat());
                i.putExtra("id_arti", item.get(position).getArti());
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size() ;
    }

    public class DoaHolder extends RecyclerView.ViewHolder {


        public CardView kartuDoa;
        public ImageView ikonDoa;
        public TextView namaDoa;
        public TextView artiDoa;


        public DoaHolder(View itemView) {
            super(itemView);
            kartuDoa = (CardView) itemView.findViewById(R.id.kartudoa);
            ikonDoa = (ImageView) itemView.findViewById(R.id.ikondoa);
            namaDoa = (TextView) itemView.findViewById(R.id.namadoa);
            artiDoa = (TextView) itemView.findViewById(R.id.artidoa);

        }
    }

}
