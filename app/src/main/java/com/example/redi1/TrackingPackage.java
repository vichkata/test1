package com.example.redi1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TrackingPackage extends AppCompatActivity {
    private CheckBox checkBox7;
    private CheckBox checkBox8;
    private CheckBox checkBox9;
    private CheckBox checkBox10;

    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            // Проверяем, не выключено ли приложение
            if (!TrackingPackage.this.isFinishing()) {
                // Изменяем состояние чекбокса и цвет текста
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        checkBox7.setChecked(!checkBox7.isChecked());
                        checkBox7.setTextColor(checkBox7.isChecked() ? Color.BLUE : Color.GRAY);
                    }
                }, 5000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        checkBox8.setChecked(!checkBox8.isChecked());
                        checkBox8.setTextColor(checkBox8.isChecked() ? Color.BLUE : Color.GRAY);
                    }
                }, 5000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        checkBox9.setChecked(!checkBox9.isChecked());
                        checkBox9.setTextColor(checkBox9.isChecked() ? Color.BLUE : Color.GRAY);
                    }
                }, 5000);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        checkBox10.setChecked(!checkBox10.isChecked());
                        checkBox10.setTextColor(checkBox10.isChecked() ? Color.BLUE : Color.GRAY);
                    }
                }, 5000);
            }
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Удаляем задачу, чтобы избежать утечек памяти
        handler.removeCallbacks(runnable);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tracking_package);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Инициализация элементов интерфейса
        checkBox7 = findViewById(R.id.checkBox7);
        checkBox8 = findViewById(R.id.checkBox8);
        checkBox9 = findViewById(R.id.checkBox9);
        checkBox10 = findViewById(R.id.checkBox10);

        // Запускаем задачу
        handler.post(runnable);

        ImageButton button = findViewById(R.id.imageButton4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrackingPackage.this, Profile.class);
                startActivity(intent);
            }
        });
        ImageButton button2 = findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrackingPackage.this, Wallet.class);
                startActivity(intent);
            }
        });
        ImageButton button3 = findViewById(R.id.imageButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrackingPackage.this, Home.class);
                startActivity(intent);
            }
        });
        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TrackingPackage.this, Sendpackage2.class);
                startActivity(intent);
            }
        });
    }
}