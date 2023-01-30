package com.google.mlkit.vision.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;




import java.util.ArrayList;

public class LearnableExerciseList extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnable_exercise_list);

        int[] imageId = {R.drawable.pushupicon,R.drawable.squaticon,R.drawable.bicepsicon,R.drawable.plankicon,
                R.drawable.crunchesicon};
        String[] name = {"PushUps","Squats","BicepsCurl","Plank","Crunches"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            User user = new User(name[i],imageId[i]);
            userArrayList.add(user);

        }


        ListAdapter listAdapter = new ListAdapter(LearnableExerciseList.this,userArrayList);
        ListView c = (ListView)findViewById(R.id.listview);

        c.setAdapter(listAdapter);
        c.setClickable(true);
        c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(LearnableExerciseList.this,UserActivity.class);
                i.putExtra("name",name[position]);
                startActivity(i);

            }
        });

    }
}