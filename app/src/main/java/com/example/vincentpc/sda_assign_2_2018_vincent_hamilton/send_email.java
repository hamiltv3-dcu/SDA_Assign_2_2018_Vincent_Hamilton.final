package com.example.vincentpc.sda_assign_2_2018_vincent_hamilton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class send_email extends AppCompatActivity {
    public static String message1;   //global variables to pass to activity two from email form
    public static String message2;
    public static String message3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_email);

        /* Here creating variables to hold the data from the test fields */
        EditText to;
        EditText Subject;
        EditText Compose;
        Button passButton;

                Log.i("MainActivity",  "Inside OnCreate Method");

                Log.e("MainActivity",  "Inside OnCreate Method");


            passButton = (findViewById(R.id.button2));




           // set a listener on the form button
            passButton.setOnClickListener(new View.OnClickListener() {
                @Override



                    public void onClick(View v) {

                         EditText editText = findViewById(R.id.editText);
                      EditText editText2 = findViewById(R.id.editText2);
                     EditText editText3 = findViewById(R.id.editText3);
                     message1 = editText.getText().toString();
                     message2 = editText2.getText().toString();
                     message3 = editText3.getText().toString(); 

                      Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                   startActivity(intent);



                    }
                });





    }





}
