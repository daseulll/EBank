package com.example.ebank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    //loginButton을 가져오기 위한 인스턴스 생
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.loginButton);
        // View에서 id로 원하는 버튼을 retreive
        // 컴파일러에게 우리가 찾는 것이 button임을 알린다.
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //user의 클릭을 받는 함수
                Log.d("BUTTON", "User clicked login button");
            }
        });
    }
}
