package com.example.entry;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText login, parol;
    Button entry;
    TextView right;
    String par = "fyz2004";
    String log = "zaides";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        parol = findViewById(R.id.parol);
        entry = findViewById(R.id.entry);
        right = findViewById(R.id.right);

        entry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log1 = login.getText().toString();
                String par1 = parol.getText().toString();
                if(log1.equals(log) && par1.equals(par)) {right.setText("Верно"); right.setTextColor(Color.GREEN);}
                else {right.setText("Вы ошиблись в логине или пароле"); right.setTextColor(Color.RED);}
                login.setText("");
                parol.setText("");
            }
        });

    }
}