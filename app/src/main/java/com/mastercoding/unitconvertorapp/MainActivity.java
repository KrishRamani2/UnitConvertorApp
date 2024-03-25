package com.mastercoding.unitconvertorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textheadline , converttext;
    EditText myedit;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textheadline = findViewById(R.id.textView);
        converttext = findViewById(R.id.textView3);
        btn = findViewById(R.id.button);
        myedit = findViewById(R.id.editText);
        String input = myedit.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                double kilo = Double.parseDouble(input);
              double pounds =  convertor(kilo);
              converttext.setText(""+pounds);
            }
        });
    }
    public double convertor(double kilo){
        return kilo*2.20462;
    }

}