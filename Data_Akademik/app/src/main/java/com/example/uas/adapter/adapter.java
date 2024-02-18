package com.example.uas.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.uas.R;
import com.example.uas.model.dataDosenModel;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.Holder> {
    private ArrayList<dataDosenModel> dataModel;
    private Activity activity;

    public adapter(Activity activity, ArrayList<dataDosenModel> dataModel)
        this.dataModel = dataModel;
        this.activity = activity;
    @NonNull
    @Override
    public adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapterdata,parent,false);
        Holder holder= new Holder(v);
        return holder
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.Holder holder, int position) {
        dataDosenModel model=dataModel.get(position);
        

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Holder {
    }
}
