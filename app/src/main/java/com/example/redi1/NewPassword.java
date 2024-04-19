package com.example.redi1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NewPassword extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_new_password);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button2 = findViewById(R.id.button3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewPassword.this, Home.class);
                startActivity(intent);
            }
        });

        // Инициализация EditText и Button
        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        button3 = findViewById(R.id.button3);

        // Добавление слушателей текста для EditText
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                checkFields();
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                checkFields();
            }
        });

        // Установка начального цвета кнопки
        button3.setBackgroundColor(Color.GRAY);
    }

    private void checkFields() {
        // Проверка, заполнены ли все поля
        if (editText1.getText().length() > 0 && editText2.getText().length() > 0) {
            // Если все поля заполнены, изменение цвета кнопки на синий
            button3.setBackgroundColor(Color.BLUE);
        } else {
            // Если не все поля заполнены, изменение цвета кнопки обратно на серый
            button3.setBackgroundColor(Color.GRAY);
        }
    }
}