package com.p.po;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

	private List<String> jjj;
	private TextView tviHola;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jjj.add("hola");
        tviHola.setText(jjj.get(0));
        
    }


}
