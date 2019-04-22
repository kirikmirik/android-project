package com.example.android.task3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnPeopleList = findViewById(R.id.button_people_list);
        btnPeopleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPeopleList();
            }
        });
    }



    public void openPeopleList(){
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }

}
