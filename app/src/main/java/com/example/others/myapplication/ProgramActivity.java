package com.example.others.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class ProgramActivity extends AppCompatActivity {

    private String std_type = "";
    private String prog = "";
    private String year = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        Button submit = (Button)findViewById(R.id.submit);
        submit.setBackgroundColor(Color.BLUE);

        Spinner year_spinner = (Spinner) findViewById(R.id.year_spinner);
        final ArrayList year_data = new ArrayList();
        year_data.add("2000");
        year_data.add("2001");
        year_data.add("2002");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("1995");
        year_data.add("2016");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, year_data);
        year_spinner.setAdapter(adapter);

        year_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                year  = year_data.get(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        Spinner program_spinner = (Spinner)findViewById(R.id.program_spinner);
        final ArrayList program_data = new ArrayList();

        program_data.add("CSE");
        program_data.add("ECE");
        program_data.add("EEE");
        program_data.add("MEC");
        program_data.add("CIV");
        program_data.add("IT");
        program_data.add("CSSE");
        program_data.add("EIE");


        ArrayAdapter program_adapter = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, program_data);
        program_spinner.setAdapter(program_adapter);

        program_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                prog = program_data.get(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgramActivity.this, FeeDetailsActivity.class);
                intent.putExtra("YEAR",year);
                intent.putExtra("PROG",prog);
                intent.putExtra("STD_TYPE",std_type);

                startActivity(intent);
            }
        });



    }

    public void radioClick(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.day_scholar:
                if(checked) {
                    std_type = "day scholar";
                }
                break;
            case R.id.boarder:
                if(checked){
                    std_type = "boarder";
                }
                break;

        }
    }
}
