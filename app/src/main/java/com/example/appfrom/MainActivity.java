package com.example.appfrom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent() ;

        if(i.getAction().equals("com..example.rohit")){

            Intent k = new Intent("com.example.rohit");
            String z = i.getStringExtra("rohit");
            Encryption encryption = new Encryption();
            String encode = encryption.encrypt(z , "AKSHAT");
            Toast.makeText(getApplicationContext() , encode , Toast.LENGTH_LONG).show();
            encode += z ;
            k.putExtra("rohit" , encode );
            startActivity(k);
        }
    }
}