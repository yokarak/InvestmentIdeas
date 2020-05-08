package com.example.investmentideas;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.ArrayList;

public class CompanyListTask extends AsyncTask<StockDatasource, Integer, ArrayList<Company>> {

    private CompanyArrayAdapter adapter;
    private ArrayList<Company> companies;

    public CompanyListTask(CompanyArrayAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    protected ArrayList<Company> doInBackground(StockDatasource... stockDatasources)        {
        try {
            companies = stockDatasources[0].getCompanyList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return companies;
    }

    @Override
    protected void onPostExecute(ArrayList<Company> companies) {
        adapter.addAll(companies);
    }
}
