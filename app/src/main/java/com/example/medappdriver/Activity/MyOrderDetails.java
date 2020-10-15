package com.example.medappdriver.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medappdriver.Adapter.AdapterMyOrder;
import com.example.medappdriver.Adapter.AdapterMyOrderDet;
import com.example.medappdriver.Adapter.AdapterRequestDet;
import com.example.medappdriver.Model.ModelMyOrder;
import com.example.medappdriver.Model.ModelRequest;
import com.example.medappdriver.R;
import com.example.medappdriver.Utils.ToolbarClass;

import java.util.ArrayList;

public class MyOrderDetails extends ToolbarClass {

    RecyclerView recyclerView;
    AdapterMyOrderDet adapterRequestDet;
    ArrayList<ModelRequest> arrayList;

    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(R.layout.activity_my_order_details, "تفاصيل طلب");

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
        adapterRequestDet = new AdapterMyOrderDet(this,arrayList);
        recyclerView.setAdapter(adapterRequestDet);
    }
}