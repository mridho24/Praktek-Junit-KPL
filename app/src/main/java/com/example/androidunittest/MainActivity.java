package com.example.androidunittest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Temukan button berdasarkan ID
        Button button = findViewById(R.id.button);

        // Tambahkan aksi ketika button ditekan
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tampilkan pesan saat button ditekan
                Toast.makeText(MainActivity.this, "Button ditekan!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
