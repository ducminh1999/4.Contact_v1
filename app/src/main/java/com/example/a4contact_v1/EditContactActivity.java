package com.example.a4contact_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class EditContactActivity extends AppCompatActivity {

    private TextView tvEditContact;
    private TextView tvName;
    private TextView tvPhone;
    private ImageButton imgbtnCancel;
    private ImageButton imgbtnDone;
    private ImageButton imgbtnAvt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);
        init();
        imgbtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        imgbtnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void init() {
        tvEditContact = (TextView) findViewById(R.id.tv_edit_contact);
        tvName = (TextView) findViewById(R.id.tv_name);
        tvPhone = (TextView) findViewById(R.id.tv_phone);
        imgbtnCancel=findViewById(R.id.imgbtn_cancel);
        imgbtnDone=findViewById(R.id.imgbtn_done);
        imgbtnAvt=findViewById(R.id.imgbtn_avt);
    }
}
