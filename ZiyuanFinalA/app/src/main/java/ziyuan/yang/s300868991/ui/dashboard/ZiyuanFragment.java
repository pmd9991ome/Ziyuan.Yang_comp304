package ziyuan.yang.s300868991.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import ziyuan.yang.s300868991.R;

public class ZiyuanFragment extends Fragment {

    private ZiyuanViewModel ziyuanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, final Bundle savedInstanceState) {
        ziyuanViewModel =
                ViewModelProviders.of(this).get(ZiyuanViewModel.class);
        final View root = inflater.inflate(R.layout.ziyuan_fragment, container, false);
        final TextView textView = root.findViewById(R.id.ziyuan_txt1);
        ziyuanViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

                Button button1=root.findViewById(R.id.ziy_button1);



            }
        });
        return root;



    }
}