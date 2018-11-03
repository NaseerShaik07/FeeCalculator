package com.example.others.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class FeeDetailsActivity extends AppCompatActivity {


    private int tuition_fee = 0;
    private int exam_fee = 0;
    private int acc_fee = 0;
    private int lib_fee = 0;
    private int hostal_fee = 0;
    private int trans_fee = 0;
    private int total = 0;


    @Override
    protected void onCreate(Bundle sis){
        super.onCreate(sis);
        setContentView(R.layout.fee_details);

        TextView acc_fee_view = (TextView)findViewById(R.id.acc_fee);
        TextView hostal_fee_view = (TextView)findViewById(R.id.hos_fee);
        TextView trans_fee_view = (TextView)findViewById(R.id.trans_fee);
        TextView total_fee_view = (TextView)findViewById(R.id.tot_fee);
        TextView tuition_fee_view = (TextView)findViewById(R.id.tuition_fee);

        Intent intent  = getIntent();
        String year = intent.getStringExtra("YEAR");
        String prog = intent.getStringExtra("PROG");
        String std_type = intent.getStringExtra("STD_TYPE");


        switch (year){
            case "2015":
                tuition_fee = 75000;
                exam_fee = 1130;

                if(prog.equals("CSE") || prog.equals("ECE") || prog.equals("EEE") || prog.equals("MEC")){
                    acc_fee = 1000;
                }

                lib_fee = 250;


                if(std_type.equals("boarder")){
                    hostal_fee = 80000;
                }else{
                    trans_fee = 10000;
                }

                total = tuition_fee + exam_fee + acc_fee + lib_fee + hostal_fee + trans_fee;
                acc_fee_view.setText(String.valueOf(acc_fee));
                hostal_fee_view.setText(String.valueOf(hostal_fee));
                tuition_fee_view.setText(String.valueOf(tuition_fee));
                trans_fee_view.setText(String.valueOf(trans_fee));
                total_fee_view.setText(String.valueOf(total));

                break;
            case "2016":
                tuition_fee = 85000;
                exam_fee = 1130;

                if(prog.equals("CSE") || prog.equals("ECE") || prog.equals("EEE") || prog.equals("MEC")){
                    acc_fee = 1000;
                }

                lib_fee = 250;


                if(std_type.equals("boarder")){
                    hostal_fee = 85000;
                }else{
                    trans_fee = 11000;
                }
                total = tuition_fee + exam_fee + acc_fee + lib_fee + hostal_fee + trans_fee;
                acc_fee_view.setText(String.valueOf(acc_fee));
                hostal_fee_view.setText(String.valueOf(hostal_fee));
                tuition_fee_view.setText(String.valueOf(tuition_fee));
                trans_fee_view.setText(String.valueOf(trans_fee));
                total_fee_view.setText(String.valueOf(total));
                break;

        }

    }
}
