package com.example.navigationdrawerviewsactivity4b.ui.settings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsViewModel extends ViewModel {

    private final MutableLiveData<String> _text = new MutableLiveData<>();

    public SettingsViewModel() {
        _text.setValue("This is settings Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
