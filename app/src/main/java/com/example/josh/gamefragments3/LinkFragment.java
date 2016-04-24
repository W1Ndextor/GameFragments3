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
public class LinkFragment extends Fragment {

    Button bnT1;
    boolean statusUno = false;

    public LinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_link_layout,
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


        bnT1 = (Button) getView().findViewById(R.id.bnT1);



        bnT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


                if (statusUno = true) {

                    QLFragment qlFrag1 = new QLFragment();
                    fragmentTransaction.add(R.id.fragment_container, qlFrag1);
                    fragmentTransaction.addToBackStack(null);
                    //fragmentTransaction.add(R.id.fragment_container, mFrag1);
                    fragmentTransaction.commit();
                    //bn1.setText("Link");
                    statusUno = true;

                }


            }
        });

    }
}
