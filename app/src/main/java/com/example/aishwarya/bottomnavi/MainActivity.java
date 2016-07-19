package com.example.aishwarya.bottomnavi;

import android.support.annotation.IdRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomBar(savedInstanceState);
    }

    private void initBottomBar(Bundle savedInstanceState) {
        BottomBar bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.main_menu, new OnMenuTabSelectedListener() {
            @Override
            public void onMenuItemSelected(@IdRes int menuItemId) {
                switch(menuItemId) {
                    case R.id.recent_item:
                        Snackbar.make(getWindow().getDecorView().findViewById(android.R.id
                                .content), "Recent Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.location_item:
                        Snackbar.make(getWindow().getDecorView().findViewById(android.R.id
                                .content), "Location Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                    case R.id.favorite_item:
                        Snackbar.make(getWindow().getDecorView().findViewById(android.R.id
                                .content), "Favorite Item Selected", Snackbar.LENGTH_LONG).show();
                        break;
                }
            }
        });
        bottomBar.setActiveTabColor("#C2185B");
        bottomBar.useDarkTheme(false);
        bottomBar.setTextAppearance(android.R.style.TextAppearance);
    }

}
