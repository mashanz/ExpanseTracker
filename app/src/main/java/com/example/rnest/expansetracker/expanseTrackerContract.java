package com.example.rnest.expansetracker;

import android.provider.BaseColumns;

/**
 * Created by RnEST on 10/18/2017.
 */

public class expanseTrackerContract {
    public static class Transaction implements BaseColumns{
        public static final String TABLE_NAME = "transaksi";
        public static final String COLUMN_NAME_AMOUNT = "jumlah";
        public static final String COLUMN_NAME_DESCRIPTION = "deskripsi";
    }
}
