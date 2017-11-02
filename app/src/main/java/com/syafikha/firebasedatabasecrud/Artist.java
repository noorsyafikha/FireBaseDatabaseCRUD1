package com.syafikha.firebasedatabasecrud;

import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

/**
 * Created by Acer on 11/2/2017.
 */

public class Artist {
    String artistID;
    String artistName;

    public Artist(){}

    public Artist(String artistID,String artistName) {

        this.artistID = artistID;
        this.artistName=artistName;
    }

    public String getArtistID() {
        return artistID;
    }

    public String getArtistName() {
        return artistName;
    }

EditText editTextName;
    Button buttonAdd;

    DatabaseReference databaseArtist;
}
