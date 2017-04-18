package android.myapplicationdev.com.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class DailyGoals2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_goals2);

        Button btnDone = (Button) findViewById(R.id.buttonDone);

        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // This function closes Summary
                // Hint: use Context's finish() method
                finish();
            }
        });

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv = (TextView) findViewById(R.id.textView);
        TextView tv2 = (TextView) findViewById(R.id.textView2);
        TextView tv3 = (TextView) findViewById(R.id.textView3);
        TextView tv4 = (TextView) findViewById(R.id.textView4);

        // Display the name and age on the TextView
        tv.setText(info[4] + " : " + info[0]);
        tv2.setText(info[5] + " : " + info[1]);
        tv3.setText(info[6] + " : " + info[2]);
        tv4.setText("Reflection: " + info[3]);

    }
}
