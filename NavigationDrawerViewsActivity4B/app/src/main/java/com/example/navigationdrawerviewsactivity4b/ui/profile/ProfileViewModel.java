package com.example.navigationdrawerviewsactivity4b.ui.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    private final MutableLiveData<String> _text = new MutableLiveData<>();

    public ProfileViewModel() {
        _text.setValue("This is profile Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
