package com.example.mgkan.subclass;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
  TextToSpeech ttobj;
  Button eagle,kiwi,komodo,anaconda,kangaroo,human,call,speak;
  ImageView picture;
  TextView name,id;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    eagle=(Button) findViewById(R.id.eagleButton);
    kiwi=(Button) findViewById(R.id.kiwiButton);
    komodo=(Button) findViewById(R.id.komodoButton);
    anaconda=(Button) findViewById(R.id.anacondaButton);
    kangaroo=(Button) findViewById(R.id.kangarooButton);
    human=(Button) findViewById(R.id.humanButton);
    picture = (ImageView) findViewById(R.id.picture);
    name = (TextView) findViewById(R.id.nameBox);
    id = (TextView) findViewById(R.id.idBox);
    call = (Button) findViewById(R.id.callButton);

    //speak = (Button) findViewById(R.id.button);

//    ttobj = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
//      @Override
//      public void onInit(int status) {
//        if(status != TextToSpeech.ERROR) {
//          //ttobj.setLanguage(Locale.UK);
//          //ttobj.setLanguage(Locale.CANADA);
//          ttobj.setLanguage(Locale.US);
//        }
//      }
//    });

    eagle.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.baldeagle);
        name.setText("Bald Eagle");
        id.setText("eag0001");
        call.setOnClickListener(new View.OnClickListener(){
          public void onClick(View view){
            Toast.makeText(getApplicationContext(), "America!!!!!!!!!!",
              Toast.LENGTH_SHORT).show();
          }
        });
      }
    });
    anaconda.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.anaconda);
        name.setText("Anaconda");
        id.setText("ana0001");
        call.setOnClickListener(new View.OnClickListener(){
          public void onClick(View view){
            Toast.makeText(getApplicationContext(), "Hissssssss",
              Toast.LENGTH_SHORT).show();
          }
        });
      }
    });
    human.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.human);
        name.setText("Human");
        id.setText("hum0001");
        call.setOnClickListener(new View.OnClickListener(){
          public void onClick(View view){
            Toast.makeText(getApplicationContext(), "That's not a knife!",
              Toast.LENGTH_SHORT).show();
          }
        });
      }
    });
    kiwi.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.kiwi);
        name.setText("Kiwi");
        id.setText("kiw0001");
        call.setOnClickListener(new View.OnClickListener(){
          public void onClick(View view){
            Toast.makeText(getApplicationContext(), "Kiwi Kiwi",
              Toast.LENGTH_SHORT).show();
          }
        });
      }
    });
    komodo.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.komododragon);
        name.setText("Komodo Dragon");
        id.setText("kom0001");
        call.setOnClickListener(new View.OnClickListener(){
          public void onClick(View view){
            Toast.makeText(getApplicationContext(), "Hisssssss",
              Toast.LENGTH_SHORT).show();
          }
        });
      }
    });
    kangaroo.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.kangaroo);
        name.setText("Kangaroo");
        id.setText("kan0001");
        call.setOnClickListener(new View.OnClickListener(){
          public void onClick(View view){
            Toast.makeText(getApplicationContext(), "Punch Punch Kick Kick",
              Toast.LENGTH_SHORT).show();
          }
        });
      }
    });
//    speak.setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View v) {
//
//        ttobj.setSpeechRate(2f);
//
//        for (int i = 0; i < 3; i++) {
//          ttobj.speak("Bow wow wow", TextToSpeech.QUEUE_ADD, null, "123ABC");
//        }
//
//        ttobj.setSpeechRate(1f);
//
//        for (int i = 0; i < 3; i++) {
//          ttobj.speak("Moo moo moo", TextToSpeech.QUEUE_ADD, null, "123ABC");
//        }
//
//        ttobj.setSpeechRate(.5f);
//
//        for (int i = 0; i < 3; i++) {
//          ttobj.speak("Quack quack quack", TextToSpeech.QUEUE_ADD, null, "123ABC");
//        }
//
//        //What's the difference between add and flush?
//                /*for (int i = 0; i < 3; i++) {
//                    ttobj.speak("Moo moo moo", TextToSpeech.QUEUE_FLUSH, null, "123ABC");
//                }*/
//      }
//    });
  }
}
