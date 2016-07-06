---
title: Subclasses with Animals
type: lab
duration: "1:30"
creator:
    name: Brad Zimmerman
    city: SEA
competencies: Classes and Subclasses
---

# Subclasses Lab: What does the fox say?

## Introduction

You, adventurer, are on a safari working for Geographic National; No. 1 distributor of animal pictures and information in Canada's second biggest province, Manitoba. In your travels, you have managed to track, tag, and record dozens of animals in the wild. Unfortunately, for science, a rainstorm hit your jeep as you were travelling down the streets of Nairobi, ruining the awesome new app you just wrote to show off your animal knowledge. Can you piece the app back together in time?


## Exercise

#### Requirements

- Create an Animal class with the following properties set in the constructor: animalName, animalID, animalCall, animalPicture.
- Create subclasses of Animal called Bird, Reptile, and Mammal
- Create at least two subclasses of Bird, Reptile, and Mammal classes (That means you need to pick 6 animals...)
- Each subclass must have something that makes it unique from its parent class (How are birds, reptiles, and mammals different?)
- Create an Android app with the following requirements:
    - Must have at least 6 animals selectable by buttons
    - When a button is clicked, a view must appear that shows a picture of that animal
    - The name of the animal must appear on top of the animal's picture
    - The id of the animal must appear on top of the animal's picture (The id is a random string of characters you get to make up!)
    - When the animal's picture is clicked, show a toast with the noise that animal makes (A cow goes moo)

**Bonus:**
- Add a fox to your list of animals, and add a [fox call](https://www.youtube.com/watch?v=jofNR_WkoCE)
- [Implement talk to text](https://developer.android.com/reference/android/speech/tts/TextToSpeech.html) when the animal's picture is clicked
- [Move to a new activity](https://bradzzz.gitbooks.io/android-sea/content/03-activities-views/02-intent-to-goto-activity.html) to view an animal's information when it's button is clicked
- [Implement serializable](https://www.javacodegeeks.com/2014/01/android-tutorial-two-methods-of-passing-object-by-intent-serializableparcelable.html) when passing information between activities

#### Starter code

There is no starter code for this lab.

#### Deliverable

An Android app that meets the requirements above.

#### Why not try out this code for the tts(Talk To Speech)?:

```java
public class MainActivity extends AppCompatActivity {

    TextToSpeech ttobj;
    Button speak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speak = (Button) findViewById(R.id.button);

        ttobj = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    //ttobj.setLanguage(Locale.UK);
                    //ttobj.setLanguage(Locale.CANADA);
                    ttobj.setLanguage(Locale.US);
                }
            }
        });

        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ttobj.setSpeechRate(2f);

                for (int i = 0; i < 3; i++) {
                    ttobj.speak("Bow wow wow", TextToSpeech.QUEUE_ADD, null, "123ABC");
                }

                ttobj.setSpeechRate(1f);

                for (int i = 0; i < 3; i++) {
                    ttobj.speak("Moo moo moo", TextToSpeech.QUEUE_ADD, null, "123ABC");
                }

                ttobj.setSpeechRate(.5f);

                for (int i = 0; i < 3; i++) {
                    ttobj.speak("Quack quack quack", TextToSpeech.QUEUE_ADD, null, "123ABC");
                }

                //What's the difference between add and flush?
                /*for (int i = 0; i < 3; i++) {
                    ttobj.speak("Moo moo moo", TextToSpeech.QUEUE_FLUSH, null, "123ABC");
                }*/
            }
        });
    }
}
```
