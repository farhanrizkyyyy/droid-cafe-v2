package uts.ppam.droidcafe2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailMenuActivity extends AppCompatActivity {

    TextView menuNameTextView;
    TextView menuPriceTextView;
    TextView menuDescriptionTextView;
    ImageView menuImageView;
    List<Menu> menuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        getSupportActionBar().setTitle("Menu Detail");

        menuList = MenuSource.getMenu(getApplicationContext());
        setMenuData(getIntent().getIntExtra("index", -1));
    }

    void setMenuData(int index) {
        if (index < 0) {
            menuPriceTextView = findViewById(R.id.menu_price);
            menuPriceTextView.setText("Data Not Found");
        } else {
            Menu menu = menuList.get(index);

            menuImageView = findViewById(R.id.menu_image);
            menuNameTextView = findViewById(R.id.menu_name);
            menuDescriptionTextView = findViewById(R.id.menu_description);
            menuPriceTextView = findViewById(R.id.menu_price);

            menuImageView.setImageDrawable(menu.imagePath);
            menuNameTextView.setText(menu.name);
            menuPriceTextView.setText(menu.price);
            menuDescriptionTextView.setText(menu.desc);
        }
    }
}