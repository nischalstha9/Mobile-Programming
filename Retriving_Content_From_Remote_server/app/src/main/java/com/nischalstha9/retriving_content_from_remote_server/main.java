package com.nischalstha9.retriving_content_from_remote_server;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.*;
public class main extends Activity {
    EditText input;
    Button btn, sendContentBtn;
    TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        input = (EditText) findViewById(R.id.textVal);
        btn = (Button) findViewById(R.id.getContentBtn);
        sendContentBtn = (Button) findViewById(R.id.sendContentBtn);
        text = (TextView) findViewById(R.id.contentView);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://jsonplaceholder.typicode.com/todos/1/";
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                text.setText("Data Retrieved: \n"+response);
                text.setMovementMethod(new ScrollingMovementMethod());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

        StringRequest post_request = new StringRequest(Request.Method.POST, "https://jsonplaceholder.typicode.com/todos/", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                text.setText("Data Posted: \n"+response);
                text.setMovementMethod(new ScrollingMovementMethod());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("title", input.getText().toString());
                return params;
            }
        };

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                queue.add(stringRequest);
            }
        });
        sendContentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                queue.add(post_request);
            }
        });


    }
}
