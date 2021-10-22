package com.example.hellotoastandres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button countB;
    private Button toastB;
    private int num = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = (TextView) findViewById(R.id.show_count);

        countB = (Button) findViewById(R.id.button_count);
        countB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                updateCounter();
            }
        });

        toastB = (Button) findViewById(R.id.button_toast);
        toastB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), showCount.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateCounter() {
        showCount.setText(String.valueOf(num));
    }
}