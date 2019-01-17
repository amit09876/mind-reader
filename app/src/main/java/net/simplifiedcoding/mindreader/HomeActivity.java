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
                String name = editTextName.getText().toString().trim().toUpperCase();

                if(name.isEmpty()){
                    editTextName.setError("Name required...");
                    editTextName.requestFocus();
                    return;
                }

                //continue further processing
                Intent intent = new Intent(HomeActivity.this, MindReadingActivity.class);

                intent.putExtra("key_name", name);

                startActivity(intent);

            }
        });
    }
}
