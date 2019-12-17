package ke.ac.mtek2.ui.login;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ke.ac.mtek2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FrSettings extends Fragment {


    public FrSettings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fr_settings, container, false);
    }

}
