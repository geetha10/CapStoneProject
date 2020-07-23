package com.geetha.capstoneproject.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.geetha.capstoneproject.R;

public class HomeFragment extends Fragment {

    Toolbar homeFragmentToolbar;
    RecyclerView mCuisineRV;
    RecyclerView mSelectedRecipesRV;
    RecyclerView mFavoriteRecipesRV;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate (R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);
        homeFragmentToolbar = view.findViewById (R.id.homeFragment_toolbar);
        mCuisineRV = view.findViewById (R.id.cusine_rv);
        mSelectedRecipesRV=view.findViewById (R.id.selectedRecipes_rv);
        mFavoriteRecipesRV=view.findViewById (R.id.favRecipes_rv);


    }
}
