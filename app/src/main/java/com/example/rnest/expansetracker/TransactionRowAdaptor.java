package com.example.rnest.expansetracker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RnEST on 10/18/2017.
 */

public class TransactionRowAdaptor extends ArrayAdapter<TransactionRow>{
    public TransactionRowAdaptor(@NonNull Context context,
                                 @NonNull List<TransactionRow> objects){
        super(context, R.layout.transaction_item, R.id.txt_description, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View converView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View rowView = inflater.inflate(R.layout.transaction_item, parent, false);
        TextView descriptionView = (TextView) rowView.findViewById(R.id.txt_description);
        TextView amountView = (TextView) rowView.findViewById(R.id.txt_amount);

        final TransactionRow transactionRow = getItem(position);
        descriptionView.setText(transactionRow.getDescription());
        amountView.setText("RP");
        return rowView;
    }
}
