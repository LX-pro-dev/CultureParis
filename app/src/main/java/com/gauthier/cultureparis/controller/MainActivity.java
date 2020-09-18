package com.gauthier.cultureparis.controller;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gauthier.cultureparis.R;
import com.gauthier.cultureparis.model.beans.Fields;
import com.gauthier.cultureparis.model.webservice.CultureParisWS;
import com.gauthier.cultureparis.view.FieldAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FieldAdapter.OnFieldsListener {

    //Composants graphiques
    private TextView main_tv_info;
    private Button main_bt_charger;
    private RecyclerView main_rv;

    //Données
    private ArrayList<Fields> fields;

    //Outils
    private FieldAdapter fieldAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("R.id.main_rv", "rv= " + R.id.main_rv);
        main_rv = findViewById(R.id.main_rv);
        main_tv_info = findViewById(R.id.main_tv_info);
        main_bt_charger = findViewById(R.id.main_bt_charger);

        main_bt_charger.setOnClickListener(this);

        fields = new ArrayList<>();

        fieldAdapter = new FieldAdapter(fields, this);
        main_rv.setLayoutManager(new LinearLayoutManager(this));
        main_rv.setAdapter(fieldAdapter);
    }

    @Override
    public void onClick(View view) {

        try {
            MonAT monAt= new MonAT();
            monAt.execute();
        } catch (Exception e) {
            e.printStackTrace();
            main_tv_info.setText(e.getMessage());
        }


    }

    /**
     * méthode appelée lors d'un clic sur une ligne et en paramêtre le fields en question
     * @param fields
     */
    @Override
    public void onClick(Fields fields) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.FIELDS_KEY,fields);

        startActivity(intent);
    }

    public class MonAT extends AsyncTask {

        private ArrayList<Fields> resultat = null;
        private Exception exception = null;

        /**
         * @param objects
         * @deprecated
         */
        @Override
        protected Object doInBackground(Object[] objects) {

            try {
                resultat = CultureParisWS.getFieldsDuServeur();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);

            if(exception != null){
                exception.printStackTrace();
                main_tv_info.setText(exception.getMessage());
            }
            else{
                fields.clear();
                fields.addAll(resultat);
                fieldAdapter.notifyDataSetChanged();
            }
        }
    }
}