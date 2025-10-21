package com.example.untitled;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // ImageView에 이미지 설정
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cat);
    }
}
