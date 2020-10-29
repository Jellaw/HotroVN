package com.example.hotrovn.Activities.NeedRelief.Dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.NonNull;

import com.example.hotrovn.Activities.NeedRelief.Create;
import com.example.hotrovn.R;

public class Custom_Dialog_Sucess extends Dialog {
    private Button done_btn;
    public Context context;
    Activity activity;
    public Custom_Dialog_Sucess(@NonNull Context context, Activity activity) {
        super(context);
        this.context = context;
        this.activity = activity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_help_news_sucessfully);

        this.done_btn = findViewById(R.id.button_done);

        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonDoneClick();
            }
        });
    }
    private void buttonDoneClick()  {
        this.dismiss();
        activity.onBackPressed();
    }

}
