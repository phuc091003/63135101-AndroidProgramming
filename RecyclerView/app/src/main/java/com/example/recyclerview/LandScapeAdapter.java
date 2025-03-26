package com.example.recyclerview;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import android.content.Context;
import java.util.ArrayList;
import android.view.LayoutInflater;
import com.example.recyclerview.R;
import com.example.recyclerview.LandScape;


public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lstData;
    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewholderCreated = new ItemLandHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        LandScape landScapeHienThi = lstData.get(position);
        //trich thong tin
        String caption = landScapeHienThi.getLandCation();
        String tenAnh = landScapeHienThi.getLandImageFileName();

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemLandHolder extends RecyclerView.ViewHolder {
        TextView tvCaption;
        ImageView ivLandscape;
        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
        }
    }


}
