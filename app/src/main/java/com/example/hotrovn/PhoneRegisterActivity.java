package com.example.hotrovn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotrovn.Activities.NeedRelief.HelpNews;

public class PhoneRegisterActivity extends AppCompatActivity {
    EditText editPhoneNum;
    Button next_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_register);

        editPhoneNum=findViewById(R.id.editPhoneNum);
        next_btn= findViewById(R.id.next_btn);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneRegisterActivity.this, HelpNews.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
