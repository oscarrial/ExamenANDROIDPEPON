package com.example.navigationdrawerviewsactivity4b.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> _text = new MutableLiveData<>();

    public HomeViewModel() {
        _text.setValue("This is home Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
