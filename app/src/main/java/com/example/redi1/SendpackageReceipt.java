package com.example.redi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SendpackageReceipt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sendpackage_receipt);
        // Получение ссылок на TextView элементы из пользовательского интерфейса.
        TextView place = findViewById(R.id.textView32);
        TextView phon = findViewById(R.id.textView33);
        TextView placetrakc = findViewById(R.id.textView34);
        TextView phonetrack = findViewById(R.id.textView35);
        TextView weight = findViewById(R.id.textView37);
        TextView worth = findViewById(R.id.textView39);
        TextView item = findViewById(R.id.textView41);

        // Получение дополнительных данных из Intent, переданного в эту активность.
        Bundle arg = getIntent().getExtras();

        // Установка текста для TextView элементов из полученных данных.
        place.setText(arg.getString("place"));
        phon.setText(arg.getString("phon"));
        placetrakc.setText(arg.getString("placetrakc"));
        phonetrack.setText(arg.getString("phonetrack"));
        weight.setText(arg.getString("weight"));
        worth.setText(arg.getString("worth"));
        item.setText(arg.getString("item"));

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SendpackageReceipt.this, Sendpackage.class);
                startActivity(intent);
            }
        });
        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SendpackageReceipt.this, Transaction1.class);
                startActivity(intent);
            }
        });
    }
}