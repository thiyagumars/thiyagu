package com.example.thiyagu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etAge=(EditText) findViewById(R.id.etage) ;
        final EditText etName=(EditText) findViewById(R.id.etname) ;
        final EditText etUserName=(EditText) findViewById(R.id.etusername) ;
        final EditText etPassword=(EditText) findViewById(R.id.etpassword) ;
        final Button bRegister= (Button) findViewById(R.id.bregister ) ;
    }
}
