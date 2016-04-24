package com.example.josh.gamefragments3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean status1 = false;
    boolean status2 = false;
    boolean status3 = false;

    Button bn1;
    Button bn2;
    Button bn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn1 = (Button)findViewById(R.id.bn1);
        bn2 =(Button)findViewById(R.id.bn2);
        bn3 =(Button)findViewById(R.id.bn3);


        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(status1=true){

                    MarioFragment mFrag1 = new MarioFragment();
                    fragmentTransaction.add(R.id.fragment_container, mFrag1);
                    fragmentTransaction.addToBackStack(null);
                    //fragmentTransaction.add(R.id.fragment_container, mFrag1);
                    fragmentTransaction.commit();
                    //bn1.setText("Link");
                    status1 = true;

                }


            }
        });

        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(status2=true){

                    LinkFragment lFrag1 = new LinkFragment();
                    fragmentTransaction.add(R.id.fragment_container, lFrag1);
                    fragmentTransaction.addToBackStack(null);
                    //fragmentTransaction.add(R.id.fragment_container, mFrag1);
                    fragmentTransaction.commit();
                    //bn1.setText("Link");
                    status1 = true;

                }


            }
        });


        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if(status3=true){

                    KirbyFragment kFrag1 = new KirbyFragment();
                    fragmentTransaction.add(R.id.fragment_container, kFrag1);
                    fragmentTransaction.addToBackStack(null);
                    //fragmentTransaction.add(R.id.fragment_container, mFrag1);
                    fragmentTransaction.commit();
                    //bn1.setText("Link");
                    status1 = true;

                }


            }
        });


    }

    // @Override
    //public boolean onCreateOptionsMenu(Menu menu) {
    //  getMenuInflater().inflate(R.menu. menu);
    // return true;
    //}

    //@Override
    //public boolean onOptionsItemSelected(MenuItem item) {
    //   int id = item.getItemId();
    //}
}