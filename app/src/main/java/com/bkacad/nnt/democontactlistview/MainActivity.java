package com.bkacad.nnt.democontactlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khai báo list view
        lvContact = findViewById(R.id.lvContact);

        // Cần chuẩn bị dữ liệu
        List <Contact> data = new ArrayList<>();
        data.add(new Contact("Nguyen Van A","091818181","a@gmail.com"));
        data.add(new Contact("Nguyen Van B","091818182","b@gmail.com"));
        data.add(new Contact("Nguyen Van C","091818183","c@gmail.com"));
        data.add(new Contact("Nguyen Van D","091818184","d@gmail.com"));

        // Tao adapter
        MyAdapter myAdapter = new MyAdapter(this,data);

        // Set adapter cho listView
        lvContact.setAdapter(myAdapter);

    }
}