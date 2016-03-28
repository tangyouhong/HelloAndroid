package com.example.tangyouhong.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by tangyouhong on 3/25/16.
 */
public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_main);
        Button movie = (Button) findViewById(R.id.movie);

        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListView listview = (ListView) findViewById(R.id.list_view);
                AdapterTest adapterTest = new AdapterTest();
                    ArrayList<Person> list = new ArrayList<Person>();

                Person personList = new Person( "2015-01","斑马线",R.drawable.banma, "11:25", "晕");
                list.add(personList);
                Person personList1 = new Person("2015-12", "火苗",R.drawable.huomiao, "08:13", "一个奇妙的世界");
                list.add(personList1);
                Person personList2 = new Person("2015-12", "魔法",R.drawable.mofa, "15:10", "打打打打打打打");
                list.add(personList2);
                Person personList3 = new Person("2015-12", "松鼠",R.drawable.songshu, "12:15", "噼里啪啦噼里啪啦");
                list.add(personList3);
                Person personList4 = new Person("2015-12", "虾",R.drawable.xia, "14:25", "韩韩韩韩韩");
                list.add(personList4);
                adapterTest.setlist(list);
                listview.setAdapter(adapterTest);
            }
        });
    }
}
