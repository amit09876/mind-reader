package net.simplifiedcoding.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MindReadingActivity extends AppCompatActivity {

    private int count = 0;
    private TextView textViewName, textViewTask;
    private Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind_reading);

        textViewName = findViewById(R.id.textViewName);
        textViewTask = findViewById(R.id.textViewTask);
        buttonContinue = findViewById(R.id.buttonContinue);

        Intent intent = getIntent();

        //getXXExtra();
        //XX -> data type
        String name = intent.getStringExtra("key_name");
        textViewName.setText(name);

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                if (count == 1) {
                    textViewTask.setText("Multiply the number with 2");
                } else if (count == 2) {
                    textViewTask.setText("Add 8 to the result");
                } else if (count == 3) {
                    textViewTask.setText("Divide the result by 2");
                } else if (count == 4) {
                    textViewTask.setText("Now subtract the first number that you thought with the result");
                    buttonContinue.setText("See the Magic");
                } else {
                    startActivity(new Intent(MindReadingActivity.this, ResultActivity.class));
                }
            }
        });
    }
}
