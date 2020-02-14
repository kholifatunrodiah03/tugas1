package com.rizky92.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KholifatunActivity extends AppCompatActivity {

    public static final int RESULT_CODE=110;
    public static final String EXTRA_NAME="extra_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kholifatun);
        final EditText edtEdit=findViewById(R.id.editText);
        Button btnOK=findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String OK=edtEdit.getText().toString();
                Intent back=new Intent();
                back.putExtra(EXTRA_NAME,OK);
                setResult(RESULT_CODE,back);
                finish();
            }
        });
    }
}
