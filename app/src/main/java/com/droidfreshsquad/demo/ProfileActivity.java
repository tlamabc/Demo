package com.droidfreshsquad.demo;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.droidfreshsquad.demo.Adapter.MyAdapter;
import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<ProfileItem> profiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_layout);

        recyclerView = findViewById(R.id.recyclerView);
        profiles = new ArrayList<>();


        myAdapter = new MyAdapter(profiles);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        addSampleData();
    }



    private void addSampleData() {
        ProfileItem profile1 = new ProfileItem("Cafe in Son Tra");
        profiles.add(profile1);
        ProfileItem profile2 = new ProfileItem("Good morning");
        profiles.add(profile2);



        myAdapter.notifyDataSetChanged();
    }
}

