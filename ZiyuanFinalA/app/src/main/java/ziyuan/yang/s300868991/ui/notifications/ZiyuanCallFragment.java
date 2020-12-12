package ziyuan.yang.s300868991.ui.notifications;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import ziyuan.yang.s300868991.R;

public class ZiyuanCallFragment extends Fragment {

    private ZiyuanCallViewModel ziyuanCallViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ziyuanCallViewModel =
                ViewModelProviders.of(this).get(ZiyuanCallViewModel.class);
        final View root = inflater.inflate(R.layout.ziyuan_callfragment, container, false);
        final TextView textView = root.findViewById(R.id.ziy_txt5);
        ziyuanCallViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);


              final EditText edittext1=root.findViewById(R.id.ziy_edittext);
              Button button1=root.findViewById(R.id.ziy_button3);
//Performing action on button click
                button1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View arg0) {
                        String number=edittext1.getText().toString();
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel: "+number));
                        startActivity(callIntent);
                    }
                });
            }


        });
        return root;
    }
}