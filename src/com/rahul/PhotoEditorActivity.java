package com.rahul;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PhotoEditorActivity extends Activity {
    /** Called when the activity is first created. */
	
	Button start;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        start=(Button)findViewById(R.id.start);
        
        
        
        start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				
				
				Intent i=new Intent(getBaseContext(),uploadpic.class);
				startActivity(i);
				
				
			}
		});
        
        
    }
}