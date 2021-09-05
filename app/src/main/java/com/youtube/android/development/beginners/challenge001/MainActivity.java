package com.youtube.android.development.beginners.challenge001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Global variables
    EditText firstName;
    EditText lastName;
    EditText email;
    TextView firstNameOut;
    TextView lastNameOut;
    TextView emailOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRegisterBtnClick(View view) {
        findTheViews();
        firstNameOut.setText(firstName.getText().toString());
        lastNameOut.setText(lastName.getText().toString());
        emailOut.setText(email.getText().toString());
    }

    private void findTheViews() {
        firstName = (EditText) findViewById(R.id.first_name);
        lastName = (EditText) findViewById(R.id.last_name);
        email = (EditText) findViewById(R.id.email);
        firstNameOut = (TextView) findViewById(R.id.first_name_out);
        lastNameOut = (TextView) findViewById(R.id.last_name_out);
        emailOut = (TextView) findViewById(R.id.email_out);
    }
}