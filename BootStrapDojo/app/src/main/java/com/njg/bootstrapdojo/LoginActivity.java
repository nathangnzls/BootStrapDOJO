package com.njg.bootstrapdojo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    EditText etUsername,etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        etUsername = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPass);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user,pass;
                user = etUsername.getText().toString();
                pass = etPass.getText().toString();

                if(user.length()<=0 || pass.length()<=0){
                    Toast.makeText(LoginActivity.this,"Fields cannot be empty!",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(LoginActivity.this,"success!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
