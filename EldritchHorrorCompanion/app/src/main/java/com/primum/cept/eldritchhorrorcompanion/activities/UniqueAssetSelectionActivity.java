package com.primum.cept.eldritchhorrorcompanion.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.primum.cept.eldritchhorrorcompanion.R;
import com.primum.cept.eldritchhorrorcompanion.data.CardContract;

/**
 * Created by peter.marteen on 9/16/17.
 */

public class UniqueAssetSelectionActivity extends SelectionActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //TODO: Use fragments instead of separate layouts for these activities
        setContentView(R.layout.activity_uniqueasset_selection);

    }
    @Override
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.any:
                if (checked)
                    radioValue = null;
                break;
            case R.id.relic:
                if (checked)
                    radioValue = "relic";
                break;
            case R.id.tarot:
                if (checked)
                    radioValue = "tarot";
                break;
            case R.id.task:
                if (checked)
                    radioValue = "task";
                break;
        }
    }
    @Override
    public void displayRandomCard(View view){
        Intent intent = new Intent(this, DisplayCardActivity.class);
        String message = CardContract.CardEntry.UNIQUE_ASSET_TABLE_NAME;
        intent.putExtra(CardMenuActivity.CARD_TYPE, message);
        intent.putExtra(SUBCATEGORY, radioValue);
        //TODO: pass db to next activity
        startActivity(intent);
    }
}
