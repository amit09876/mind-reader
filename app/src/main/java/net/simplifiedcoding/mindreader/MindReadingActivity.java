package net.simplifiedcoding.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MindReadingActivity extends AppCompatActivity {

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
    }
}
