package com.firman.makersinstitute.milkordering;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantityOfMilk = 0;
    TextView quantityTextView;
    int totalPriceOfOrderMilk = 0;
    final int priceOfMilk = 5;
    TextView totalPriceTextView;
    Button resetButton;;
    int milkPrice = 5;
    //int totalPrice = calculateTotalPrice(numberOfMilk, milkPrice);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantityTextView = (TextView) findViewById(R.id.quantityMilkTextView);
        totalPriceTextView = (TextView) findViewById(R.id.priceOrderMilkTextView);
        resetButton = (Button) findViewById(R.id.btnReset);
    }

    public void incrementOrder(View view) {
        if (quantityOfMilk > 20) {

            Log.v("incrementOrder", "" + quantityOfMilk);
        } else {
            Log.d("incrementOrder", "quantityLebihdari20");
            //increment quanitity of order milk
            quantityOfMilk += 1;

            quantityTextView.setText("" + quantityOfMilk);
        }

    }

    public void decrementOrder(View view) {
        // decrement quantity
        quantityOfMilk -= 1;
        quantityOfMilk = 0;
        quantityTextView.setText("" + quantityOfMilk);
        if (quantityOfMilk < 20) {
            Log.v("decrementOrder", "" + quantityOfMilk);
        } else {
            Log.d("decrementOrder", "" + quantityOfMilk);
        }
    }


    public void showTotalPrice(View view) {
        displayOrderSummary();
    }

    public void showReset(View v) {
        quantityTextView.setText("0");
        totalPriceTextView.setText("0");
    }


    public int calculateTotalPrice(int quantityOfMilk) {

        return quantityOfMilk * milkPrice ;
    }

    public void displayOrderSummary() {
        String orderSummary = "\nName: Makers Guy";
        orderSummary += "\nQuantity: ";
        orderSummary += this.quantityOfMilk;
        orderSummary += "\nTotal:$";
        orderSummary += calculateTotalPrice(this.quantityOfMilk);
        orderSummary += "\nThank you";

        //TextView totalPriceTextView = (TextView) findViewById(R.id.total_price_text_view);
        totalPriceTextView.setText(orderSummary);

    }


}
