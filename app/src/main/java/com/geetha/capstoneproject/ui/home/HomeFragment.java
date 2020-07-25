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
import androidx.fragment.app.FragmentTransaction;
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
import com.geetha.capstoneproject.ui.recipedetail.RecipeDetailFragment;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment implements RecipesAdapter.RecipeClickCallback {

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
       homeViewModel = new ViewModelProvider (this).get (HomeViewModel.class);
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
        selectedRecipesAdapter = new RecipesAdapter (getContext (),mRecipeList,this);
        favRecipesAdapter = new RecipesAdapter (getContext (),mRecipeList,this);
        cuisinesAdapter = new CuisinesAdapter (getContext (),mRecipeList);
        mSelectedRecipesRV.setAdapter (selectedRecipesAdapter);
        mFavoriteRecipesRV.setAdapter (favRecipesAdapter);
    }

    void onRecipesFetched(List <Recipe> recipes) {
        mRecipeList.clear ();
        mRecipeList.addAll (recipes);
        selectedRecipesAdapter.notifyDataSetChanged ();
    }

    @Override
    public void onRecipeCardClicked(Recipe recipe) {
        RecipeDetailFragment recipeDetailFragment=new RecipeDetailFragment ();
        Bundle bundle = new Bundle ();
        bundle.putParcelable (Constants.RECIPE_KEY, Parcels.wrap (recipe));
        recipeDetailFragment.setArguments (bundle);
        getActivity ().getSupportFragmentManager ()
                .beginTransaction ()
                .replace (R.id.nav_host_fragment,recipeDetailFragment)
                .addToBackStack (null)
                .commit ();
    }
}