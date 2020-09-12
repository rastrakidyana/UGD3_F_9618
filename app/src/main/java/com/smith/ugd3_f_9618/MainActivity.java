package com.smith.ugd3_f_9618;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.smith.ugd3_f_9618.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Mahasiswa> ListMahasiswa;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListMahasiswa = new DaftarMahasiswa().MAHASISWA;
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.recyclerViewMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.recyclerViewMahasiswa.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(this, ListMahasiswa);
        mainBinding.recyclerViewMahasiswa.setAdapter(adapter);
    }
}