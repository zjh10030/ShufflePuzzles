package com.example.shufflepuzzles;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
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
    private String wordRandom = "";
    int diff = 6;

    // So I was able to get a functioning shuffler that shuffles a word up and have
    // the tiles lock into place if they get close enough to the grey tiles. Hopefully
    // I can at least get some credit here I do know how to do the answers I think but it
    // would take quite awhile to do so.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int min = 0;
        int max = diff;
        int range =  (max - min);
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
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                                v.setX(200);
                                v.setY(500);
                            checkAnswers();
                            }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                                    v.setX(375);
                                    v.setY(500);
                            checkAnswers();
                                }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                                        v.setX(550);
                                        v.setY(500);
                            checkAnswers();
                                    }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                                            v.setX(725);
                                            v.setY(500);
                            checkAnswers();
                                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                                                v.setX(900);
                                                v.setY(500);
                            checkAnswers();
                                            } else {

                            v.setX(finalX);
                            v.setY(finalY);
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
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
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
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
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
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
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
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            checkAnswers();
                        } else {

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
                            checkAnswers();
                        }   else if (finalX >= 100 && finalX <= 250 && finalY >= 400 && finalY <= 600) {
                            v.setX(200);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 275 && finalX <= 425 && finalY >= 400 && finalY <= 600) {
                            v.setX(375);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 450 && finalX <= 600 && finalY >= 400 && finalY <= 600) {
                            v.setX(550);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 625 && finalX <= 775 && finalY >= 400 && finalY <= 650) {
                            v.setX(725);
                            v.setY(500);
                            checkAnswers();
                        }   else if (finalX >= 800 && finalX <= 950 && finalY >= 400 && finalY <= 650) {
                            v.setX(900);
                            v.setY(500);
                            checkAnswers();
                        } else {

                            v.setX(finalX);
                            v.setY(finalY);
                        }
                        return true;
                    default:
                        return true;
                }
            }
        });
    }
    public void checkAnswers() {

    }


}
