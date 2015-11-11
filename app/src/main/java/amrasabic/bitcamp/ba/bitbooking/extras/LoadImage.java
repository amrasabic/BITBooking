package amrasabic.bitcamp.ba.bitbooking.extras;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

/**
 *
 */
public class LoadImage extends AsyncTask<String, String, Bitmap> {

    // Declaration of parameters

    private ImageView img;

    /**
     * Constructor
     * @param imgView - received Image view
     */
    public LoadImage(ImageView imgView){
        img = imgView;
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    /**
     * Method do in background load contents and returns bitmap.
     */
    @Override
    protected Bitmap doInBackground(String... args) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream((InputStream) new URL(args[0]).getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    /**
     * Method on post execute sets bitmap image on Image view
     * @param image
     */
    @Override
    protected void onPostExecute(Bitmap image) {
        img.setImageBitmap(image);

    }
}