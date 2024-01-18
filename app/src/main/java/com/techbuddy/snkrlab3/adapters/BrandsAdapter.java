package com.techbuddy.snkrlab3.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.techbuddy.snkrlab3.MainActivity3;
import com.techbuddy.snkrlab3.MainActivity2;
import com.techbuddy.snkrlab3.NikeActivity;
import com.techbuddy.snkrlab3.AdidasActivity;
import com.techbuddy.snkrlab3.R;
import com.techbuddy.snkrlab3.models.Brands;

import java.util.List;

public class BrandsAdapter extends RecyclerView.Adapter<BrandsAdapter.BrandsViewHolder> {

    Context context;
    List<Brands> brandsList;

    public BrandsAdapter(Context context, List<Brands> brandsList) {
        this.context = context;
        this.brandsList = brandsList;
    }

    @NonNull
    @Override
    public BrandsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.brands_row_item, parent, false);
        return new BrandsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BrandsViewHolder holder, int position) {
        Brands currentBrand = brandsList.get(position);

        holder.brandName.setText(currentBrand.getbrandName());
        holder.brandImage.setImageResource(currentBrand.getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (currentBrand.getbrandName()) {
                    case "Nike":
                        intent = new Intent(context, NikeActivity.class);
                        break;
                    case "Adidas":
                        intent = new Intent(context, AdidasActivity.class);
                        break;
                    default:
                        intent = new Intent(context, MainActivity2.class);
                }
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return brandsList.size();
    }

    public static final class BrandsViewHolder extends RecyclerView.ViewHolder {

        ImageView brandImage;
        TextView brandName;

        public BrandsViewHolder(@NonNull View itemView) {
            super(itemView);

            brandImage = itemView.findViewById(R.id.place_image);
            brandName = itemView.findViewById(R.id.place_name);
        }
    }
}