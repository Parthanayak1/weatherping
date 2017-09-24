package com.example.partha.weatherping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.view.View;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {
    Spinner spinnerosversions;
    TextView selversion;
    private String[] state = {"Delhi", "Ghaziabad", "Kanpur", "Trivendrum"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println(state.length);
        selversion = (TextView) findViewById(R.id.selVersion);
        spinnerosversions = (Spinner) findViewById(R.id.osversions);
        ArrayAdapter<String> adapter_state = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, state);
        adapter_state.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerosversions.setAdapter(adapter_state);
        spinnerosversions.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        spinnerosversions.setSelection(position);
        String selState = (String) spinnerosversions.getSelectedItem();
        selversion.setText("Selectes City:"+ selState);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }

}

