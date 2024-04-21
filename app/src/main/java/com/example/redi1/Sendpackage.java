package com.example.redi1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sendpackage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sendpackage);

        // Получение ссылок на EditText элементы из пользовательского интерфейса.
        EditText address = findViewById(R.id.editTextText1);
        EditText town = findViewById(R.id.editTextText6);
        EditText phoneinfo = findViewById(R.id.editTextText10);
        EditText addresspoint1 = findViewById(R.id.editTextText2);
        EditText townpoint1 = findViewById(R.id.editTextText7);
        EditText phoneinfopoint1 = findViewById(R.id.editTextText8);
        EditText items = findViewById(R.id.editTextText17);
        EditText weightit = findViewById(R.id.editTextText18);
        EditText worthit = findViewById(R.id.editTextText19);

        // Создание нового Intent для запуска активности SendAPackage2.
        Intent intent = new Intent(this, SendpackageReceipt.class);

        // Создание строк из текста в EditText элементах и добавление их в Intent как дополнительные данные.
        String placetext = address.getText().toString() +" " + town.getText().toString();
        String placetracktext = addresspoint1.getText().toString() +" " + townpoint1.getText().toString();
        intent.putExtra("place", placetext);
        intent.putExtra("phon", phoneinfo.getText().toString());
        intent.putExtra("placetrakc", placetracktext);
        intent.putExtra("phonetrack", phoneinfopoint1.getText().toString());
        intent.putExtra("item", items.getText().toString());
        intent.putExtra("weight", weightit.getText().toString());
        intent.putExtra("worth", worthit.getText().toString());

        // Запуск активности SendAPackage2 с переданными данными.
      //  startActivity(intent);
        Button button1 = findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });


        ImageButton button = findViewById(R.id.imageButton12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sendpackage.this, Profile.class);
                startActivity(intent);
            }
        });



    }
}