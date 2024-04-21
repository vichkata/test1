package com.example.redi1;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Transaction1 extends AppCompatActivity {

    private ViewFlipper viewFlipper;
    private Handler handler = new Handler();
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_transaction1);
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
                    Intent intent = new Intent(Transaction1.this, Transaction2.class);
                    startActivity(intent);
                    finish(); // Завершаем текущую активность
                } else {
                    viewFlipper.showNext(); // Переключаем на следующее изображение
                }
                handler.postDelayed(this, 500);
            }
        };

        handler.postDelayed(runnable, 500);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable); // Удаляем задачу при уничтожении активности
    }
}

