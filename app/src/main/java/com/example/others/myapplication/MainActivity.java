package com.example.others.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user_name_view = (EditText)findViewById(R.id.user_name);
        EditText password_view = (EditText)findViewById(R.id.password);
        Button login = (Button)findViewById(R.id.log_but);

        String user_name = user_name_view.getText().toString();
        String password = password_view.getText().toString();


        login.setBackgroundColor(Color.CYAN);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo: do authentication of user

                Intent intent = new Intent(MainActivity.this, ProgramActivity.class);
                startActivity(intent);
            }
        });


    }
}
