package com.example.mgkan.subclass;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
  TextToSpeech ttobj;
  Button eagle,kiwi,komodo,anaconda,kangaroo,human,call,fox;
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
    fox = (Button) findViewById(R.id.foxButton);

    ttobj = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
      @Override
      public void onInit(int status) {
        if(status != TextToSpeech.ERROR) {
          ttobj.setLanguage(Locale.US);
        }
      }
    });

    eagle.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.baldeagle);
        name.setText("Bald Eagle");
        id.setText("eag0001");
        call.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "America!!!!!!!!!!",
                Toast.LENGTH_SHORT).show();
                break;
              case MotionEvent.ACTION_UP:
                ttobj.setSpeechRate(1f);
                ttobj.speak("America", TextToSpeech.QUEUE_ADD, null, "123ABC");
                break;
            }
            return false;
          }
        });
      }
    });
    fox.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        picture.setImageResource(R.drawable.fox);
        name.setText("Megan Fox");
        id.setText("fox0001");
        call.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "Sexy",
                  Toast.LENGTH_SHORT).show();
                break;
              case MotionEvent.ACTION_UP:
                ttobj.setSpeechRate(1f);
                ttobj.speak("Sexy", TextToSpeech.QUEUE_ADD, null, "123ABC");
                break;
            }
            return false;
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
        call.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "Hissssssss",
                  Toast.LENGTH_SHORT).show();
                break;
              case MotionEvent.ACTION_UP:
                ttobj.setSpeechRate(1f);
                ttobj.speak("Hissssssss", TextToSpeech.QUEUE_ADD, null, "123ABC");
                break;
            }
            return false;
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
        call.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "That's not a knife!",
                  Toast.LENGTH_SHORT).show();
                break;
              case MotionEvent.ACTION_UP:
                ttobj.setSpeechRate(1.5f);
                ttobj.speak("That's not a knife!", TextToSpeech.QUEUE_ADD, null, "123ABC");
                break;
            }
            return false;
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
        call.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "Kiwi Kiwi",
                  Toast.LENGTH_SHORT).show();
                break;
              case MotionEvent.ACTION_UP:
                ttobj.setSpeechRate(1f);
                ttobj.speak("Kiwi Kiwi", TextToSpeech.QUEUE_ADD, null, "123ABC");
                break;
            }
            return false;
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
        call.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "Hissssssss",
                  Toast.LENGTH_SHORT).show();
                break;
              case MotionEvent.ACTION_UP:
                ttobj.setSpeechRate(1f);
                ttobj.speak("Hissssssss", TextToSpeech.QUEUE_ADD, null, "123ABC");
                break;
            }
            return false;
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
        call.setOnTouchListener(new View.OnTouchListener() {
          public boolean onTouch(View v, MotionEvent event) {
            switch(event.getAction()) {
              case MotionEvent.ACTION_DOWN:
                Toast.makeText(getApplicationContext(), "Punch Punch Kick Kick",
                  Toast.LENGTH_SHORT).show();
                break;
              case MotionEvent.ACTION_UP:
                ttobj.setSpeechRate(1f);
                ttobj.speak("Punch Punch Kick Kick", TextToSpeech.QUEUE_ADD, null, "123ABC");
                break;
            }
            return false;
          }
        });
      }
    });
  }
}
