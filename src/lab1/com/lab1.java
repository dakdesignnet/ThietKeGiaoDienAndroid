package lab1.com;

import manhinhdieukhien.com.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class lab1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);

		String doc="https://drive.google.com/a/fpt.edu.vn/file/d/0B-AbEIF25LGbd1BNaERzeUNsVHc/view";

		WebView  wv = (WebView)findViewById(R.id.fileWebView); 
		
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
	
		wv.loadUrl(doc);
	}
}
