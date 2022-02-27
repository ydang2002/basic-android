package com.nhuy.fragmentexample;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BacskstackActivity extends AppCompatActivity {



    private Button btnFrag;



    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_bacskstack);

        btnFrag = (Button) findViewById(R.id.btn_replace_fragment);

        btnFrag.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                replaceFragmentContent(new Fragment2());

                Log.e("Replaced fragment", "2");

            }

        });



        initFragment();

    }



    private void initFragment() {

        Fragment1 firstFragment = new Fragment1();

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();

        ft.replace(R.id.container_body, firstFragment);

        ft.commit();

    }



    protected void replaceFragmentContent(Fragment2 fragment) {

        if (fragment != null) {

            FragmentManager fmgr = getSupportFragmentManager();

            FragmentTransaction ft = fmgr.beginTransaction();

            ft.replace(R.id.container_body, fragment);

            ft.commit();

        }

    }

}