package com.example.a30recyclercardview;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ImageView selectedTeamLogo;
    private TextView selectedTeamName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        selectedTeamLogo = findViewById(R.id.selectedTeamLogo);
        selectedTeamName = findViewById(R.id.selectedTeamName);

        List<Team> teams = Arrays.asList(
                new Team("Barcelona", "Barcelona", "Spain", 1899, R.drawable.avatar_1),
                new Team("Real Madrid", "Madrid", "Spain", 1902, R.drawable.avatar_3),
                new Team("Manchester United", "Manchester", "England", 1878, R.drawable.avatar_4),
                new Team("Bayern Munich", "Munich", "Germany", 1900, R.drawable.avatar_3),
                new Team("Juventus", "Turin", "Italy", 1897, R.drawable.avatar_5)
        );

        TeamAdapter adapter = new TeamAdapter(teams, team -> {
            selectedTeamName.setText(team.getName());
            selectedTeamLogo.setImageResource(team.getLogoResId());
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
