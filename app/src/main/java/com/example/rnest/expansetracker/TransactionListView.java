package com.example.rnest.expansetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TransactionListView extends AppCompatActivity {

    private static final String TAG = "TransactionListView";
    private expanseTrackerDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_list_view);

        mDbHelper = new expanseTrackerDbHelper(this);
        openAndQueryDatabse();
        displayResult();
    }
    public void openAndQueryDatabse(){

    }

    public void displayResult(){

    }


}
