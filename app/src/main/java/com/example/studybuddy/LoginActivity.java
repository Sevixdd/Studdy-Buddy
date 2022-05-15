package com.example.studybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    boolean exitApp = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        Button signIn = (Button) findViewById(R.id.signin);
        signIn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Start WebViewActivity class
                if(username.getText().toString().equals("eee") && password.getText().toString().equals("eee") )
                {Intent myIntent = new Intent(LoginActivity.this,
                        MainActivity.class);
                startActivity(myIntent);}
                else
                    Toast.makeText(LoginActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
            }
        });

        Button wView = (Button) findViewById(R.id.webview);
        wView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View x) {
                // Start WebViewActivity class
                Intent myIntent = new Intent(LoginActivity.this,
                        WebViewActivity.class);
                startActivity(myIntent);
            }
        });
    }



    @Override
    public void onBackPressed() {
        if(exitApp){
            super.onBackPressed();
            return;
        }
        this.exitApp=true;
        Toast.makeText(this,"Press Back button again to exit",Toast.LENGTH_SHORT).show();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                exitApp=false;
            }
        }, 2000);
    }
}