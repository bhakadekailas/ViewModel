package bhakadekailas.viewmodeldemo;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private static final String TAG = MainActivityViewModel.class.getSimpleName();
    private String myRandomNumber;

    public String getNumber() {
        Log.e(TAG, "getNumber: ");
        if (myRandomNumber == null) {
            createNumber();
        }
        return myRandomNumber;
    }

    private void createNumber() {
        Log.e(TAG, "createNumber: ");
        Random random = new Random();
        myRandomNumber = "Random Number is = " + (random.nextInt(10 - 1) + 1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.e(TAG, "onCleared: ");
    }
}
