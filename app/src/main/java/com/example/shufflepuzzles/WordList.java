package com.example.shuffle;

import android.content.Context;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper / helper class managing the list of words used by the word scramble game. It  uses a
 * singleton-like pattern to ensure the word list is only loaded once.
 *
 * Created by jeremy on 3/8/19.
 */

public class WordList {
    /** Used to ensure only one instance of the WordList exists */
    private static WordList instance = null;

    /** The words */
    private List<String> words = new ArrayList<>();

    /**
     * Loads the word list from the asset file
     * @param context
     * @throws IOException
     */
    private WordList(Context context) throws IOException {
        InputStream stream = context.getAssets().open("word_list.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        String word;
        while ((word = reader.readLine()) != null) {
            words.add(word);
        }

        reader.close();
    }

    /**
     * Returns the word list. If the list has already been instantiated it returns another reference
     * to it
     * @param context
     * @return the WordList
     * @throws IOException
     */
    public static WordList load(Context context) throws IOException {
        if (instance == null) {
            instance = new WordList(context);
        }

        return instance;
    }

    /**
     *
     * @param n - number of desired characters in word
     * @return a random word with length equal to n
     */
    public String randomWordOfLength(int n) {
        while (true) {
            int r = (int) (words.size() * Math.random());
            String word = words.get(r);
            if (word.length() == n) {
                return word;
            }
        }
    }

    /**
     *
     * @param word
     * @return if the word list contains the word
     */
    public boolean contains(String word) {
        return words.contains(word);
    }
}
