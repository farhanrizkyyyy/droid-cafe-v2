package uts.ppam.droidcafe2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    public List<Menu> listOfMenu;

    public MenuAdapter(List<Menu> menu) {
        this.listOfMenu = menu;
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View menuView = inflater.inflate(R.layout.menu_card, parent, false);

        ViewHolder menuViewHolder = new ViewHolder(menuView);

        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(MenuAdapter.ViewHolder holder, int position) {

        Menu menu = listOfMenu.get(position);
        TextView menuNameTextView = holder.menuNameTextView;
        ImageView menuImageView = holder.menuImageView;
        TextView menuPriceTextView = holder.menuPriceTextView;

        menuNameTextView.setText(menu.name);
        menuPriceTextView.setText(menu.price);
        menuImageView.setImageDrawable(menu.imagePath);
    }

    public int getItemCount() {
        return listOfMenu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView menuNameTextView;
        public TextView menuPriceTextView;
        public ImageView menuImageView;

        public ViewHolder(View v) {

            super(v);

            menuNameTextView = (TextView) v.findViewById(R.id.menu_name);
            menuPriceTextView = (TextView) v.findViewById(R.id.menu_price);
            menuImageView = (ImageView) v.findViewById(R.id.menu_image);

            v.setOnClickListener(this);
        }

        public void onClick(View v) {
            int layoutPosition = getLayoutPosition();
            Intent intent = new Intent(v.getContext(), DetailMenuActivity.class);
            intent.putExtra("index", layoutPosition);
            v.getContext().startActivity(intent);
        }
    }
}
