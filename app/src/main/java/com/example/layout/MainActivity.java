package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.like).setOnClickListener(this);
        findViewById(R.id.share).setOnClickListener(this);
        findViewById(R.id.photo).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.like):
                Toast.makeText(this, "i love kuku", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.share):
                Toast.makeText(this, "together kuku", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.photo):
                Toast.makeText(this, "click kuku", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
