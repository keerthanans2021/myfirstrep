package com.example.program12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    TextView tv1;
    int c=10;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1=findViewById(R.id.b1);
        tv1=findViewById(R.id.tv1);
        tv1.setText("number of attempts remaining:10");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(et1.getText().toString(),et2.getText().toString());

            }
        });

    }
    private  void  validate(String un,String pw){
        if((un.equals("Admin"))&&(pw.equals("1234"))){
            Intent i= new Intent(MainActivity.this,SecondActivity.class);
            startActivity(i);
        }
        else
        {
            c--;
            tv1.setText("number of attempts remaining"+String.valueOf(c));
            if(c==0){
                b1.setEnabled(false);
            }
        }
    }
}