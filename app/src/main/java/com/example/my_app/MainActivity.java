package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    private TextView resTextViewResult;
    //private RequestQueue reqQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resTextViewResult = findViewById(R.id.text_view_result);
        resTextViewResult.setText("hello world");

        /*
        String url = "https://jsonplaceholder.typicode.com/todos/1";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    int userId = response.getInt("userId");
                    int id = response.getInt("id");
                    String title = response.getString("title");
                    boolean status = response.getBoolean("completed");
                    resTextViewResult.setText(userId+"\n"+id+"\n"+title+"\n"+status);
                } catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                resTextViewResult.setText("error ");
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
        */
        /*
        ********************************************************************************************
        */
        /*
        ********************************************************************************************
        Button btnSubmit = findViewById(R.id.btn_submit);
        * /
        reqQueue = Volley.newRequestQueue(this);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                jsonParse();
            }
        });
        ********************************************************************************************
         */

    }
    /*
    ************************************************************************************************
    private void jsonParse() {

        String url = "https://jsonplaceholder.typicode.com/users";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("users");

                            for (int i = 0; i < 5; i++) {
                                JSONObject user = jsonArray.getJSONObject(i);

                                String name = user.getString("name");
                                String username = user.getString("username");
                                String email = user.getString("email");

                                resTextViewResult.append(name + ", " + String.valueOf(username) + ", " + email + "\n\n");
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        reqQueue.add(request);
    }
    ************************************************************************************************
    */
}