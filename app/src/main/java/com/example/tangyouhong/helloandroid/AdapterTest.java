package com.example.tangyouhong.helloandroid;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tangyouhong on 3/25/16.
 */
public class AdapterTest extends BaseAdapter {
    ArrayList<Person> personList=new ArrayList<Person>();

    @Override
    public int getCount() {
        return personList.size();
    }

    @Override
    public Object getItem(int position) {
        return personList.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = parent.inflate(parent.getContext(), R.layout.listview_test,null);
        Person person=personList.get(position);
        TextView biaoti = (TextView) view.findViewById(R.id.biaoti);
        biaoti.setText(person.getBiaoti());
        TextView data = (TextView) view.findViewById(R.id.data);
        data.setText(person.getData());
        TextView miaoshu = (TextView) view.findViewById(R.id.miaoshu);
        miaoshu.setText(person.getMiaoshu());
        TextView time = (TextView) view.findViewById(R.id.time);
        time.setText(person.getTime());
        return view;
    }
    public void setlist(ArrayList<Person> list) {
        this.personList=list;
    }
}
