package com.gauthier.cultureparis.controller;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gauthier.cultureparis.R;
import com.gauthier.cultureparis.model.beans.Fields;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    public static String url;
    public final static String FIELDS_KEY = "FIELDS_KEY";
    private TextView detail_tv_title;
    private TextView detail_tv_genre;
    private TextView detail_tv_detail;
    private Button detail_bt_site;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detail_tv_title = findViewById(R.id.detail_tv_title);
        detail_tv_genre = findViewById(R.id.detail_tv_genre);
        detail_tv_detail = findViewById(R.id.detail_tv_detail);
        detail_bt_site = findViewById(R.id.detail_bt_site);

        Fields fields = (Fields) getIntent().getExtras().getSerializable(FIELDS_KEY);

        detail_tv_title.setText(fields.getTitle());
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            detail_tv_detail.setText(Html.fromHtml(fields.getDescription(), Html.FROM_HTML_MODE_LEGACY));
        } else {
            detail_tv_detail.setText(Html.fromHtml(fields.getDescription()));
        }
        detail_tv_genre.setText(fields.getTags());
        url = fields.getAccess_link();
        detail_bt_site.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }
}