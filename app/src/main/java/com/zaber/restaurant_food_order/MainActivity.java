
package com.zaber.restaurant_food_order;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dec(View view) {
        TextView cups = findViewById(R.id.cups);
        int num;
        num = Integer.valueOf(cups.getText().toString());
        if (num > 0) {
            num -= 1;
            cups.setText("" + num);
        }
    }

    public void inc(View view) {
        TextView cups = findViewById(R.id.cups);
        int num;
        num = Integer.valueOf(cups.getText().toString());
        num += 1;
        cups.setText("" + num);
    }

    public void receipt(View view) {
        TextView cups = findViewById(R.id.cups);
        CheckBox whip = findViewById(R.id.whip);
        CheckBox choc = findViewById(R.id.choc);
        TextView output = findViewById(R.id.output);

        float rate = 4.00f;
        float num, bill;
        String quan;
        quan = cups.getText().toString();
        num = Float.valueOf(quan);

        String cream = "false", chocolate = "false";

        if (whip.isChecked()) {
            cream = "true";
            rate += 0.50f;
        }
        if (choc.isChecked()) {
            chocolate = "true";
            rate += 1.00f;
        }

        bill = rate * num;

        output.setText("Add whipped cream? " + cream +
                "\nAdd chocolate? " + chocolate +
                "\nQuantity: " + quan +
                "\nTotal: $" + bill +
                "\nThank you!");
    };


};