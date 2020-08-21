package com.geetha.capstoneproject.ui.home;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.geetha.capstoneproject.Constants;
import com.geetha.capstoneproject.models.Recipe;
import com.geetha.capstoneproject.models.RecipeSearchResult;
import com.geetha.capstoneproject.network.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private static final String TAG = "HomeViewModel";
    private MutableLiveData <List <Recipe>> _recipesLiveData = new MutableLiveData <> ();
    LiveData <List <Recipe>> recipeLiveData = _recipesLiveData;
    List<Recipe> recipeList=new ArrayList <> ();

    void getRecipesAsync() {
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
            public void onResponse(Call < RecipeSearchResult > call, Response <RecipeSearchResult> response) {
                _recipesLiveData.setValue (response.body ().getRecipes ());

            }

            @Override
            public void onFailure(Call <RecipeSearchResult> call, Throwable t) {
                Log.e (TAG, "onFailure: ", t);
            }
        });
    }

}