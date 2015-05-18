package com.example.jason.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Today - Sunny - 88/65",
                "Tomorrow - Rain - 45/34",
                "Weds - Sunny - 23/11",
                "Thurs - Cloudy - 98/12",
                "Fri - Rain - 56/23",
                "Sat - Sunny - 76/43",
                "Sun - Foggy - 65/45",
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

        ArrayAdapter<String> listviewForecastAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weekForecast
        );

        ListView lv = (ListView) rootView.findViewById(R.id.listview_forecast);
        lv.setAdapter((listviewForecastAdapter));

        return rootView;
    }
}
