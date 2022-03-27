package com.example.program14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.content.Context;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.Toast;

public class MaainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radiom:
                if (checked)
                    Toast.makeText(this, "Selected male", Toast.LENGTH_SHORT).show();

                break;
            case R.id.check2:
                if (radiof)
                    Toast.makeText(this, "Selected female", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
