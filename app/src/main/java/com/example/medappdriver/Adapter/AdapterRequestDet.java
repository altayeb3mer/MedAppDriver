package com.example.medappdriver.Adapter;


import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;


import com.example.medappdriver.Model.ModelRequest;
import com.example.medappdriver.R;

import java.util.ArrayList;


public class AdapterRequestDet extends RecyclerView.Adapter<AdapterRequestDet.ViewHolder> {

    ArrayList<ModelRequest> newsPaperArrayList;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;
    private Activity activity;
    public AdapterRequestDet(Activity activity, ArrayList<ModelRequest> newsPaperArrayList) {
        this.mInflater = LayoutInflater.from(activity);
        this.newsPaperArrayList = newsPaperArrayList;
        this.activity = activity;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.new_request_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final ModelRequest item = newsPaperArrayList.get(position);

//

        holder.textView_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.container.getVisibility()==View.VISIBLE){
                    holder.container.setVisibility(View.GONE);
                }else {
                    holder.container.setVisibility(View.VISIBLE);
                }

            }
        });


    }


    @Override
    public int getItemCount() {
        return newsPaperArrayList.size();
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }


    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        LinearLayout container;
        AppCompatButton buttonSubscription;
        TextView textView_title,textView_type,textView_release_type,textView_release_time;
        ImageView imageView;


        ViewHolder(View itemView) {
            super(itemView);


//            imageView = itemView.findViewById(R.id.img);
            container = itemView.findViewById(R.id.container);
//            buttonSubscription = itemView.findViewById(R.id.btn_sub);
            textView_title = itemView.findViewById(R.id.txtPharmachy);

//            textView_type = itemView.findViewById(R.id.news_item_type);
//            textView_release_type = itemView.findViewById(R.id.news_item_release_type);
//            textView_release_time = itemView.findViewById(R.id.news_item_release_time);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }


}

