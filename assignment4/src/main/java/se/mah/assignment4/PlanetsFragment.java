package se.mah.assignment4;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlanetsFragment extends Fragment implements AdapterView.OnItemClickListener {

    public static ArrayList<Planet> planets = new ArrayList<>();

    public PlanetsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        planets.clear();

        Drawable icon = getResources().getDrawable(R.drawable.mercury);
        planets.add(new Planet(getResources().getString(R.string.mercury_name), icon, getResources().getString(R.string.mercury_info)));

        icon = getResources().getDrawable(R.drawable.venus);
        planets.add(new Planet(getResources().getString(R.string.venus_name), icon, getResources().getString(R.string.venus_info)));

        icon = getResources().getDrawable(R.drawable.earth);
        planets.add(new Planet(getResources().getString(R.string.earth_name), icon, getResources().getString(R.string.earth_info)));

        icon = getResources().getDrawable(R.drawable.mars);
        planets.add(new Planet(getResources().getString(R.string.mars_name), icon, getResources().getString(R.string.mars_info)));

        icon = getResources().getDrawable(R.drawable.jupiter);
        planets.add(new Planet(getResources().getString(R.string.jupiter_name), icon, getResources().getString(R.string.jupiter_info)));

        icon = getResources().getDrawable(R.drawable.saturn);
        planets.add(new Planet(getResources().getString(R.string.saturn_name), icon, getResources().getString(R.string.saturn_info)));

        icon = getResources().getDrawable(R.drawable.uranus);
        planets.add(new Planet(getResources().getString(R.string.uranus_name), icon, getResources().getString(R.string.uranus_info)));

        icon = getResources().getDrawable(R.drawable.neptune);
        planets.add(new Planet(getResources().getString(R.string.neptune_name), icon, getResources().getString(R.string.neptune_info)));

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_planets, container, false);
        GridView gridview = (GridView) view.findViewById(R.id.gridView);

        gridview.setAdapter(new GridAdapter(getActivity(), planets));

        gridview.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v,
                            int position, long id) {
        Log.i("Planet click", "pos: " + position);

        InfoFragment fragment = new InfoFragment();

        Bundle bundle = new Bundle();
        bundle.putSerializable("planet",planets.get(position));
        fragment.setArguments(bundle);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();


    }


}
