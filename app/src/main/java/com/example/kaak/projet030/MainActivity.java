package com.example.kaak.projet030;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView ivSmley;
    Button viewCom;
    Button viewHistory;
    RelativeLayout container;

    int[] smileyImageTab = {R.drawable.smiley_sad, R.drawable.smiley_disappointed, R.drawable.smiley_normal, R.drawable.smiley_happy, R.drawable.smiley_super_happy};
    int position = 3;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //On relie le code au fichier XML
        ivSmley = findViewById(R.id.ivSmiley);
        viewCom = findViewById(R.id.viewCom);
        //final Button viewHistory = findViewById(R.id.viewHistory);
        viewHistory = findViewById(R.id.viewHistory);

        //final RelativeLayout container = (RelativeLayout) findViewById(R.id.container);
        container = (RelativeLayout) findViewById(R.id.container);


        ivSmley.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {

            public void onSwipeTop() {
                Toast.makeText(MainActivity.this, "top - " + position, Toast.LENGTH_SHORT).show();
                //humeur++;
                if (position < smileyImageTab.length) {
                    position++;
                    ivSmley.setImageResource(smileyImageTab[position]);
                    container.setBackgroundResource(R.color.banana_yellow);
                }
            }

            public void onSwipeRight() {
                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
            }

            public void onSwipeLeft() {
                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
            }

            public void onSwipeBottom() {
                Toast.makeText(MainActivity.this, "bottom - " + position, Toast.LENGTH_SHORT).show();
                if (position > 0) {
                    position--;
                    ivSmley.setImageResource(smileyImageTab[position]);
                    container.setBackgroundResource(R.color.light_sage);
                }
            }

        });


        //public static interface GestureOverlayView.GestureDetector.OnGestureListener

        //ivSmley.setImageResource(R.drawable.smiley_sad);
        //container.setBackgroundColor("@color/banana_yellow");
        //container.setBackgroundResource(R.color.banana_yellow);

        //git remote add origin http://git....
        //https://stackoverflow.com/questions/4139288/android-how-to-handle-right-to-left-swipe-gestures
         /*
        //On dit quoi faire quand on clique sur le bouton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button.setText("Coucou");
                System.out.println("fin");
            }
        });
        */

        //ivSmley.setClickable(true);
        //viewCom.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //   public void onClick(View v) {
        //      Toast.makeText(this, "Coucou", Toast.LENGTH_LONG).show();
        //  }
        //});


    }

}
