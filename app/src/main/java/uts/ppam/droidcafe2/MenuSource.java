package uts.ppam.droidcafe2;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class MenuSource {

    public static List<Menu> getMenu(Context context) {

        String[] imagePath = {"Cireng", "Mie Goreng", "Nasi Goreng", "Cappuchino", "Kopi Hitam"};
        String[] menuName = {"Cireng", "Mie Goreng", "Nasi Goreng", "Cappuchino", "Kopi Hitam"};
        String[] menuDescription = {
                context.getString(R.string.cireng_desc),
                context.getString(R.string.mie_goreng_desc),
                context.getString(R.string.nasi_goreng_desc),
                context.getString(R.string.cappuchino_desc),
                context.getString(R.string.kopi_hitam_desc),
        };
        String[] menuPrice = {"10.000", "10.000", "10.000", "10.000", "10.000"};
        Drawable[] menuImage = {
                context.getDrawable(R.drawable.cireng),
                context.getDrawable(R.drawable.mie_goreng),
                context.getDrawable(R.drawable.nasigoreng),
                context.getDrawable(R.drawable.cappuchino),
                context.getDrawable(R.drawable.kopi_hitam),
        };
        List<Menu> menuList = new ArrayList<Menu>();

        for(int i = 0; i < menuImage.length; i++) {
            menuList.add((new Menu(menuName[i], menuDescription[i], menuPrice[i], menuImage[i])));
        }

        return menuList;
    }
}
