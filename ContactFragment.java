package com.example.android.madrid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ContactFragment extends Fragment {

    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_contact, container, false);

        final ArrayList<Event> madrid_contact = new ArrayList<>();
        madrid_contact.add(new Event(R.string.Flight1,R.string.Flight2, R.drawable.ic_flight_black_24dp));
        madrid_contact.add(new Event(R.string.Train1,R.string.Train2, R.drawable.ic_directions_subway_black_24dp));
        madrid_contact.add(new Event(R.string.Bus1,R.string.Bus2, R.drawable.ic_directions_bus_black_24dp));


        EventAdapter ToDoAdapter = new EventAdapter(getActivity(),madrid_contact, R.color.tan_background);
        ListView listPhrases = (ListView) rootView.findViewById(R.id.contact);
        listPhrases.setAdapter(ToDoAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
