package com.tutorialsface.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.android_project_16_ecommerce_app.MainActivity;
import com.example.android_project_16_ecommerce_app.R;

public class ProductsListFragment extends Fragment {
    private ListView listview;
    MainActivity mainActivity;
    private String productCategory;

    ProgressDialog progessDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivity = (MainActivity) getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater
                .inflate(R.layout.productlist, container, false);
        productCategory = mainActivity.getProducts_category();

        listview = (ListView) rootView.findViewById(R.id.products_listview);

        mainActivity.getSupportActionBar().setTitle(productCategory);
        // selecting single ListView item
        ListView lv = listview;
        // listening to single listitem click
        lv.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
            }
        });
        return rootView;
    }

    private boolean isProductlistRetrieved = false;

    public boolean isProductlistRetrieved() {
        return isProductlistRetrieved;
    }

    public void setProductlistRetrieved(boolean isProductlistRetrieved) {
        this.isProductlistRetrieved = isProductlistRetrieved;
    }

}