package com.example.shufflepuzzles;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        placeTile();
    }

    public void CreateTile (View view) {
    }

    public void placeTile () {
        int diff = 6;
        RelativeLayout layout = findViewById(R.id.tile_pane);
        int color = Color.parseColor("#D8BD97");
        int tileSize = 150;

        int screenWidthPx = layout.getWidth();
        int screenHeightPx = layout.getHeight();

        int plsWork = (screenWidthPx/diff) - 150;

        LetterTile tile = new LetterTile(this,'j', tileSize, color);

        tile.setX(150);
        tile.setY(1000);

        LetterTile tile2 = new LetterTile(this,'j', tileSize, color);

        tile2.setX(plsWork*2);
        tile2.setY(1000);

        LetterTile tile3 = new LetterTile(this,'j', tileSize, color);

        tile3.setX(plsWork*3);
        tile3.setY(1000);

        LetterTile tile4 = new LetterTile(this,'j', tileSize, color);

        tile4.setX(plsWork*4);
        tile4.setY(1000);

        LetterTile tile5 = new LetterTile(this,'j', tileSize, color);

        tile5.setX(plsWork*5);
        tile5.setY(1000);

        LetterTile tile6 = new LetterTile(this,'j', tileSize, color);

        tile6.setX(plsWork*6);
        tile6.setY(1000);



        layout.addView(tile);
        layout.addView(tile2);
        layout.addView(tile3);
        layout.addView(tile4);
        layout.addView(tile5);
        layout.addView(tile6);
    }

}
