package com.example.ben44.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button)findViewById(R.id.button);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener(){

            int counter=0;
            TextView t=(TextView)findViewById(R.id.textView5);
            public void onClick(View v){
                counter++;
                if(counter>=3){
                    Log.d("Info","The button has been pressed "+counter+" times.");
                    t.setText("You have clicked "+counter+" times.");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            EditText e=(EditText)findViewById((R.id.editText));
            public void onClick(View v){
                Toast t = Toast.makeText(getApplicationContext(),e.getText().toString(),Toast.LENGTH_LONG);
                //Toast.makeText(getApplicationContext(),e.getText().toString(),Toast.LENGTH_LONG);
                t.show();
            }

        });

        b3.setOnClickListener(new View.OnClickListener(){
            ImageView i=(ImageView)findViewById(R.id.imageView);
            boolean pup1=true;
            public void onClick(View v){
                if(pup1){
                    i.setImageResource(R.drawable.puppy2);
                }
                else {
                    i.setImageResource(R.drawable.puppy1);
                }
                pup1=!pup1;
            }
        });


    }





}
