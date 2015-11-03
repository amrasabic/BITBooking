package amrasabic.bitcamp.ba.bitbooking.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import amrasabic.bitcamp.ba.bitbooking.extras.Helper;
import amrasabic.bitcamp.ba.bitbooking.R;

public class PayPalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paypal);

        Bundle  extras = getIntent().getExtras();
        String url = extras.getString("url", "");

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new PayPalWebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

    private class PayPalWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
