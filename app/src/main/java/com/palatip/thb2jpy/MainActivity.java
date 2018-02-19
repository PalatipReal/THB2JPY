package com.palatip.thb2jpy;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText I,I2;
    private Button bt1,bt2;
    private ImageView image1;
    private String JPY2;
    private double THB,JPY;
    private TextView t4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I = findViewById(R.id.edit1);
       I2 = findViewById(R.id.edit2);
        image1 = findViewById(R.id.image22);
        t4 = findViewById(R.id.t4);
    }

    public void change(View view) {
        THB = Double.parseDouble(I.getText().toString());
        JPY = (THB*3.38);
       JPY2 = Double.toString(JPY);
       I2.setText(JPY2);
        t4.setText("สำเร็จ");
    }

}
