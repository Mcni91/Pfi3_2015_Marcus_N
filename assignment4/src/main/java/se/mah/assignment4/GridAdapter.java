package se.mah.assignment4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Marcus Nilsson on 2015-04-29.
 */
public class GridAdapter extends ArrayAdapter<Planet> {

    ArrayList<Planet> planets;
    private Context context;

    public GridAdapter(Context context_, ArrayList<Planet> planets_) {
        super(context_, 0, planets_);
        this.context = context_;
        this.planets = planets_;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Planet planet = planets.get(position);

        convertView = inflater.inflate(R.layout.grid_item, null);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);

        imageView.setImageDrawable(planet.getIcon());
        textView.setText(planet.getName());

        return convertView;
    }
}
