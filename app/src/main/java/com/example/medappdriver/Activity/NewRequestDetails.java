package com.example.medappdriver.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medappdriver.Adapter.AdapterRequestDet;
import com.example.medappdriver.Model.ModelRequest;
import com.example.medappdriver.R;
import com.example.medappdriver.Utils.ToolbarClass;

import java.util.ArrayList;

public class NewRequestDetails extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterRequestDet adapterRequestDet;
    ArrayList<ModelRequest> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_request_details);
        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.recycler);
        arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ModelRequest item = new ModelRequest();
            item.setId(i+"");
            arrayList.add(item);
        }
        adapterRequestDet = new AdapterRequestDet(this,arrayList);
        recyclerView.setAdapter(adapterRequestDet);
    }
}