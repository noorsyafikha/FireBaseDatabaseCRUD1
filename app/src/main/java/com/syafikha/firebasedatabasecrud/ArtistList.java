package com.syafikha.firebasedatabasecrud;

import android.app.Activity;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Acer on 11/2/2017.
 */

public class ArtistList extends ArrayAdapter<Artist> {
    private Activity context;
    List<Artist> artists;

    //Create constructor
    public ArtistList(Activity context, List<Artist> artists) {
        super(context, R.layout.listlayout, artists);
        this.context = context;
        this.artists = artists;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.listlayout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.textViewName);

        Artist artist = artists.get(position);
        textViewName.setText(artist.getArtistName());

        return listViewItem;
    }
}


