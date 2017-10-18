package com.example.rnest.expansetracker;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private expanseTrackerDbHelper mDbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "make new mDbHelper");
        mDbHelper = new expanseTrackerDbHelper(this);
    }

    public void onCreateTransaction(View view){
        Log.i(TAG, "onCreateTransaction");

        Log.i(TAG, "Parse Amount");
        final Double amount = Double.parseDouble("123");

        Log.i(TAG, "Parse Description");
        final String description = "txt_description";

        Log.i(TAG, "SQLiteDatabase db = mDbHelper.getWritableDatabase()");
        final SQLiteDatabase db = mDbHelper.getWritableDatabase();

        Log.i(TAG, "ContentValues values = new ContentValues()");
        final ContentValues values = new ContentValues();

        Log.i(TAG, "putValue");
        values.put(expanseTrackerContract.Transaction.COLUMN_NAME_AMOUNT, amount);
        values.put(expanseTrackerContract.Transaction.COLUMN_NAME_DESCRIPTION,description);

        Log.i(TAG, "putValueToDatabase");
        final long newRowId = db.insert(expanseTrackerContract.Transaction.TABLE_NAME, null, values);

        Log.i(TAG, "Succes inser to database id: " + newRowId);
    }
    protected  void onDestroy(){
        Log.i(TAG, "onDestroy");
        mDbHelper.close();

        Log.i(TAG, "Destroyed");
        super.onDestroy();
    }

}
