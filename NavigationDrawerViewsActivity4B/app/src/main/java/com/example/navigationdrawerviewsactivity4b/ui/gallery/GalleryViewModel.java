package com.example.navigationdrawerviewsactivity4b.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> _text = new MutableLiveData<>();

    public GalleryViewModel() {
        _text.setValue("This is gallery Fragment");
    }

    public LiveData<String> getText() {
        return _text;
    }
}
