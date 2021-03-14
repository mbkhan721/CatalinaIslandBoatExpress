package com.example.catalinaislandboatexpress;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double costPerTicket = 19.99;
    int numberOfTickets;
    double totalCost;
    String destination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets = (EditText)findViewById(R.id.txtTickets);
        final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        Button cost = (Button)findViewById(R.id.btnCalculate);

        cost.setOnClickListener(new View.OnClickListener() {

            final TextView result = ((TextView)findViewById(R.id.txtResults));

            @Override
            public void onClick(View v) {
                numberOfTickets = Integer.parseInt(tickets.getText().toString());
                totalCost = costPerTicket * numberOfTickets;
                DecimalFormat currency = new DecimalFormat("$###,###.##");
                destination = group.getSelectedItem().toString();
                result.setText("Total cost " + destination + " is " + currency.format(totalCost));

            }
        });
    }
}