package amrasabic.bitcamp.ba.bitbooking.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import amrasabic.bitcamp.ba.bitbooking.R;

/**
 * This class represents PayPal activity,
 * contains web view to keep action inside of app.
 */
public class PayPalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paypal);
        // get String url from intent
        String url = getIntent().getExtras().getString("url", "");

        // find view component by id
        WebView webView = (WebView) findViewById(R.id.webView);
        // set web view client that will keep user inside app
        webView.setWebViewClient(new PayPalWebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

    /**
     * By default on redirect to another link web view open in default browser,
     * this method overrides url loading method and keeps user inside of app.
     */
    private class PayPalWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
