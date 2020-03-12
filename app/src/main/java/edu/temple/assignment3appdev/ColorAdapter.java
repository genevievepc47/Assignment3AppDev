package edu.temple.assignment3appdev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.graphics.Color;


//changing something
public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colors;

    public ColorAdapter(Context context,String[] colors) {
        super();
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        view = View.inflate(context, R.layout.row, null);
        final TextView textView = (TextView) view.findViewById(R.id.colorRow);
        textView.setText(colors[position]);

        textView.setBackgroundColor(Color.parseColor(colors[position]));
        return view;

    }
}
