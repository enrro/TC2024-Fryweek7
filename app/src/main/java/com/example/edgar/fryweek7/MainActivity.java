package com.example.edgar.fryweek7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.List;

public class MainActivity extends AppCompatActivity implements JSONClass.JSONCallback, AdapterView.OnItemSelectedListener , AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] example = {"paquito", "pacote", "paco"};

        // Adapter
        // cñases qie traducen informacion a una estructura a widget

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, example);

        ListView list = (ListView)findViewById(R.id.list);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        list.setAdapter(adapter1);
        spinner.setAdapter(adapter1);
    }


    public void request(View v){
        JSONClass task = new JSONClass(this);
        task.execute("https://api.github.com/", "hola", "amiguitos", "vamos a bailar", "algo que esta perron");
    }
    @Override
    public void taskDone(JSONObject jsonObject) {
        try {
            Toast.makeText(this,
                    jsonObject.getString("current_user_url"),
                    Toast.LENGTH_SHORT).show();
        }catch (JSONException je){
            je.printStackTrace();
        }
    }

    public void testJSON(View v){
        try{
            String json = "[1, 2, 3]";
            JSONArray array = new JSONArray(json);

            Toast.makeText(this, array.getInt(0) + "", Toast.LENGTH_SHORT).show();

        }catch(JSONException je){
            je.printStackTrace();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
