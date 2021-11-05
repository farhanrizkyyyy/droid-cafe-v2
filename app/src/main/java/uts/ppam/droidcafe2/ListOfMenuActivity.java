package uts.ppam.droidcafe2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.List;

public class ListOfMenuActivity extends AppCompatActivity {

    List<uts.ppam.droidcafe2.Menu> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_menu);

        getSupportActionBar().setTitle("Menu Cafe");

        RecyclerView menuRecycleView = findViewById(R.id.menu_list_recycle_view);
        menuList = MenuSource.getMenu(getApplicationContext());

        MenuAdapter adapter = new MenuAdapter(menuList);
        menuRecycleView.setAdapter(adapter);
        menuRecycleView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        startActivity(new Intent(this, MainActivity.class));
        this.finish();

        return true;
    }
}