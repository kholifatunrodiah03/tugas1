package com.rizky92.project1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.rizky92.project1.KholifatunActivity.RESULT_CODE;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE=100;
    TextView tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName=findViewById(R.id.project1);
        Button btnNext=findViewById(R.id.button);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,KholifatunActivity.class);
                startActivityForResult(i,REQUEST_CODE);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_CODE) {
            String hasil=data.getStringExtra(KholifatunActivity.EXTRA_NAME);
            tvName.setText(String.format("%s %s",getResources().getString(R.string.hasil),hasil));
        }
    }
}
