package com.geetha.capstoneproject.network;

import com.geetha.capstoneproject.Constants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {


    public static RecipeService get() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder ()
                .baseUrl (Constants.RECIPE_API_BASE_URL)
                .addConverterFactory (GsonConverterFactory.create ())
                .client (httpClient.build ())
                .build ();
        return retrofit.create (RecipeService.class);
    }
}
