package com.bdsimtoolkitmdashikulislam.bdsimtoolkit;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GpFnfMenu extends AppCompatActivity implements View.OnClickListener {
    private Button _addFnf,_checkFnf,_changeFnf,_deleteFnf,_addSpecialFnf,_changeSpecialFnf;
    final Context context = this;
    final Dialog dialog = new Dialog(context);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gp_fnf_menu);

        _addFnf = findViewById(R.id.addFnf);
        _checkFnf = findViewById(R.id.checkFnf);
        _changeFnf = findViewById(R.id.changeFnf);
        _deleteFnf = findViewById(R.id.deleteFnf);
        _addSpecialFnf = findViewById(R.id.addSpecialFnf);
        _changeSpecialFnf = findViewById(R.id.changeSpecialFnf);


        _addFnf.setOnClickListener(this);
        _checkFnf.setOnClickListener(this);
        _changeFnf.setOnClickListener(this);
        _deleteFnf.setOnClickListener(this);
        _addSpecialFnf.setOnClickListener(this);
        _changeSpecialFnf.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){

        }
    }
}

