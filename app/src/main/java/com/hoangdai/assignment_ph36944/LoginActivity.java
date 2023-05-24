package com.hoangdai.assignment_ph36944;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edtUsername = findViewById(R.id.edt_username);
        EditText edtPassword = findViewById(R.id.edt_password);

        String sUsername = getIntent().getStringExtra(RegisterActivity.KEY_USERNAME);
        String sPassword = getIntent().getStringExtra(RegisterActivity.KEY_PASSWORD);

        edtUsername.setText(sUsername);
        edtPassword.setText(sPassword);

        Button btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent);
            }
        });

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aUsername = edtUsername.getText().toString();
                String aPassword = edtPassword.getText().toString();

                if(aUsername==null||aUsername.equals("")){
                    Toast.makeText(getApplicationContext(), "Cần nhập Username!", Toast.LENGTH_SHORT).show();
                } else if(aPassword==null||aPassword.equals("")){
                    Toast.makeText(getApplicationContext(), "Cần nhập Password!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent2 = new Intent(getApplicationContext(), HomeActivity.class);
                    startActivity(intent2);
                    finish();
                }

            }
        });
    }
}