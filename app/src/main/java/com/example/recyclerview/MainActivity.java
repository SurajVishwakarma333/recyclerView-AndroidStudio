package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();
    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModelClass(R.drawable.logo,"Rahul","11:24pm","how are u?","_____________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Swapnil","7:00pm","wassup!","________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Riya","5:12pm","metting today?","______________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Priyanka","2:00am","Lets go!!!?","___________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"nitesh","3:45pm","heyy suraj","__________________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Snehal","12:21pm","had dinner ?","__________________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Shailesh","9:36am","good morning!","__________________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Ratan","1:53pm","hiii","__________________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Sujata","5:21am","bye","__________________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Raushan","5:21am","hello bro","__________________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Ashish","3:21am","ok","__________________________________________________________________________________________"));
        userList.add(new ModelClass(R.drawable.logo,"Savan","1:21pm","lol","__________________________________________________________________________________________"));
    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
/*
STEPS :-
1. For working with recyclerView properly.,firstly we have to Add two dependencies.
    file->project Structure->dependencies->library dependencies->module 'app'
    1.search recyclerview = androidx.recyclerview
    2.search cardview = androidx.cardview

2. add recycleerview in .xml file

3. create new resource file
    layout->new->layout resource file
    give any name here i given item_design
    replace default contraintlayout into relativelayout from item_design.xml
    //This all come inside the new created relativelayout
    1. Add one more new relativelayout in item_design.xml
    2. create CardView
        inside the cardview add imageview
    3. add 4 textview//

4. create a new java class in .java file
   com.example.recyclerview->new -> java class
   give name here i given name = ModelClass

5. create a another new java class in .java file
   com.example.recyclerview->new -> java class
   give name here i given name = Adapter
 */