package com.example.redi1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Successful1 extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    private Handler handler = new Handler();
    private Runnable runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_successful1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        viewFlipper = findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(500); // Установите интервал между переключениями изображений

        runnable = new Runnable() {
            @Override
            public void run() {
                if (viewFlipper.getDisplayedChild() == viewFlipper.getChildCount() - 1) {
                    // Если последнее изображение, переходим к следующей активности
                    Intent intent = new Intent(Successful1.this, Successful2.class);
                    startActivity(intent);
                    finish(); // Завершаем текущую активность
                } else {
                    viewFlipper.showNext(); // Переключаем на следующее изображение
                }
                handler.postDelayed(this, 500);
            }
        };

        handler.postDelayed(runnable, 500);
        Button button2 = findViewById(R.id.button8);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Successful1.this, TrackingPackage.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable); // Удаляем задачу при уничтожении активности
    }
    }