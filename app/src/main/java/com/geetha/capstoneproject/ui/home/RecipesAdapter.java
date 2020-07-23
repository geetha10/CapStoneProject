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

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.RecipesViewHolder> {

    Context context;
    List <Recipe> mRecipeList;


    public RecipesAdapter(Context context, List <Recipe> mRecipeList) {
        this.mRecipeList = mRecipeList;
        this.context=context;

    }

    @NonNull
    @Override
    public RecipesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from (parent.getContext ()).inflate (R.layout.item_recipe_card,parent,false);
        return new RecipesViewHolder (view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipesViewHolder holder, int position) {
        Recipe recipe = mRecipeList.get (position);
        Glide.with (context).load (recipe.getImage ()).into (holder.mRecipeImg);
        holder.mRecipeName.setText (recipe.getTitle ());

    }

    @Override
    public int getItemCount() {
        return mRecipeList.size ();
    }

    static  class RecipesViewHolder extends RecyclerView.ViewHolder{

        CardView mRecipeCard;
        ImageView mRecipeImg;
        TextView mRecipeName;

        public RecipesViewHolder(@NonNull View itemView) {
            super (itemView);
            mRecipeCard=itemView.findViewById (R.id.recipe_card);
            mRecipeImg=itemView.findViewById (R.id.recipe_img);
            mRecipeName=itemView.findViewById (R.id.recipeName_tv);
        }
    }
}
