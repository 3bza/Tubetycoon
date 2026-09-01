package com.creatorempire.game;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebSettings; import android.webkit.WebView; import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 WebView w;
 public void onCreate(Bundle b){super.onCreate(b);w=new WebView(this);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);s.setLoadWithOverviewMode(true);s.setUseWideViewPort(true);w.setWebViewClient(new WebViewClient());w.loadUrl("file:///android_asset/index.html");setContentView(w);}
 public void onBackPressed(){w.evaluateJavascript("window.creatorBack&&window.creatorBack()",null);}
}