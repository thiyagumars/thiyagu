package com.example.thiyagu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginuserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginuser);
        final EditText etUserName=(EditText) findViewById(R.id.etusername) ;
        final EditText etPassword=(EditText) findViewById(R.id.etpassword) ;
        final Button bLogin= (Button) findViewById(R.id.blogin ) ;
        final TextView RegisterHere=(TextView) findViewById(R.id.tvregisterhere) ;
        RegisterHere .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent=new Intent(loginuserActivity .this ,RegisterActivity .class);
                loginuserActivity .this.startActivity(registerIntent ) ;
            }
        });
    }
}
