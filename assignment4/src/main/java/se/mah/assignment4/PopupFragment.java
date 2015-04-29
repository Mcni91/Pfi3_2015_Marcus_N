package se.mah.assignment4;


import android.app.DialogFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PopupFragment extends DialogFragment implements View.OnClickListener {


    public PopupFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_popup, container, false);
        int style = DialogFragment.STYLE_NO_TITLE, theme = 0;
        setStyle(style, theme);

        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        TextView name = (TextView) view.findViewById(R.id.txt_popup_name);
        TextView text = (TextView) view.findViewById(R.id.txt_popup_text);
        ImageView image = (ImageView) view.findViewById(R.id.img_popup);

        view.setOnClickListener(this);
        name.setOnClickListener(this);
        text.setOnClickListener(this);
        image.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v){
        PopupFragment.this.dismiss();
    }

}
