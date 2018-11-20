package com.makalikal.yukti.simplecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et_first_input, et_second_input;
    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_first_input = findViewById(R.id.et_first_input);
        et_second_input = findViewById(R.id.et_second_input);
        tv_result = findViewById(R.id.tv_result);
    }


    public int addition(int first, int second) {
        int result;
        result = first + second;
        return result;
    }

    public int subtraction(int first, int second) {
        int result;
        result = first - second;
        return result;
    }

    public int multiplication(int first, int second) {
        int result;
        result = first * second;
        return result;
    }

    public int division(int first, int second) {
        int result = 0;
        try {
            result = first / second;

        }
        catch (ArithmeticException e) {
        }
        return result;
    }

    public void operations(View view) {
        String first, second;
        first = et_first_input.getText().toString().trim();
        second = et_second_input.getText().toString().trim();
        if (!TextUtils.isEmpty(first) && !TextUtils.isEmpty(second)) {
            switch (view.getId()) {
                case R.id.btn_div:
                    if (Integer.parseInt(second)!=0){
                        tv_result.setText(String.valueOf(division(Integer.parseInt(first), Integer.parseInt(second))));
                    }else {
                        Toast.makeText(getApplicationContext(),"Cannot divide by zero",Toast.LENGTH_SHORT).show();
                    }
                    break;
                case R.id.btn_mul:
                    tv_result.setText(String.valueOf(multiplication(Integer.parseInt(first), Integer.parseInt(second))));
                    break;
                case R.id.btn_sub:
                    tv_result.setText(String.valueOf(subtraction(Integer.parseInt(first), Integer.parseInt(second))));
                    break;
                case R.id.btn_add:
                    tv_result.setText(String.valueOf(addition(Integer.parseInt(first), Integer.parseInt(second))));
                    break;
            }
        } else {
            if (TextUtils.isEmpty(first)) {
                et_first_input.setError("Provide Input");
                et_first_input.requestFocus();
            } else if (TextUtils.isEmpty(second)) {
                et_second_input.setError("Provide Input");
                et_second_input.requestFocus();
            }
        }
    }
}
