package com.geetha.capstoneproject.network;

import com.geetha.capstoneproject.models.RecipeSearchResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RecipeService {

    @GET("complexSearch")
    Call <RecipeSearchResult> getAllRecipes(@Query("apiKey") String apiKey,
                                            @Query("cuisine") String cuisine,
                                            @Query("instructionsRequired") Boolean instructionsRequired,
                                            @Query("addRecipeInformation") Boolean addRecipeInformation,
                                            @Query("diet") String diet,
                                            @Query("intolerances") String intolerances,
                                            @Query("type") String type,
                                            @Query("maxReadyTime") int maxReadyTime);


}
