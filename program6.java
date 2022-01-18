package com.example.program6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button b,bb,bc,bd;
  EditText et1,et2;
  TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.b1);
        bb=findViewById(R.id.b2);
        bc=findViewById(R.id.b3);
        bd=findViewById(R.id.b4);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a1 = Double.parseDouble(et1.getText().toString());
                Double a2 = Double.parseDouble(et2.getText().toString());
                Double r=a1+a2;
                tv1.setText("result is"+String.valueOf(r));

            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a1 = Double.parseDouble(et1.getText().toString());
                Double a2 = Double.parseDouble(et2.getText().toString());
                Double r=a1-a2;
                tv1.setText("result is"+String.valueOf(r));


            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a1 = Double.parseDouble(et1.getText().toString());
                Double a2 = Double.parseDouble(et2.getText().toString());
                Double r=a1*a2;
                tv1.setText("result is"+String.valueOf(r));


            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double a1 = Double.parseDouble(et1.getText().toString());
                Double a2 = Double.parseDouble(et2.getText().toString());
                Double r=a1/a2;
                tv1.setText("result is"+String.valueOf(r));

            }
        });

    }
}