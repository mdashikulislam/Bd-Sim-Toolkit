package com.bdsimtoolkitmdashikulislam.bdsimtoolkit;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BlFnfMenu extends AppCompatActivity  implements View.OnClickListener{
    private Button _addFnf,_checkFnf,_chnageFnf,_deleteFnf,_addSpecialFnf,_chnageSpecialFnf,_checkSpecialFnf,_deleteSpecialFnf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bl_fnf_menu);


        _addFnf = findViewById(R.id.addFnf);
        _checkFnf = findViewById(R.id.checkFnf);
        _chnageFnf = findViewById(R.id.changeFnf);
        _deleteFnf = findViewById(R.id.deleteFnf);
        _addSpecialFnf = findViewById(R.id.addSpecialFnf);
        _chnageSpecialFnf = findViewById(R.id.changeFnf);
        _checkSpecialFnf = findViewById(R.id.checkSpecialFnf);
        _deleteSpecialFnf = findViewById(R.id.deleteSpecialFnf);




        _addFnf.setOnClickListener(this);
        _checkFnf.setOnClickListener(this);
        _chnageFnf.setOnClickListener(this);
        _deleteFnf.setOnClickListener(this);
        _addSpecialFnf.setOnClickListener(this);
        _chnageSpecialFnf.setOnClickListener(this);
        _checkSpecialFnf.setOnClickListener(this);
        _deleteSpecialFnf.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.addFnf:i = new Intent(Intent.ACTION_DIAL);i.setData(Uri.parse("tel:*121*2*4#"));
               /* if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){

                }*/
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Select Your Banglalink Sim",Toast.LENGTH_SHORT).show();break;

        }
    }
}
