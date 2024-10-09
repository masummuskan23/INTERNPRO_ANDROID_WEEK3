package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<item> items = new ArrayList<item>();
        items.add(new item("tu jaane na","A r rehman",R.drawable.music));
        items.add(new item("kaise batye","arjit singh",R.drawable.music));
        items.add(new item("ek din kabhi","gajendra verma",R.drawable.music));
        items.add(new item("mere ho","A r rehman",R.drawable.music));
        items.add(new item("love me like you do","gajendra verma",R.drawable.music));
        items.add(new item("gulabi sari","arjit singh",R.drawable.music));
        items.add(new item("ek kahani","A r rehman",R.drawable.music));
        items.add(new item("tum hi ho","gajendra verma",R.drawable.music));
        items.add(new item("illuminati","arjit singh",R.drawable.music));
        items.add(new item("tu aake dekhle","A r rehman",R.drawable.music));
        items.add(new item("sajni","gajendra verma",R.drawable.music));
        items.add(new item("maari 2","arjit singh",R.drawable.music));
        items.add(new item("devara","A r rehman",R.drawable.music));
        items.add(new item("aaj ki raat","gajendra verma",R.drawable.music));
        items.add(new item("chudi paayal","arjit singh",R.drawable.music));
        items.add(new item("chuttamale","A r rehman",R.drawable.music));
        items.add(new item("tu jaane na","A r rehman",R.drawable.music));
        items.add(new item("kaise batye","arjit singh",R.drawable.music));
        items.add(new item("ek din kabhi","gajendra verma",R.drawable.music));
        items.add(new item("mere ho","A r rehman",R.drawable.music));
        items.add(new item("love me like you do","gajendra verma",R.drawable.music));
        items.add(new item("gulabi sari","arjit singh",R.drawable.music));
        items.add(new item("ek kahani","A r rehman",R.drawable.music));
        items.add(new item("tum hi ho","gajendra verma",R.drawable.music));
        items.add(new item("illuminati","arjit singh",R.drawable.music));
        items.add(new item("tu aake dekhle","A r rehman",R.drawable.music));
        items.add(new item("sajni","gajendra verma",R.drawable.music));
        items.add(new item("maari 2","arjit singh",R.drawable.music));
        items.add(new item("devara","A r rehman",R.drawable.music));
        items.add(new item("aaj ki raat","gajendra verma",R.drawable.music));
        items.add(new item("chudi paayal","arjit singh",R.drawable.music));
        items.add(new item("chuttamale","A r rehman",R.drawable.music));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}