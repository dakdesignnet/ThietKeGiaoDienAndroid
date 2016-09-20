package manhinhdieukhien.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import lab1.com.*;
import manhinhdieukhien.com.R;

public class MainActivity extends Activity implements OnClickListener {
	Button btnlab1,btnlab2,btnlab3,btnlab4,btnlab5,btnlab6,btnlab7,btnlab8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnlab1=(Button) findViewById(R.id.btnlab1);
		btnlab2=(Button) findViewById(R.id.btnlab1);
		
		btnlab1.setOnClickListener(this);
		btnlab2.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		if(v==btnlab1){
			Toast.makeText(getApplicationContext(), "Lab1", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab1.class);
			startActivity(intent);
		}
		if(v==btnlab2){
			Toast.makeText(getApplicationContext(), "Lab2", Toast.LENGTH_LONG).show();
		}
	}
}
