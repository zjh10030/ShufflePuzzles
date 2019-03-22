package com.example.shufflepuzzles;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    //I know alot of private variables I'm using them as its the easiest way to grab
    //a variable from one class to the other in the same java class.
    private char firstLetter = 0;
    private char secondLetter = 0;
    private char thirdLetter = 0;
    private char fourthLetter = 0;
    private char fifthLetter = 0;
    private char sixthLetter = 0;
    private char randomFirstLetter = 0;
    private char randomSecondLetter = 0;
    private char randomThirdLetter = 0;
    private char randomFourthLetter = 0;
    private char randomFifthLetter = 0;
    private char randomSixthLetter = 0;
    private int placementofTile1 = 0;
    private int placementofTile2 = 0;
    private int placementofTile3 = 0;
    private int placementofTile4 = 0;
    private int placementofTile5 = 0;
    private int placementofTile6 = 0;
    private int score = 0;
    private String wordRandom = "";
    int diff = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            WordList list = WordList.load(this);
            String word = list.randomWordOfLength(diff);
            wordRandom = word;
            //list.contains("chicken"); example of how to interact with answers
        }catch (IOException e){
            Toast.makeText(this, "Error!",Toast.LENGTH_LONG).show();
        }
        char [] letters = wordRandom.toCharArray();
        firstLetter = letters[0];
        secondLetter = letters[1];
        thirdLetter = letters[2];
        fourthLetter = letters[3];
        fifthLetter = letters[4];
        sixthLetter = letters[5];
        placeAnswerTile();
        randomFirstLetter = letters[(int)(Math.random() * letters.length)];

        randomSecondLetter = letters[(int)(Math.random() * letters.length)];
        if (randomSecondLetter == randomFirstLetter) {
            while (randomFirstLetter == randomSecondLetter) {
                randomSecondLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomThirdLetter = letters[(int)(Math.random() * letters.length)];
        if (randomThirdLetter == randomFirstLetter || randomThirdLetter == randomSecondLetter) {
            while (randomThirdLetter == randomFirstLetter || randomThirdLetter == randomSecondLetter) {
                randomThirdLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomFourthLetter = letters[(int)(Math.random() * letters.length)];
        if (randomFourthLetter == randomFirstLetter || randomFourthLetter == randomSecondLetter || randomFourthLetter == randomThirdLetter) {
            while (randomFourthLetter == randomFirstLetter || randomFourthLetter == randomSecondLetter || randomFourthLetter == randomThirdLetter) {
                randomFourthLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomFifthLetter = letters[(int)(Math.random() * letters.length)];
        if (randomFifthLetter == randomFirstLetter || randomFifthLetter == randomSecondLetter || randomFifthLetter == randomThirdLetter || randomFifthLetter == randomFourthLetter) {
            while (randomFifthLetter == randomFirstLetter || randomFifthLetter == randomSecondLetter || randomFifthLetter == randomThirdLetter || randomFifthLetter == randomFourthLetter) {
                randomFifthLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomSixthLetter = letters[(int)(Math.random() * letters.length)];
        if (randomSixthLetter == randomFirstLetter || randomSixthLetter == randomSecondLetter || randomSixthLetter == randomThirdLetter || randomSixthLetter == randomFourthLetter ||  randomSixthLetter == randomFifthLetter) {
            while (randomSixthLetter == randomFirstLetter || randomSixthLetter == randomSecondLetter || randomSixthLetter == randomThirdLetter || randomSixthLetter == randomFourthLetter ||  randomSixthLetter == randomFifthLetter) {
                randomSixthLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        placeTile();


    }

    public void Shuffle(View view) {
        try {
            WordList list = WordList.load(this);
            String word = list.randomWordOfLength(diff);
            //list.contains("chicken"); example of how to interact with answers
            wordRandom = word;
        }catch (IOException e){
            Toast.makeText(this, "Error!",Toast.LENGTH_LONG).show();
        }

        char [] letters = wordRandom.toCharArray();
        firstLetter = letters[0];
        secondLetter = letters[1];
        thirdLetter = letters[2];
        fourthLetter = letters[3];
        fifthLetter = letters[4];
        sixthLetter = letters[5];
        placeAnswerTile();
        randomFirstLetter = letters[(int)(Math.random() * letters.length)];

        randomSecondLetter = letters[(int)(Math.random() * letters.length)];
        if (randomSecondLetter == randomFirstLetter) {
            while (randomFirstLetter == randomSecondLetter) {
                randomSecondLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomThirdLetter = letters[(int)(Math.random() * letters.length)];
        if (randomThirdLetter == randomFirstLetter || randomThirdLetter == randomSecondLetter) {
            while (randomThirdLetter == randomFirstLetter || randomThirdLetter == randomSecondLetter) {
                randomThirdLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomFourthLetter = letters[(int)(Math.random() * letters.length)];
        if (randomFourthLetter == randomFirstLetter || randomFourthLetter == randomSecondLetter || randomFourthLetter == randomThirdLetter) {
            while (randomFourthLetter == randomFirstLetter || randomFourthLetter == randomSecondLetter || randomFourthLetter == randomThirdLetter) {
                randomFourthLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomFifthLetter = letters[(int)(Math.random() * letters.length)];
        if (randomFifthLetter == randomFirstLetter || randomFifthLetter == randomSecondLetter || randomFifthLetter == randomThirdLetter || randomFifthLetter == randomFourthLetter) {
            while (randomFifthLetter == randomFirstLetter || randomFifthLetter == randomSecondLetter || randomFifthLetter == randomThirdLetter || randomFifthLetter == randomFourthLetter) {
                randomFifthLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        randomSixthLetter = letters[(int)(Math.random() * letters.length)];
        if (randomSixthLetter == randomFirstLetter || randomSixthLetter == randomSecondLetter || randomSixthLetter == randomThirdLetter || randomSixthLetter == randomFourthLetter ||  randomSixthLetter == randomFifthLetter) {
            while (randomSixthLetter == randomFirstLetter || randomSixthLetter == randomSecondLetter || randomSixthLetter == randomThirdLetter || randomSixthLetter == randomFourthLetter ||  randomSixthLetter == randomFifthLetter) {
                randomSixthLetter = letters[(int)(Math.random() * letters.length)];
            }
        }
        placeTile();

    }

    public void placeAnswerTile () {
        RelativeLayout layout = findViewById(R.id.tile_pane);
        int color = Color.parseColor("#585858");
        int tileSize = 150;

        LetterTile answerTile1 = new LetterTile(this, firstLetter, tileSize, color,color);

        answerTile1.setX(25);
        answerTile1.setY(500);

        LetterTile answerTile2 = new LetterTile(this, secondLetter, tileSize, color,color);

        answerTile2.setX(200);
        answerTile2.setY(500);

        LetterTile answerTile3 = new LetterTile(this, thirdLetter, tileSize, color,color);

        answerTile3.setX(375);
        answerTile3.setY(500);

        LetterTile answerTile4 = new LetterTile(this, fourthLetter, tileSize, color,color);

        answerTile4.setX(550);
        answerTile4.setY(500);

        LetterTile answerTile5 = new LetterTile(this, fifthLetter, tileSize, color,color);

        answerTile5.setX(725);
        answerTile5.setY(500);

        LetterTile answerTile6 = new LetterTile(this, sixthLetter, tileSize, color,color);

        answerTile6.setX(900);
        answerTile6.setY(500);


        layout.addView(answerTile1);
        layout.addView(answerTile2);
        layout.addView(answerTile3);
        layout.addView(answerTile4);
        layout.addView(answerTile5);
        layout.addView(answerTile6);

    }

    public void placeTile () {
        RelativeLayout layout = findViewById(R.id.tile_pane);
        int color = Color.parseColor("#D8BD97");
        int textColor = Color.parseColor("#000000");
        int tileSize = 150;

        LetterTile tile = new LetterTile(this,randomFirstLetter, tileSize, color,textColor);

        tile.setX(25);
        tile.setY(700);

        LetterTile tile2 = new LetterTile(this,randomSecondLetter, tileSize, color,textColor);

        tile2.setX(200);
        tile2.setY(700);

        LetterTile tile3 = new LetterTile(this,randomThirdLetter, tileSize, color,textColor);

        tile3.setX(375);
        tile3.setY(700);

        LetterTile tile4 = new LetterTile(this,randomFourthLetter, tileSize, color,textColor);

        tile4.setX(550);
        tile4.setY(700);

        LetterTile tile5 = new LetterTile(this,randomFifthLetter, tileSize, color,textColor);

        tile5.setX(725);
        tile5.setY(700);

        LetterTile tile6 = new LetterTile(this,randomSixthLetter, tileSize, color,textColor);

        tile6.setX(900);
        tile6.setY(700);



        layout.addView(tile);
        layout.addView(tile2);
        layout.addView(tile3);
        layout.addView(tile4);
        layout.addView(tile5);
        layout.addView(tile6);

        tile.setOnTouchListener(new View.OnTouchListener() {
            float dx;
            float dy;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.bringToFront();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dx = v.getX() - event.getRawX();
                        dy = v.getY() - event.getRawY();
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        float newX = event.getRawX() + dx;
                        float newY = event.getRawY() + dy;
                        //v.setX(newX);
                        //v.setY(newY);
                        return true;
                    case MotionEvent.ACTION_UP:
                        float finalX = event.getRawX() + dx;
                        float finalY = event.getRawY() + dy;
                        if (finalX >= 0 && finalX <= 75 && finalY >= 400 && finalY <= 600) {
                            v.setX(25);
                            v.setY(500);
                            placementofTile1 = 1;
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                                v.setX(200);
                                v.setY(500);
                                placementofTile1 = 2;
                            checkAnswers();
                            }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                                    v.setX(375);
                                    v.setY(500);
                                    placementofTile1 = 3;
                            checkAnswers();
                                }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                                        v.setX(550);
                                        v.setY(500);
                                        placementofTile1 =4;
                            checkAnswers();
                                    }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                                            v.setX(725);
                                            v.setY(500);
                                            placementofTile1 =5;
                            checkAnswers();
                                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                                                v.setX(900);
                                                v.setY(500);
                                                placementofTile1 =6;
                            checkAnswers();
                                            } else {

                            v.setX(finalX);
                            v.setY(finalY);
                            placementofTile1 = 0;
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });

        tile2.setOnTouchListener(new View.OnTouchListener() {
            float dx;
            float dy;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.bringToFront();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dx = v.getX() - event.getRawX();
                        dy = v.getY() - event.getRawY();
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        float newX = event.getRawX() + dx;
                        float newY = event.getRawY() + dy;
                        //v.setX(newX);
                        //v.setY(newY);
                        return true;
                    case MotionEvent.ACTION_UP:
                        float finalX = event.getRawX() + dx;
                        float finalY = event.getRawY() + dy;
                        if (finalX >= 0 && finalX <= 75 && finalY >= 400 && finalY <= 600) {
                            v.setX(25);
                            v.setY(500);
                            placementofTile2 = 1;
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            placementofTile2 = 2;
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            placementofTile2 = 3;
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            placementofTile2 = 4;
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            placementofTile2 = 5;
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            placementofTile2 = 6;
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
                            placementofTile2 = 0;
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });

        tile3.setOnTouchListener(new View.OnTouchListener() {
            float dx;
            float dy;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.bringToFront();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // Record the offset between where the touch occurred and the reference point of the view
                        dx = v.getX() - event.getRawX();
                        dy = v.getY() - event.getRawY();
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        // Move the tile around around with the gesture
                        float newX = event.getRawX() + dx;
                        float newY = event.getRawY() + dy;
                        //v.setX(newX);
                        //v.setY(newY);
                        return true;
                    case MotionEvent.ACTION_UP:
                        // Place the tile in its new location
                        // Move the tile around around with the gesture
                        float finalX = event.getRawX() + dx;
                        float finalY = event.getRawY() + dy;
                        if (finalX >= 0 && finalX <= 75 && finalY >= 400 && finalY <= 600) {
                            v.setX(25);
                            v.setY(500);
                            placementofTile3 = 1;
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            placementofTile3 = 2;
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            placementofTile3 = 3;
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            placementofTile3 = 4;
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            placementofTile3 = 5;
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            placementofTile3 = 6;
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
                            placementofTile3 = 0;
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });

        tile4.setOnTouchListener(new View.OnTouchListener() {
            float dx;
            float dy;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.bringToFront();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // Record the offset between where the touch occurred and the reference point of the view
                        dx = v.getX() - event.getRawX();
                        dy = v.getY() - event.getRawY();
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        // Move the tile around around with the gesture
                        float newX = event.getRawX() + dx;
                        float newY = event.getRawY() + dy;
                        //v.setX(newX);
                        //v.setY(newY);
                        return true;
                    case MotionEvent.ACTION_UP:
                        // Place the tile in its new location
                        // Move the tile around around with the gesture
                        float finalX = event.getRawX() + dx;
                        float finalY = event.getRawY() + dy;
                        if (finalX >= 0 && finalX <= 75 && finalY >= 400 && finalY <= 600) {
                            v.setX(25);
                            v.setY(500);
                            placementofTile4 = 1;
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            placementofTile4 = 2;
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            placementofTile4 = 3;
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            placementofTile4 = 4;
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            placementofTile4 = 5;
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            placementofTile4 = 6;
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
                            placementofTile4 = 0;
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });

        tile5.setOnTouchListener(new View.OnTouchListener() {
            float dx;
            float dy;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.bringToFront();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // Record the offset between where the touch occurred and the reference point of the view
                        dx = v.getX() - event.getRawX();
                        dy = v.getY() - event.getRawY();
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        // Move the tile around around with the gesture
                        float newX = event.getRawX() + dx;
                        float newY = event.getRawY() + dy;
                        //v.setX(newX);
                        //v.setY(newY);
                        return true;
                    case MotionEvent.ACTION_UP:
                        // Place the tile in its new location
                        // Move the tile around around with the gesture
                        float finalX = event.getRawX() + dx;
                        float finalY = event.getRawY() + dy;
                        if (finalX >= 0 && finalX <= 75 && finalY >= 400 && finalY <= 600) {
                            v.setX(25);
                            v.setY(500);
                            placementofTile5 = 1;
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            placementofTile5 = 2;
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            placementofTile5 = 3;
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            placementofTile5 = 4;
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            placementofTile5 = 5;
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            placementofTile5 = 6;
                            checkAnswers();
                        } else {
                            placementofTile5 = 0;
                            v.setX(finalX);
                            v.setY(finalY);
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });

        tile6.setOnTouchListener(new View.OnTouchListener() {
            float dx;
            float dy;


            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.bringToFront();

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // Record the offset between where the touch occurred and the reference point of the view
                        dx = v.getX() - event.getRawX();
                        dy = v.getY() - event.getRawY();
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        // Move the tile around around with the gesture
                        float newX = event.getRawX() + dx;
                        float newY = event.getRawY() + dy;
                        //v.setX(newX);
                        //v.setY(newY);
                        return true;
                    case MotionEvent.ACTION_UP:
                        // Place the tile in its new location
                        // Move the tile around around with the gesture
                        float finalX = event.getRawX() + dx;
                        float finalY = event.getRawY() + dy;
                        if (finalX >= 0 && finalX <= 75 && finalY >= 400 && finalY <= 600) {
                            v.setX(25);
                            v.setY(500);
                            placementofTile6 = 1;
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            placementofTile6 = 2;
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            placementofTile6 = 3;
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            placementofTile6 = 4;
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            placementofTile6 = 5;
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            placementofTile6 = 6;
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
                            placementofTile6 = 0;
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });
    }
    public void checkAnswers() {
        int correctSpots = 0;
        if (placementofTile1 != 0 && placementofTile2 != 0 && placementofTile3 != 0 && placementofTile4 != 0 && placementofTile5 != 0 && placementofTile6 != 0) {
            ////////////////////////////////////// Testing First Letter
            if (placementofTile1 == 1) {
                if (firstLetter == randomFirstLetter ){
                   correctSpots++;
                }
            }
            if (placementofTile1 == 2) {
                if(secondLetter == randomFirstLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile1 == 3) {
                if (thirdLetter == randomFirstLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile1 == 4) {
                if (fourthLetter == randomFirstLetter){
                    correctSpots++;
                }
            }
            if (placementofTile1 == 5) {
                if (fifthLetter == randomFirstLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile1 == 6) {
                if (sixthLetter == randomFirstLetter) {
                    correctSpots++;
                }
            }
            ////////////////////////////////////// Testing Second Letter
            if (placementofTile2 == 1) {
                if (firstLetter == randomSecondLetter ){
                    correctSpots++;
                }
            }
            if (placementofTile2 == 2) {
                if(secondLetter == randomSecondLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile2 == 3) {
                if (thirdLetter == randomSecondLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile2 == 4) {
                if (fourthLetter == randomSecondLetter){
                    correctSpots++;
                }
            }
            if (placementofTile2 == 5) {
                if (fifthLetter == randomSecondLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile2 == 6) {
                if (sixthLetter == randomSecondLetter) {
                    correctSpots++;
                }
            }
            ////////////////////////////////////// Testing Third Letter

            if (placementofTile3 == 1) {
                if (firstLetter == randomThirdLetter ){
                    correctSpots++;
                }
            }
            if (placementofTile3 == 2) {
                if(secondLetter == randomThirdLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile3 == 3) {
                if (thirdLetter == randomThirdLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile3 == 4) {
                if (fourthLetter == randomThirdLetter){
                    correctSpots++;
                }
            }
            if (placementofTile3 == 5) {
                if (fifthLetter == randomThirdLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile3 == 6) {
                if (sixthLetter == randomThirdLetter) {
                    correctSpots++;
                }
            }
            ////////////////////////////////////// Testing Fourth Letter

            if (placementofTile4 == 1) {
                if (firstLetter == randomFourthLetter){
                    correctSpots++;
                }
            }
            if (placementofTile4 == 2) {
                if(secondLetter == randomFourthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile4 == 3) {
                if (thirdLetter == randomFourthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile4 == 4) {
                if (fourthLetter == randomFourthLetter){
                    correctSpots++;
                }
            }
            if (placementofTile4 == 5) {
                if (fifthLetter == randomFourthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile4 == 6) {
                if (sixthLetter == randomFourthLetter) {
                    correctSpots++;
                }
            }

            ////////////////////////////////////// Testing Fifth Letter

            if (placementofTile5 == 1) {
                if (firstLetter == randomFifthLetter){
                    correctSpots++;
                }
            }
            if (placementofTile5 == 2) {
                if(secondLetter == randomFifthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile5 == 3) {
                if (thirdLetter == randomFifthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile5 == 4) {
                if (fourthLetter == randomFifthLetter){
                    correctSpots++;
                }
            }
            if (placementofTile5 == 5) {
                if (fifthLetter == randomFifthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile5 == 6) {
                if (sixthLetter == randomFifthLetter) {
                    correctSpots++;
                }
            }

            ////////////////////////////////////// Testing Sixth Letter

            if (placementofTile6 == 1) {
                if (firstLetter == randomSixthLetter){
                    correctSpots++;
                }
            }
            if (placementofTile6 == 2) {
                if(secondLetter == randomSixthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile6 == 3) {
                if (thirdLetter == randomSixthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile6 == 4) {
                if (fourthLetter == randomSixthLetter){
                    correctSpots++;
                }
            }
            if (placementofTile6 == 5) {
                if (fifthLetter == randomSixthLetter) {
                    correctSpots++;
                }
            }
            if (placementofTile6 == 6) {
                if (sixthLetter == randomSixthLetter) {
                    correctSpots++;
                }
            }

            if (correctSpots == diff) {
                Toast.makeText(this,"The word is CORRECT",Toast.LENGTH_LONG).show();
                 placementofTile1 = 0;
                 placementofTile2 = 0;
                 placementofTile3 = 0;
                 placementofTile4 = 0;
                 placementofTile5 = 0;
                 placementofTile6 = 0;
                 correctSpots = 0;
                Score();

            } else {
                Toast.makeText(this,"The word is INCORRECT",Toast.LENGTH_LONG).show();
                correctSpots = 0;
            }
        }

    }

    public void Score () {
        score++;
        String scoreString = Integer.toString(score);
        final TextView scoreChart = (TextView) findViewById(R.id.scoreKeeper);
        scoreChart.setText(scoreString);
    }

}
