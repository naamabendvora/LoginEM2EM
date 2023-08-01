package com.naama.loginem2em.ui.lib;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LibViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LibViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Library fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}