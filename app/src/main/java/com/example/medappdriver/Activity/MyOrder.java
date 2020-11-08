package com.example.medappdriver.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medappdriver.Adapter.AdapterMyOrder;
import com.example.medappdriver.Adapter.AdapterRequestDet;
import com.example.medappdriver.Model.ModelMyOrder;
import com.example.medappdriver.Model.ModelRequest;
import com.example.medappdriver.R;
import com.example.medappdriver.Utils.ToolbarClass;

import java.util.ArrayList;

public class MyOrder extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ModelMyOrder> arrayList;
    AdapterMyOrder adapterMyOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        init();
    }
    private void init() {
        recycler = findViewById(R.id.recycler);
        arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ModelMyOrder item = new ModelMyOrder();
            item.setId(i+"");
            arrayList.add(item);
        }
        adapterMyOrder = new AdapterMyOrder(this,arrayList);
        recycler.setAdapter(adapterMyOrder);
    }
}