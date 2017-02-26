package com.firman.makersinstitute.milkordering;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Firman on 12/8/2016.
 */

public class Config {

    TextView quantityTextView;
    TextView totalPriceTextView;
    Button resetButton;

    public TextView getQuantityTextView() {
        return quantityTextView;
    }

    public void setQuantityTextView(TextView quantityTextView) {
        this.quantityTextView = quantityTextView;
    }

    public TextView getTotalPriceTextView() {
        return totalPriceTextView;
    }

    public void setTotalPriceTextView(TextView totalPriceTextView) {
        this.totalPriceTextView = totalPriceTextView;
    }

    public Button getResetButton() {
        return resetButton;
    }

    public void setResetButton(Button resetButton) {
        this.resetButton = resetButton;
    }
}
