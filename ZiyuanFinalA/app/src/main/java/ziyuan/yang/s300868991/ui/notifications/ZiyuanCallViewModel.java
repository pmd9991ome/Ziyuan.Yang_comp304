package ziyuan.yang.s300868991.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ZiyuanCallViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ZiyuanCallViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}