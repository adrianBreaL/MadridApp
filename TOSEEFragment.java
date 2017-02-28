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

import static android.R.attr.y;

public class TOSEEFragment extends Fragment {
    public TOSEEFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_wordlist, container, false);

        final ArrayList<Event> madrid_tosee = new ArrayList<>();
        madrid_tosee.add(new Event(R.string.Retiro1,R.string.Retiro2, R.drawable.retiro));
        madrid_tosee.add(new Event(R.string.GranVia1,R.string.GranVia2, R.drawable.granvia));
        madrid_tosee.add(new Event(R.string.Catedral1,R.string.Catedral2, R.drawable.catedral));
        madrid_tosee.add(new Event(R.string.Cibeles1,R.string.Cibeles2, R.drawable.cibeles));
        madrid_tosee.add(new Event(R.string.Sol1,R.string.Sol2, R.drawable.sol));

        EventAdapter ToSeeAdapter = new EventAdapter(getActivity(),madrid_tosee, R.color.category_tosee);
        ListView listEvents = (ListView) rootView.findViewById(R.id.list);
        listEvents.setAdapter(ToSeeAdapter);

        //      When click on item pop ups an image
        listEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //                Get the whole item from arraylist and take just the image
                Event item = madrid_tosee.get(i);
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
