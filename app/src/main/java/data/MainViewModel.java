package data;

import androidx.lifecycle.MutableLiveData;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import ui.MainActivity;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String> editString = new MutableLiveData<>();

    public MutableLiveData<Boolean> isSelected = new MutableLiveData<>(false);
    //public Object isSelected;
    public MutableLiveData<String> iButton = new MutableLiveData<>();

    public void observe(MainActivity mainActivity, Observer<Boolean> booleanObserver) {
    }

}
