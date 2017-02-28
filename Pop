package com.example.android.madrid;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;


public class Pop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//      Picks the layout to inflate
        setContentView(R.layout.inflate);
//       Take the value of pixels
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
//      Set the dimensions of this layout
        getWindow().setLayout((int)(width*0.8), (int) (height*0.5));
//        Get the picture to pop up
        ImageView Img = (ImageView) findViewById(R.id.poppic);
        Img.setImageResource(getIntent().getExtras().getInt("ItemImage"));

    }
}
