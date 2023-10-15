package com.example.recyclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<ContactModel> arrayList;
    int lastPosition = -1;

    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.contact_row, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.img.setImageResource(arrayList.get(i).img); // data set after viewHolder
        viewHolder.nameView.setText(arrayList.get(i).name);
        viewHolder.numView.setText(arrayList.get(i).num);

        setAnimation(viewHolder.itemView, i);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView nameView, numView;
        ImageView img;

        public ViewHolder(View item) {
            super(item);

            nameView = item.findViewById(R.id.contactName);
            numView = item.findViewById(R.id.contactNum);
            img = item.findViewById(R.id.contactImage);
        }
    }

    public void setAnimation(View item, int pos) {
        if (pos > lastPosition) { // used if we want to animation only when the element is scrolled "first" else no animation
//            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);

            Animation slideIn = AnimationUtils.loadAnimation(context, R.anim.recycler_animation); // Custom animation

            item.startAnimation(slideIn);
            lastPosition = pos; // last load position is assigned to "lastPosition"
        }
    }
}
