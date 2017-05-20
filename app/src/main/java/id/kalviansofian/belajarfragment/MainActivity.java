package id.kalviansofian.belajarfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button addFragment, replaceFragement, removeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment = (Button) findViewById(R.id.addFragment);
        replaceFragement = (Button) findViewById(R.id.replaceFragment);
        removeFragment = (Button) findViewById(R.id.removeFragment);

        //set listener
        addFragment.setOnClickListener(this);
        replaceFragement.setOnClickListener(this);
        removeFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == addFragment) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.add(R.id.action_container,new ContohFragment1()).commit();  //dan tambahkan disini
        }

        if (view == replaceFragement) {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction transaction=fragmentManager.beginTransaction();
            transaction.replace(R.id.action_container,new ContohFragment2()).commit();
        }

        if (view == removeFragment) {
            LinearLayout linearLayout=(LinearLayout)findViewById(R.id.action_container);
            linearLayout.removeAllViews();
        }

    }
}
