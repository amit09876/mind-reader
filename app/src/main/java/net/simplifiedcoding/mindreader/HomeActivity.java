package net.simplifiedcoding.mindreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private Button buttonContinue;
    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        editTextName = findViewById(R.id.editTextName);
        buttonContinue = findViewById(R.id.buttonContinue);

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getting input from editText
                //and converting the name to upper case
                String name = editTextName.getText().toString().trim().toUpperCase();
                //checking if the name is not empty
                if(name.isEmpty()){
                    //if the name is empty
                    //stopping the execution
                    editTextName.setError("Name required...");
                    editTextName.requestFocus();
                    return;
                }
                //if validation succeeds
                //creating intent
                Intent intent = new Intent(HomeActivity.this, MindReadingActivity.class);
                //adding the entered name to the intent
                intent.putExtra("key_name", name);
                //finally starting the activity
                startActivity(intent);
            }
        });
    }
}
