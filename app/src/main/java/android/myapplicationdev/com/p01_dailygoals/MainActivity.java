package android.myapplicationdev.com.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);
        final TextView tvRead = (TextView) findViewById(R.id.textViewRead);
        final TextView tvArrive = (TextView) findViewById(R.id.textViewArrive);
        final TextView tvAttempt = (TextView) findViewById(R.id.textViewAttempt);


        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {

                // Get the RadioGroup object
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId = rg1.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId);

                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);

                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);


                EditText et = (EditText) findViewById(R.id.editTextMy);
                // Put the name and age into an array
                String[] info = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), et.getText().toString(),
                tvRead.getText().toString(), tvArrive.getText().toString(), tvAttempt.getText().toString()};
                // Create an intent to start another activity called

                Intent i = new Intent(MainActivity.this,
                        DailyGoals2.class);
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);
            }});

    }
}
