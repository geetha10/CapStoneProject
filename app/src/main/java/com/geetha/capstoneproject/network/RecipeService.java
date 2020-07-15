package com.geetha.capstoneproject.network;

import com.geetha.capstoneproject.models.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RecipeService {

    @GET
    Call <List <Recipe>> getAllRecipes();
}
