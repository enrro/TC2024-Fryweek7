package com.example.edgar.fryweek7;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by edgar on 3/03/17.
 */

public class StudentAdapter extends BaseAdapter{

    private ArrayList<Student> dataSource;
    private Activity activity;

    public StudentAdapter(ArrayList<Student> dataSource, Activity activity){
        this.dataSource = dataSource;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
