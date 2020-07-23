package com.geetha.capstoneproject.ui.activites;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.geetha.capstoneproject.Constants;
import com.geetha.capstoneproject.R;
import com.geetha.capstoneproject.models.Recipe;
import com.geetha.capstoneproject.models.RecipeSearchResult;
import com.geetha.capstoneproject.network.RetrofitInstance;
import com.geetha.capstoneproject.ui.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
//    Fragment fragment_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        BottomNavigationView navView = findViewById (R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder (
                R.id.navigation_home, R.id.navigation_pantry,
                R.id.navigation_shopping_list, R.id.navigation_calendar
        ).build ();
        NavController navController = Navigation.findNavController (this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController (this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController (navView, navController);
    }

}



