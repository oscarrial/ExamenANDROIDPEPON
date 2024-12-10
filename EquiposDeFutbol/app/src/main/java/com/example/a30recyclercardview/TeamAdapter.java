package com.example.a30recyclercardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {

    private List<Team> teams;
    private OnTeamClickListener listener;

    public interface OnTeamClickListener {
        void onTeamClick(Team team);
    }

    public TeamAdapter(List<Team> teams, OnTeamClickListener listener) {
        this.teams = teams;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.bind(team, listener);
    }

    @Override
    public int getItemCount() {
        return teams.size();
    }

    static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView name, city, country, year;
        ImageView logo;

        public TeamViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.teamName);
            city = itemView.findViewById(R.id.teamCity);
            country = itemView.findViewById(R.id.teamCountry);
            year = itemView.findViewById(R.id.teamYear);
            logo = itemView.findViewById(R.id.teamLogo);
        }

        public void bind(Team team, OnTeamClickListener listener) {
            name.setText(team.getName());
            city.setText(team.getCity());
            country.setText(team.getCountry());
            year.setText(String.valueOf(team.getYear()));
            logo.setImageResource(team.getLogoResId());

            itemView.setOnClickListener(v -> listener.onTeamClick(team));
        }
    }
}
