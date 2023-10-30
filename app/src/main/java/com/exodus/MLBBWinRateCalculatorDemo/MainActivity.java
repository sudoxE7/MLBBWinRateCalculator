package com.exodus.MLBBWinRateCalculatorDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.exodus.MLBBWinRateCalculator.MLBBWinRateCalculator;
import com.exodus.MLBBWinRateCalculator.listener.MLBBWinRateCalculatorListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((Button) findViewById(R.id.button1)).setOnClickListener(v -> {
			int totalMatches = Integer.parseInt(((EditText) findViewById(R.id.edittext1)).getText().toString());
			double winRatePercentage = Double
					.parseDouble(((EditText) findViewById(R.id.edittext2)).getText().toString());
			double targetWinRate = Double.parseDouble(((EditText) findViewById(R.id.edittext3)).getText().toString());
			new MLBBWinRateCalculator(totalMatches, winRatePercentage, targetWinRate)
					.calculateWinRate(new MLBBWinRateCalculatorListener() {
						@Override
						public void onWinRateCalculated(String result) {
							((TextView) findViewById(R.id.textview1)).setText(result);
						}
					});
		});

	}
}