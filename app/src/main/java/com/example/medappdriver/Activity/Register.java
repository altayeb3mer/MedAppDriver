package com.example.medappdriver.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.medappdriver.R;
import com.example.medappdriver.Utils.ToolbarClass;

public class Register extends ToolbarClass {

    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(R.layout.activity_register, "تسجيل جديد");
    }
}