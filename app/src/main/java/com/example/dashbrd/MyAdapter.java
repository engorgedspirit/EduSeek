package com.example.dashbrd;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private List<DataClass> dataList;

    public MyAdapter(Context context, List<DataClass> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(dataList.get(position).getClgImage()).into(holder.recImage);
        holder.recName.setText(dataList.get(position).getClgName());
        holder.recMedSal.setText(dataList.get(position).getMedianSalary());
        holder.recHighSal.setText(dataList.get(position).getHighestSalary());
        holder.recbatchPlaced.setText(dataList.get(position).getBatchPlaced());
        holder.recRankNIRF.setText(dataList.get(position).getRankNIRF());
        holder.recAccrNAAC.setText(dataList.get(position).getAccrNAAC());
        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailActivity.class);
                intent.putExtra("Image",dataList.get(holder.getAdapterPosition()).getClgImage());
                intent.putExtra("NIRFRank",dataList.get(holder.getAdapterPosition()).getRankNIRF());
                intent.putExtra("ClgName",dataList.get(holder.getAdapterPosition()).getClgName());
                intent.putExtra("MedSal",dataList.get(holder.getAdapterPosition()).getMedianSalary());
                intent.putExtra("BatchP",dataList.get(holder.getAdapterPosition()).getBatchPlaced());
                intent.putExtra("NAACAcc",dataList.get(holder.getAdapterPosition()).getAccrNAAC());
                intent.putExtra("HSal",dataList.get(holder.getAdapterPosition()).getHighestSalary());

                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void searchDataList(ArrayList<DataClass> searchList){
        dataList= searchList;
        notifyDataSetChanged();
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView recImage;
    TextView recName,recMedSal,recHighSal,recbatchPlaced,recAccrNAAC,recRankNIRF;
    CardView recCard;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        recImage=itemView.findViewById(R.id.recImage);
        recName=itemView.findViewById(R.id.recName);
        recMedSal=itemView.findViewById(R.id.recMsal);
        recHighSal=itemView.findViewById(R.id.recHsal);
        recbatchPlaced=itemView.findViewById(R.id.recBPlcaed);
        recAccrNAAC=itemView.findViewById(R.id.recAccrNaac );
        recRankNIRF=itemView.findViewById(R.id.recRankNirf);
        recCard=itemView.findViewById(R.id.recCard);

    }
}