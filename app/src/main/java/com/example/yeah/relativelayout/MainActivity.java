package com.example.yeah.relativelayout;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = (EditText) findViewById(R.id.name_txt);
    }
    public void showfr(View view) {
        FragmentManager f = getSupportFragmentManager();
        FragmentDiag FD = new FragmentDiag();
        Bundle B = new Bundle();
        B.putString("name",ed.getText().toString());
        FD.setArguments(B);
        FD.show(f, "name_fragment");
    }
}
