package com.geetha.capstoneproject.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.geetha.capstoneproject.Constants;
import com.geetha.capstoneproject.R;
import com.geetha.capstoneproject.models.Recipe;
import com.geetha.capstoneproject.models.RecipeSearchResult;
import com.geetha.capstoneproject.network.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private static final String TAG = "HomeFragment";
    List <Recipe> mRecipeList=new ArrayList <> ();
    androidx.appcompat.widget.Toolbar homeFragmentToolbar;
    RecyclerView mCuisineRV;
    RecyclerView mSelectedRecipesRV;
    RecyclerView mFavoriteRecipesRV;
    RecipesAdapter selectedRecipesAdapter;
    RecipesAdapter favRecipesAdapter;
    CuisinesAdapter cuisinesAdapter;

    Observer <List<Recipe>> recipeObserver=new Observer <List <Recipe>> () {
        @Override
        public void onChanged(List <Recipe> recipes) {
            onRecipesFetched (recipes);
        }
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       homeViewModel =
                ViewModelProviders.of (this).get (HomeViewModel.class);

        return inflater.inflate (R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {


        super.onViewCreated (view, savedInstanceState);
        mCuisineRV = view.findViewById (R.id.cusine_rv);
        mSelectedRecipesRV=view.findViewById (R.id.selectedRecipes_rv);
        mFavoriteRecipesRV=view.findViewById (R.id.favRecipes_rv);
        HomeViewModel homeViewModel=new ViewModelProvider (this).get(HomeViewModel.class);
        homeFragmentToolbar = view.findViewById (R.id.homeFragment_toolbar);
        homeViewModel.getRecipesAsync ();
        homeViewModel.recipeLiveData.observe (getViewLifecycleOwner (),recipeObserver);
        selectedRecipesAdapter = new RecipesAdapter (getContext (),mRecipeList);
        favRecipesAdapter = new RecipesAdapter (getContext (),mRecipeList);
        cuisinesAdapter = new CuisinesAdapter (getContext (),mRecipeList);
        mSelectedRecipesRV.setAdapter (selectedRecipesAdapter);
        mFavoriteRecipesRV.setAdapter (favRecipesAdapter);
    }

    /*public List<Recipe> getRecipes() {
        List <Recipe> recipeList = new ArrayList <> ();
        RetrofitInstance.get ().getAllRecipes (
                Constants.API_KEY,
                "indian",
                true,
                true,
                "vegetarian",
                "gluten",
                "main course",
                20).enqueue (new Callback <RecipeSearchResult> () {
            @Override
            public void onResponse(Call <RecipeSearchResult> call, Response <RecipeSearchResult> response) {
                List <Recipe> recipeList=response.body ().getRecipes ();
            }

            @Override
            public void onFailure(Call <RecipeSearchResult> call, Throwable t) {
                Log.e (TAG, "onFailure: ", t);
            }
        });
        return recipeList;
    }*/

    void onRecipesFetched(List <Recipe> recipes) {
        mRecipeList.clear ();
        mRecipeList.addAll (recipes);
        selectedRecipesAdapter.notifyDataSetChanged ();
    }
}