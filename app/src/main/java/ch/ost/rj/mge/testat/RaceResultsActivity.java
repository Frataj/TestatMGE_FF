package ch.ost.rj.mge.testat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class RaceResultsActivity extends AppCompatActivity {

    ArrayList<String> drivers = new ArrayList<>();
    ArrayList<String> results = new ArrayList<>();

    Spinner p1;
    Spinner p2;
    Spinner p3;
    Spinner p4;
    Spinner p5;
    Spinner p6;
    Spinner p7;
    Spinner p8;
    Spinner p9;
    Spinner p10;
    Spinner p11;
    Spinner p12;
    Spinner p13;
    Spinner p14;
    Spinner p15;
    Spinner p16;
    Spinner p17;
    Spinner p18;
    Spinner p19;
    Spinner p20;

    public static Intent createIntent(Context context) {
        return new Intent(context, RaceResultsActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_race_results);

        populateDrivers();

        p1 = findViewById(R.id.resultsDriverP1);
        p2 = findViewById(R.id.resultsDriverP2);
        p3 = findViewById(R.id.resultsDriverP3);
        p4 = findViewById(R.id.resultsDriverP4);
        p5 = findViewById(R.id.resultsDriverP5);
        p6 = findViewById(R.id.resultsDriverP6);
        p7 = findViewById(R.id.resultsDriverP7);
        p8 = findViewById(R.id.resultsDriverP8);
        p9 = findViewById(R.id.resultsDriverP9);
        p10 = findViewById(R.id.resultsDriverP10);
        p11 = findViewById(R.id.resultsDriverP11);
        p12 = findViewById(R.id.resultsDriverP12);
        p13 = findViewById(R.id.resultsDriverP13);
        p14 = findViewById(R.id.resultsDriverP14);
        p15 = findViewById(R.id.resultsDriverP15);
        p16 = findViewById(R.id.resultsDriverP16);
        p17 = findViewById(R.id.resultsDriverP17);
        p18 = findViewById(R.id.resultsDriverP18);
        p19 = findViewById(R.id.resultsDriverP19);
        p20 = findViewById(R.id.resultsDriverP20);

        ArrayAdapter<String> adapterp1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p1.setAdapter(adapterp1);
        p1.setSelection(0);
        p1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );


        ArrayAdapter<String> adapterp2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p2.setAdapter(adapterp2);
        p2.setSelection(1);
        p2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p3.setAdapter(adapterp3);
        p3.setSelection(2);
        p3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p4.setAdapter(adapterp4);
        p4.setSelection(3);
        p4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p5.setAdapter(adapterp5);
        p5.setSelection(4);
        p5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p6.setAdapter(adapterp6);
        p6.setSelection(5);
        p6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p7.setAdapter(adapterp7);
        p7.setSelection(6);
        p7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp8 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p8.setAdapter(adapterp8);
        p8.setSelection(7);
        p8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp9 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p9.setAdapter(adapterp9);
        p9.setSelection(8);
        p9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp10 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p10.setAdapter(adapterp10);
        p10.setSelection(9);
        p10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp11 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p11.setAdapter(adapterp11);
        p11.setSelection(10);
        p11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp12 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p12.setAdapter(adapterp12);
        p12.setSelection(11);
        p12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp13 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p13.setAdapter(adapterp13);
        p13.setSelection(12);
        p13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp14 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp14.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p14.setAdapter(adapterp14);
        p14.setSelection(13);
        p14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp15 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp15.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p15.setAdapter(adapterp15);
        p15.setSelection(14);
        p15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp16 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp16.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p16.setAdapter(adapterp16);
        p16.setSelection(15);
        p16.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp17 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp17.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p17.setAdapter(adapterp17);
        p17.setSelection(16);
        p17.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp18 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp18.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p18.setAdapter(adapterp18);
        p18.setSelection(17);
        p18.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp19 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp19.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p19.setAdapter(adapterp19);
        p19.setSelection(18);
        p19.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );

        ArrayAdapter<String> adapterp20 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, drivers);
        adapterp20.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        p20.setAdapter(adapterp20);
        p20.setSelection(19);
        p20.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                correctArrays();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
            }}
        );
    }

    public void correctArrays(){
        results.clear();
        results.add(p1.getSelectedItem().toString());
        results.add(p2.getSelectedItem().toString());
        results.add(p3.getSelectedItem().toString());
        results.add(p4.getSelectedItem().toString());
        results.add(p5.getSelectedItem().toString());
        results.add(p6.getSelectedItem().toString());
        results.add(p7.getSelectedItem().toString());
        results.add(p8.getSelectedItem().toString());
        results.add(p9.getSelectedItem().toString());
        results.add(p10.getSelectedItem().toString());
        results.add(p11.getSelectedItem().toString());
        results.add(p12.getSelectedItem().toString());
        results.add(p13.getSelectedItem().toString());
        results.add(p14.getSelectedItem().toString());
        results.add(p15.getSelectedItem().toString());
        results.add(p16.getSelectedItem().toString());
        results.add(p17.getSelectedItem().toString());
        results.add(p18.getSelectedItem().toString());
        results.add(p19.getSelectedItem().toString());
        results.add(p20.getSelectedItem().toString());
    }

    public void populateDrivers(){
        drivers.add("Verstappen");
        drivers.add("Perez");
        drivers.add("Leclerc");
        drivers.add("Sainz");
        drivers.add("Russell");
        drivers.add("Hamilton");
        drivers.add("Ocon");
        drivers.add("Alonso");
        drivers.add("Norris");
        drivers.add("Ricciardo");
        drivers.add("Bottas");
        drivers.add("Zhou");
        drivers.add("Vettel");
        drivers.add("Stroll");
        drivers.add("Magnussen");
        drivers.add("Schumacher");
        drivers.add("Gasly");
        drivers.add("Tsunoda");
        drivers.add("Latifi");
        drivers.add("Albon");
    }
}