package com.gauthier.cultureparis.model.webservice;

import android.util.Log;

import java.net.HttpURLConnection;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Alexandre GAUTHIER on 2020/09/18
 */
class OkHttpUtils {

    /**
     * Réalise un requête GET avec l'URL transmise en paramètre et retourne le résultat
     * @param url
     * @return
     * @throws Exception
     */
    public static String sendGetOkHttpRequest(String url) throws Exception {
        Log.v("TAG", url);
        OkHttpClient client = new OkHttpClient();

        //création de la requête
        Request request = new Request.Builder().url(url).build();

        //exécution de la requête
        Response response = client.newCall(request).execute();

        //analyse du code retour
        if (response.code() != HttpURLConnection.HTTP_OK) {
            throw new Exception("Réponse du serveur incorrecte : " + response.code());
        } else {
            //résultat de la requête
            return response.body().string();
        }
    }
}
