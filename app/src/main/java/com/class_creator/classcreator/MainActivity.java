package com.class_creator.classcreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button createClassButton = (Button) findViewById(R.id.createclass);

        createClassButton.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                launchClassCreatorActivity();
            }
        });
    }

        private void launchClassCreatorActivity () {

            Intent intent = new Intent(this, ClassCreatorActivity.class);
            startActivity(intent);
        }
    }

