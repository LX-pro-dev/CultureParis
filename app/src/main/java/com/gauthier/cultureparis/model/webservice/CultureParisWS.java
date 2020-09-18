package com.gauthier.cultureparis.model.webservice;

import android.sax.TextElementListener;
import android.util.Log;

import com.gauthier.cultureparis.model.beans.Example;
import com.gauthier.cultureparis.model.beans.Fields;
import com.gauthier.cultureparis.model.beans.Record;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by Alexandre GAUTHIER on 2020/09/18 .
 */
public class CultureParisWS {

    private static final String WS_URL = "https://opendata.paris.fr/api/records/1.0/search/?dataset=que-faire-a-paris-&q=&facet=category&facet=tags&facet=address_zipcode&facet=address_city&facet=pmr&facet=blind&facet=deaf&facet=access_type&facet=price_type";

    public static ArrayList<Fields> getFieldsDuServeur() throws Exception {

        String reponseEnJson = OkHttpUtils.sendGetOkHttpRequest(WS_URL);

        Gson gson = new Gson();
        Example example = gson.fromJson(reponseEnJson, Example.class);

        ArrayList<Fields> fields = new ArrayList<>();
        if(example == null){
            throw new Exception("variable example à null");
        }
        else if (example.getRecords() != null){
            for(Record record : example.getRecords()){
                if(record.getFields() != null){
                    fields.add(record.getFields());
                }
            }
        }
        return fields;
    }
}
