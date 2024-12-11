package com.example.navigationdrawerviewsactivity4b.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private final MutableLiveData<String> _text = new MutableLiveData<>();

    public SlideshowViewModel() {
        _text.setValue("This is slideshow Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
