package com.example.navruz.gridview.adapter;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navruz.gridview.R;
import com.example.navruz.gridview.entity.ItemObject;

import java.util.List;

/**
 * Created by Navruz on 28.12.2015.
 */
public class GridAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private List<ItemObject> mData;

    public GridAdapter(List<ItemObject> data) {
        this.mData = data;

    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null, false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.photo.setImageResource(mData.get(position).getImage());
        holder.name.setText(mData.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView name;
    public ImageView photo;

    public CustomViewHolder(View view) {
        super(view);
        view.setOnClickListener(this);
        name = (TextView) view.findViewById(R.id.name);
        photo = (ImageView) view.findViewById(R.id.photo);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Item Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
