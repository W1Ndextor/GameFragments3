package com.example.josh.gamefragments3;


import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MarioFragment extends Fragment {

    Button bnT2;

    public MarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_mario_layout,
                container, false);

        return view ;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        bnT2 = (Button) getView().findViewById(R.id.bnT2);

        bnT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                    QMFragment qmFrag1 = new QMFragment();
                    fragmentTransaction.add(R.id.fragment_container, qmFrag1);
                    fragmentTransaction.addToBackStack(null);

                    fragmentTransaction.commit();

            }
        });

    }
}
