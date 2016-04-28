package com.example.yeah.relativelayout;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by yeah on 4/28/2016.
 */
public class FragmentDiag extends DialogFragment {
    Button bt;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup viewGroup,Bundle bundle){
         View v = inflater.inflate(R.layout.alarm, viewGroup, false);
        return v;
    }
    @Override
    public void onViewCreated(View v,Bundle bundle){
        bt = (Button) v.findViewById(R.id.bt);
        Bundle b = getArguments();
        bt.setText("your name is  "+b.getString("name"));
    }
}
