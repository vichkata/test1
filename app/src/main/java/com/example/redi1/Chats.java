package com.example.redi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chats);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageButton button = findViewById(R.id.imageButton12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, Home.class);
                startActivity(intent);
            }
        });
        LinearLayout linearLayout = findViewById(R.id.linearLayout1); // Замените R.id.your_linear_layout_id на реальный ID вашего LinearLayout
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, ChatRider.class);
                startActivity(intent);
            }
        });
        LinearLayout linearLayout2 = findViewById(R.id.linearLayout2); // Замените R.id.your_linear_layout_id на реальный ID вашего LinearLayout
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, ChatRider.class);
                startActivity(intent);
            }
        });
        LinearLayout linearLayout3 = findViewById(R.id.linearLayout3); // Замените R.id.your_linear_layout_id на реальный ID вашего LinearLayout
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, ChatRider.class);
                startActivity(intent);
            }
        });
        LinearLayout linearLayout4 = findViewById(R.id.linearLayout4); // Замените R.id.your_linear_layout_id на реальный ID вашего LinearLayout
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, ChatRider.class);
                startActivity(intent);
            }
        });
        LinearLayout linearLayout5 = findViewById(R.id.linearLayout5); // Замените R.id.your_linear_layout_id на реальный ID вашего LinearLayout
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, ChatRider.class);
                startActivity(intent);
            }
        });

    }
}