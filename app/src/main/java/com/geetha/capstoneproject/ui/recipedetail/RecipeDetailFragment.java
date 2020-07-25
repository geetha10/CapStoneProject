package com.geetha.capstoneproject.ui.recipedetail;

import android.os.Bundle;
import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geetha.capstoneproject.Constants;
import com.geetha.capstoneproject.R;
import com.geetha.capstoneproject.models.Recipe;

import org.parceler.Parcels;

public class RecipeDetailFragment extends Fragment {

    ImageView mRecipeImage;
    TextView mRecipeName;
    TextView mPrepTime;
    TextView mPortionFor;
    RecyclerView mIngredientsRV;
    Recipe recipe;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate (R.layout.recipe_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        recipe= Parcels.unwrap (getArguments ().getParcelable (Constants.RECIPE_KEY));
        mRecipeImage=view.findViewById (R.id.recipe_image);
        mRecipeName=view.findViewById (R.id.recipe_name_tv);
        mPrepTime=view.findViewById (R.id.prepTime_tv);
        mPortionFor=view.findViewById (R.id.portionFor_tv);
        mIngredientsRV=view.findViewById (R.id.ingredients_rv);
        mRecipeName.setText (recipe.getTitle ());
        Glide.with (getContext ()).load (recipe.getImage ()).into (mRecipeImage);
    }
}
