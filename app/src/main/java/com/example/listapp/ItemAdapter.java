package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    //member of the class (istanzia il layout costruito)
    LayoutInflater mInflater;

    String[] items;
    String[] prices;
    String[] descriptions;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d) {
        items = i;
        prices = p;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    //definizione metodi necessari
    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // necessita di un layout e di una view (che mettiamo null)
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        // cerca nella view v
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);

        // ottieni i valori
        String name = items[i];
        String desc = descriptions[i];
        String cost = prices[i];

        // setta i valori
        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        priceTextView.setText(cost);

        return v;
    }
}
