package org.bolat.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resimDegistir(View view ) {
        ImageView imageView = findViewById(R.id.imageView);
        Button button=findViewById(R.id.button);
        imageView.setImageResource(R.drawable.metallica2);

    }

}
