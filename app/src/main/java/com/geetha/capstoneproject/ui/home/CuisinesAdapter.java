package com.geetha.capstoneproject.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geetha.capstoneproject.R;
import com.geetha.capstoneproject.models.Recipe;

import java.util.List;

public class CuisinesAdapter extends RecyclerView.Adapter<CuisinesAdapter.CusinesViewHolder> {


    Context context;
    List <Recipe> mRecipeList;


    public CuisinesAdapter(Context context, List <Recipe> mRecipeList) {
        this.mRecipeList = mRecipeList;
        this.context=context;

    }

    @NonNull
    @Override
    public CusinesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from (parent.getContext ()).inflate (R.layout.item_cuisine,parent,false);
        return new CusinesViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull CusinesViewHolder holder, int position) {
        Recipe recipe = mRecipeList.get (position);
        Glide.with (context).load(R.drawable.indian_cuisine_icon).into (holder.mCuisineImg);
        holder.mCuisineName.setText (recipe.getTitle ());
        holder.mCusineCard.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //callback.onRecipeCardClicked ();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    static  class CusinesViewHolder extends RecyclerView.ViewHolder{

        CardView mCusineCard;
        ImageView mCuisineImg;
        TextView mCuisineName;

        public CusinesViewHolder(@NonNull View itemView) {
            super (itemView);
            mCusineCard=itemView.findViewById (R.id.cuisineCard);
            mCuisineImg=itemView.findViewById (R.id.cuisineImg);
            mCuisineName=itemView.findViewById (R.id.cuisineImg);
        }
    }
}
