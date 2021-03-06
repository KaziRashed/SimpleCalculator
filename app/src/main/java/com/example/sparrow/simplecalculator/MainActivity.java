package com.example.sparrow.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAdd, btnsub ;
    private TextView tvresult;
    private EditText etfirst, etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init()
    {
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnsub = (Button) findViewById(R.id.btnSubtract);
        etfirst = (EditText) findViewById(R.id.firstno);
        etsecond= (EditText) findViewById(R.id.secondno);
        tvresult = (TextView) findViewById(R.id.tvResult);
        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1= etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        switch(view.getId())
        {
            case R.id.btnAdd:
                int addition= Integer.parseInt(num1) + Integer.parseInt(num2);
                tvresult.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                tvresult.setText(String.valueOf(subtraction));
                break;
        }
    }
}
