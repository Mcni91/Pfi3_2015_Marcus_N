package se.mah.assignment4;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment implements View.OnClickListener{


    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate (Bundle savedInstanceStart){
        super.onCreate(savedInstanceStart);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Planet planet = (Planet)getArguments().getSerializable("planet");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);

        ImageView i = (ImageView) view.findViewById(R.id.img_planet);
        i.setImageDrawable(planet.getIcon());

        TextView planetName = (TextView) view.findViewById(R.id.txt_planetName);
        planetName.setText(planet.getName());

        TextView planetInfo = (TextView) view.findViewById(R.id.txt_planetInfo);
        planetInfo.setText(planet.getInfo());

        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
