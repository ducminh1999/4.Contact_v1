package com.example.a4contact_v1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView tvInfor;
    private EditText edtSearch;
    private FloatingActionButton fabAdd;
    private ImageButton imgbtnAvt;
    private ImageButton imgbtnCall;
    private ImageButton imgbtnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(getApplicationContext(),MainAddContactActivity.class);
                startActivity(intent);
            }
        });
        imgbtnAvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),EditContactActivity.class);
                startActivity(intent);
            }
        });
    }
    public void init() {
        tvInfor = (TextView) findViewById(R.id.tv_infor);
        edtSearch = (EditText) findViewById(R.id.edt_search);
        fabAdd = (FloatingActionButton) findViewById(R.id.fab_add);
        imgbtnAvt = findViewById(R.id.imgbtn_avt);
        imgbtnCall = findViewById(R.id.imgbtn_call);
        imgbtnSearch = findViewById(R.id.imgbtn_search);
    }
}
