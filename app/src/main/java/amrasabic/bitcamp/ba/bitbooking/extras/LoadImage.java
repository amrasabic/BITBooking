package amrasabic.bitcamp.ba.bitbooking.extras;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class LoadImage extends AsyncTask<String, String, Bitmap> {

    private ImageView img;
    public LoadImage(ImageView imgView){
        img = imgView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    protected Bitmap doInBackground(String... args) {
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream((InputStream) new URL(args[0]).getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    protected void onPostExecute(Bitmap image) {
        img.setImageBitmap(image);

    }
}