package com.example.kaak.projet030.controller;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.kaak.projet030.R;
import com.example.kaak.projet030.model.Humeur;

import java.util.Date;


public class MainActivity extends AppCompatActivity {
//DialogBuilder
    ImageView ivSmley;
    Button viewCom;
    Button viewHistory;
    RelativeLayout container;

    int[] smileyImageTab = {R.drawable.smiley_sad, R.drawable.smiley_disappointed, R.drawable.smiley_normal, R.drawable.smiley_happy, R.drawable.smiley_super_happy};
    int position = 3;

    int[] smileyFondTab = {R.color.faded_red, R.color.warm_grey, R.color.cornflower_blue_65, R.color.light_sage, R.color.banana_yellow};
    //int position = 3;

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

        long now = System.currentTimeMillis();
        Date maDate = new Date(now);
        System.out.println();
        System.out.print(maDate);

//android cheat sheet
        ivSmley.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {

            public void onSwipeTop() {

                //humeur++;
                if (position < smileyImageTab.length -1) {
                    position++;
                    Toast.makeText(MainActivity.this, "top - " + position, Toast.LENGTH_SHORT).show();
                    ivSmley.setImageResource(smileyImageTab[position]);
                    container.setBackgroundResource(smileyFondTab[position]);
                }
            }

            public void onSwipeRight() {
                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
            }

            public void onSwipeLeft() {
                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
            }

            public void onSwipeBottom() {

                if (position > 0) {
                    position--;
                    Toast.makeText(MainActivity.this, "bottom - " + position, Toast.LENGTH_SHORT).show();
                    ivSmley.setImageResource(smileyImageTab[position]);
                    container.setBackgroundResource(smileyFondTab[position]);

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

    @Override
    protected void onPause(){
        super.onPause();

    }
    @Override
    protected void onResume(){
        super.onResume();

    /*
    Pour sauvegarder une humeur i va falloir convertir l'humeur en String grâce à GSon.
    Ensuite avec les prefs on enregistre la string.
    Quand on voudra récupérer l'humeur, on récupèrera la string sauvegardée, puis grâce à GSon
    on reconvertira en objet Humeur.

    Il faudra peut-être enregistrer plusieurs humeurs. Pour cela on stockera d'abord les
    humeurs soit dans un tableau, soit dans ce qu'on appelle un ArrayList
     */

    private void saveMood(Humeur humeur) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        //d'abord sauvegarder en json (avec GSon) =>car ça renvoie une chaine de caractères
            //String humeurConvertitEnStringJson = Gson.convertToJson(humeur);

        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("msgKey", humeurConvertitEnStringJson);
        editor.apply();
    }

    private Humeur retrieveMood() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //si je voulais récupérer une valeur
        String jsonMood = prefs.getString("msgKey", "valeur par défaut");
        //convertir jsonMood en objet Humeur tout cela grâce à GSon
    }
}
