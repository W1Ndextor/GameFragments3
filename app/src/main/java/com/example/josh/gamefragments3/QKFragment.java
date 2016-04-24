package com.example.josh.gamefragments3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class QKFragment extends Fragment {

    Button bnB3;
    boolean statusTrois;

    public QKFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_qk_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        bnB3 = (Button) getView().findViewById(R.id.bnB3);



        bnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


                if (statusTrois = true) {

                    KirbyFragment kFrag2 = new KirbyFragment();
                    fragmentTransaction.add(R.id.fragment_container, kFrag2);
                    fragmentTransaction.addToBackStack(null);
                    //fragmentTransaction.add(R.id.fragment_container, mFrag1);
                    fragmentTransaction.commit();
                    //bn1.setText("Link");
                    statusTrois = true;

                }


            }
        });

    }

}


