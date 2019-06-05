package com.example.premission;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private EditText PhoneNumber,emailTo,EmailSUB,EmailMSG;
    private Button sms, email;
    private ToggleButton BT, WF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhoneNumber = findViewById(R.id.PhoneNumber);
        sms = findViewById(R.id.sendSMS);


        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("sms"+PhoneNumber.getText().toString().trim())));
            }
        });
    }
}
