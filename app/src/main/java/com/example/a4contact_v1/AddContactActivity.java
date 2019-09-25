package com.example.a4contact_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class AddContactActivity extends AppCompatActivity {

    private TextView tvEditContact;
    private EditText edtName1;
    private EditText edtPhone1;

    private ImageButton imgbtnCancel;
    private ImageButton imgbtnDone;
    private ImageButton imgbtnAvt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_main);
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
    public void init(){
        tvEditContact=(TextView) findViewById(R.id.tv_edit_contact);
        edtName1=(EditText) findViewById(R.id.edt_name1);
        edtPhone1=(EditText) findViewById(R.id.edt_phone1);
        imgbtnCancel=findViewById(R.id.imgbtn_cancel);
        imgbtnDone=findViewById(R.id.imgbtn_done);
        imgbtnAvt=findViewById(R.id.imgbtn_avt);
    }
}
