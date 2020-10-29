package com.example.hotrovn.Activities.NeedRelief.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.hotrovn.R;
import com.shawnlin.numberpicker.NumberPicker;

public class CustomDialogSelectLocation extends Dialog {
    private String[] data = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
    int pss;

   public interface setLocation {
         void set_location(String location);
    }
    private NumberPicker numberPicker;
    private Button save_btn;
    private CustomDialogSelectLocation.setLocation setLocation;
    private Context context;
    public CustomDialogSelectLocation(@NonNull Context context, CustomDialogSelectLocation.setLocation setLocation) {
        super(context);
        this.context = context;
        this.setLocation=setLocation;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_location_select);

        this.numberPicker = findViewById(R.id.number_picker);
        this.save_btn=findViewById(R.id.button_save);


        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(data.length);
        numberPicker.setDisplayedValues(data);
        numberPicker.setValue(7);

        numberPicker.setScrollerEnabled(true);

        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonDoneClick();
            }
        });
    }
    private void buttonDoneClick()  {
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                pss=newVal;
            }
        });
        String location = data[pss];
        this.dismiss();
    }
}
