package com.example.rnest.expansetracker;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by RnEST on 10/18/2017.
 */

public class expanseTrackerDbHelper extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ExpanseTracker.db";

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + expanseTrackerContract.Transaction.TABLE_NAME + "(" +
                    " " + expanseTrackerContract.Transaction._ID + " INTEGER PRIMARY KEY," +
                    " " + expanseTrackerContract.Transaction.COLUMN_NAME_AMOUNT + " NUMERIC," +
                    " " + expanseTrackerContract.Transaction.COLUMN_NAME_DESCRIPTION + " TEXT )";

    private static final String SQL_DROP_TABLE =
            "DROP TABLE IF EXISTS " + expanseTrackerContract.Transaction.TABLE_NAME;

    public expanseTrackerDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DROP_TABLE);
        onCreate(sqLiteDatabase);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int OldVersion, int newVersion){
        onUpgrade(db, OldVersion, newVersion);
    }
}

