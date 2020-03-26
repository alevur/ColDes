package com.example.coldes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView textViewDescriprtionTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinnerColors = findViewById(R.id.spinnerColors);
        textViewDescriprtionTemp = findViewById(R.id.textViewDescriptionTemp);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescriptionPosition(position);
        textViewDescriprtionTemp.setText(description);
    }

    private String getDescriptionPosition(int position) {
        String [] description = getResources().getStringArray(R.array.description_of_temp);
        return description[position];
    }

    public void onClickSendMsg(View view) {
        Intent intent = new Intent(this, ReceivedMsgActivity.class);
        startActivity(intent);
    }
}
