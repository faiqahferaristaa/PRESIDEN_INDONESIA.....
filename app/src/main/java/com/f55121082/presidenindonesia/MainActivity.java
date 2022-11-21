package com.f55121082.presidenindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] dataName;
    private TypedArray dataPhoto;
    private HeroAdapter adapter;
    private ArrayList<Tokoh> heroes;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new HeroAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);
        prepare();
        addItem();

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appBar_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new BiodataFragment(), "Biodata");
        adapter.AddFragment(new BiografiFragment(), "Biografi");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                if (position == 0) {
                    //clicked Asriani
                    startActivity(new Intent(MainActivity.this, Soekarno.class));
                } else if (position == 1) {
                    //clicked Ahmad Dahlan
                    startActivity(new Intent(MainActivity.this, Soeharto.class));
                } else if (position == 2) {
                    //clicked Ahmad Yani
                    startActivity(new Intent(MainActivity.this, Habbie.class));
                } else if (position == 3) {
                    //clicked Sutomo
                    startActivity(new Intent(MainActivity.this, Gusdur.class));
                } else if (position == 4) {
                    //clicked Gatot Soebroto
                    startActivity(new Intent(MainActivity.this, Megawati.class));
                } else if (position == 5) {
                    //clicked Ki Hadjar Dewantara
                    startActivity(new Intent(MainActivity.this, sby.class));
                }else {
                    startActivity(new Intent(MainActivity.this, Jokowi.class));

                }
            }
        });
    }


    private void prepare() {
        dataName =
                getResources().getStringArray(R.array.data_name);
        dataPhoto =
                getResources().obtainTypedArray(R.array.data_photo);
    }

    private void addItem() {
        heroes = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            Tokoh tokoh = new Tokoh();
            tokoh.setPhoto(dataPhoto.getResourceId(i, -1));
            tokoh.setName(dataName[i]);
            heroes.add(tokoh);
        }
        adapter.setHeroes(heroes);
    }

}

