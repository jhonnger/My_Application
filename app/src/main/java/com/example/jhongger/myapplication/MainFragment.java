package com.example.jhongger.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jhongger on 04/03/2015.
 */
public class MainFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    public void mostrarDetalle(String texto) {
        TextView txtDetalle =
                (TextView)getView().findViewById(R.id.section_label);

        txtDetalle.setText(texto);
    }
}
