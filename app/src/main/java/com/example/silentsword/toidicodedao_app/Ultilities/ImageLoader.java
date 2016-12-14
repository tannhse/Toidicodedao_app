package com.example.silentsword.toidicodedao_app.Ultilities;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by SilentSword on 14/12/2016.
 */

public class ImageLoader extends AsyncTask<Void, Void, Bitmap> {
    //Image URL
    private String imgURL;
    //Control ImageView
    private ImageView imageView;

    public ImageLoader(String imgURL, ImageView imageView) {
        this.imgURL = imgURL;
        this.imageView = imageView;
    }

    @Override
    protected Bitmap doInBackground(Void... voids) {
        try {
            //Create URL Object
            URL urlConnection = new URL(imgURL);
            //Open Connection
            HttpURLConnection connection = (HttpURLConnection) urlConnection.openConnection();
            connection.setDoInput(true);
            connection.connect();

            //Read data
            InputStream input = connection.getInputStream();

            //Convert to image
            Bitmap bitmap = BitmapFactory.decodeStream(input);
            return bitmap;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Bitmap result) {
        super.onPostExecute(result);
    }
}
