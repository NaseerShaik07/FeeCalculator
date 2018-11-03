package com.example.others.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user_name_view = (EditText)findViewById(R.id.user_name);
        final EditText password_view = (EditText)findViewById(R.id.password);
        Button login = (Button)findViewById(R.id.log_but);



        login.setBackgroundColor(Color.rgb(240,240,240));

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo: do authentication of user
                final String user_name = user_name_view.getText().toString();
                final String password = password_view.getText().toString();

                if(user_name.equals("") || password.equals("")){
                    Toast.makeText(MainActivity.this,"username and password are required", Toast.LENGTH_SHORT).show();
                }
                else {

                    Intent intent = new Intent(MainActivity.this, ProgramActivity.class);
                    startActivity(intent);
                }
            }
        });


    }

    @Override
    protected void onResume(){
        super.onResume();
        final EditText user_name_view = (EditText)findViewById(R.id.user_name);
        final EditText password_view = (EditText)findViewById(R.id.password);

        user_name_view.setText("");
        password_view.setText("");

    }
}
