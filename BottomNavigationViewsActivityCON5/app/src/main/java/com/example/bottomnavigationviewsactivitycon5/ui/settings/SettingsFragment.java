package com.example.bottomnavigationviewsactivitycon5.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.bottomnavigationviewsactivitycon5.databinding.FragmentSettingsBinding;
import com.example.bottomnavigationviewsactivitycon5.ui.settings.SettingsViewModel;

public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;

    // Este método es solo válido entre onCreateView y onDestroyView
    private FragmentSettingsBinding getBinding() {
        return binding;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        SettingsViewModel settingsViewModel =
        new ViewModelProvider(this).get(SettingsViewModel.class);

        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView textView = binding.textSettings;
        settingsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
