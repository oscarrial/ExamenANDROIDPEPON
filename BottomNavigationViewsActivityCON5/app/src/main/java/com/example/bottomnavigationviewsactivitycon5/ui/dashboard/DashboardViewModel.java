package com.example.bottomnavigationviewsactivitycon5.ui.dashboard;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> _text = new MutableLiveData<>();

    public DashboardViewModel() {
        _text.setValue("This is dashboard Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
