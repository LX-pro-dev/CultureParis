package com.gauthier.cultureparis.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.gauthier.cultureparis.R;

public class SiteActivity extends AppCompatActivity {

    private WebView site_wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_site);

        site_wv = findViewById(R.id.site_wv);


    }
}