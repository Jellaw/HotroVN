package com.example.hotrovn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectUsingPurpose extends AppCompatActivity {
    Button needRelief, HelperBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_using_purpose);
        needRelief=findViewById(R.id.NeedReliefBtn);
        HelperBtn=findViewById(R.id.HelperBtn);

        needRelief.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SelectUsingPurpose.this, PhoneRegisterActivity.class);
                startActivity(intent);

            }
        });
        HelperBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SelectUsingPurpose.this, PhoneRegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
