package com.example.android.madrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TOEATFragment extends Fragment {
    public TOEATFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_wordlist, container, false);

        final ArrayList<Event> madrid_toeat = new ArrayList<>();
        madrid_toeat.add(new Event(R.string.SMiguel1,R.string.SMiguel2, R.drawable.smiguel));
        madrid_toeat.add(new Event(R.string.SIlde1,R.string.SIlde2, R.drawable.silde));
        madrid_toeat.add(new Event(R.string.Thai1,R.string.Thai2, R.drawable.yatai));
        madrid_toeat.add(new Event(R.string.MJamon1,R.string.MJamon2, R.drawable.mjamon));
        madrid_toeat.add(new Event(R.string.Diverxo1,R.string.Diverxo2,R.drawable.diverxo));

        EventAdapter ToEatAdapter = new EventAdapter(getActivity(),madrid_toeat, R.color.category_toeat);
        ListView listEvents = (ListView) rootView.findViewById(R.id.list);
        listEvents.setAdapter(ToEatAdapter);

//      When click on item pop ups an image
        listEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //                Get the whole item from arraylist and take just the image
                Event item = madrid_toeat.get(i);
//                Generate the intent
                Intent intent = new Intent(getContext(), Pop.class);
                intent.putExtra("ItemImage", item.getmMadridImage());
                startActivity(intent);
            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
