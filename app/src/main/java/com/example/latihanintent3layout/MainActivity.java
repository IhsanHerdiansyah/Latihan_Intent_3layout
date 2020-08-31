package com.example.latihanintent3layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnjurusan;
    Button btnweb;
    Button btntelepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnjurusan = (Button)findViewById(R.id.btnjurusan);
        btnjurusan.setOnClickListener(this);
        btntelepon = (Button)findViewById(R.id.btntelepon);
        btntelepon.setOnClickListener(this);
        btnweb = (Button)findViewById(R.id.btnweb);
        btnweb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnjurusan:
                Intent jurusan = new Intent(MainActivity.this, JurusanActivity.class);
                startActivity(jurusan);
                break;
            case  R.id.btnweb:
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://smkn4bdg.sch.id"));
                startActivity(web);
                break;
            case R.id.btntelepon:
                String phoneNumber = "0227303736";
                Intent notelp = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(notelp);

        }

    }
}