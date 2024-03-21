package pl.wojtek.a21_03_24_kart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Consumer;

import android.content.Intent;
import android.content.res.Configuration;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> obrazki = new ArrayList<>();
        obrazki.add(R.drawable.kwiaty1);
        obrazki.add(R.drawable.kwiaty2);
        obrazki.add(R.drawable.kwiaty3);


        Button button1 = findViewById(R.id.button11);

        ImageView ImageView11 = findViewById(R.id.imageView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numer_zdjecia = (int) (Math.random() * obrazki.size());
                ImageView11.setImageResource(obrazki.get(numer_zdjecia));
            }
        });


        EditText EditText11 = findViewById(R.id.editText1);

       Button button33 = findViewById(R.id.button3);

       button33.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(EditText11 != null){
                   int numer_ze_zdjecia = Integer.valueOf(EditText11.getText().toString());
                   if(numer_ze_zdjecia < 0 || numer_ze_zdjecia >= obrazki.size()){
                       Toast.makeText(MainActivity.this, "Nie ma takiego obrazka", Toast.LENGTH_SHORT).show();
                   }
                   else{
                       ImageView11.setImageResource(obrazki.get(numer_ze_zdjecia));
                   }
               }
           }
       });

       Button Button2 = findViewById(R.id.button2);

       Button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ImageView11.setVisibility(obrazki.get(0));
           }
       });
    }
}