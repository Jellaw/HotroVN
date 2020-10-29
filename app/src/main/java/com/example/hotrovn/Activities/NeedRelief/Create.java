package com.example.hotrovn.Activities.NeedRelief;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotrovn.Activities.NeedRelief.Dialog.CustomDialogSelectLocation;
import com.example.hotrovn.Activities.NeedRelief.Dialog.Custom_Dialog_Sucess;
import com.example.hotrovn.R;

public class Create extends AppCompatActivity {
    Button save_btn;
    TextView select_province, select_city, select_district;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        //====init======================================================
        save_btn=findViewById(R.id.button_save);
        select_province=findViewById(R.id.select_province);
        select_city=findViewById(R.id.select_city);
        select_district=findViewById(R.id.select_district);
        //=====set action==============================================
        select_province.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonSelectClicked();
            }
        });

        this.save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonOpenDialogClicked();
            }
        });
    }

    private void buttonOpenDialogClicked()  {
        Custom_Dialog_Sucess dialog_sucess = new Custom_Dialog_Sucess (this, Create.this) ;
        dialog_sucess.show();
        dialog_sucess.setCancelable(false);
    }
    private  void buttonSelectClicked(){
        CustomDialogSelectLocation.setLocation setLocation = new CustomDialogSelectLocation.setLocation() {
            @Override
            public void set_location(String location) {
                select_province.setText(location);
            }
        };
        final CustomDialogSelectLocation dialog = new CustomDialogSelectLocation(this, setLocation);
        dialog.show();
    }
}
