package com.example.investmentideas;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;

public class StockSelector extends ExploreAcitivty{
//        ImageView imageView = findViewById(R.id.imageExplore);


    public void select() {

        //ExploreAcitivty.tickerExplore.setText("ABC");
        //ExploreAcitivty.companyNameEx.setText("this works");
        //ExploreAcitivty.exploreTextview.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADD");

      //  ExploreAcitivty.imageExplore.setImageResource(R.drawable.note);
        //boolean exploreRunning = true;
        //while (exploreRunning) {
        //    int i = 0; }


        StockRepository stockRepository = new StockRepository(getApplicationContext());
        String companyName = "Microsoft";
        String overview = "Hello does this compute?";
        stockRepository.insertTask(companyName ,overview);

    }
}
