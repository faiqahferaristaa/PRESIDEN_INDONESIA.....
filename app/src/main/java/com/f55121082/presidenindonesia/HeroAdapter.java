package com.f55121082.presidenindonesia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroAdapter extends BaseAdapter {

    private final Context context;
    private ArrayList<Tokoh> heroes;

    void setHeroes(ArrayList<Tokoh> heroes) {
        this.heroes = heroes;
    }

    HeroAdapter(Context context) {
        this.context = context;
        heroes = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return heroes.size();
    }

    @Override
    public Object getItem(int i) {
        return heroes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_tokoh, viewGroup, false);
        }

        ViewHolder viewHolder = new ViewHolder(view);
        Tokoh tokoh = (Tokoh) getItem(i);
        viewHolder.bind(tokoh);
        return view;
    }

    private class ViewHolder {
        private TextView txtName;
        private ImageView imagePhoto;

        ViewHolder(View view) {
            txtName = view.findViewById(R.id.txt_name);
            imagePhoto = view.findViewById(R.id.img_photo);
        }

        void bind(Tokoh tokoh) {
            txtName.setText(tokoh.getName());
            imagePhoto.setImageResource(tokoh.getPhoto());
        }
    }
}
