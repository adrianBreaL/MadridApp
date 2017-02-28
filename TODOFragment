package com.example.android.madrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;


import java.util.ArrayList;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class TODOFragment extends Fragment {

    private PopupWindow popup;
    private LayoutInflater layout;
    private RelativeLayout relinflate;

    public TODOFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        Selects the layout to inflate what comes next
        View rootView = inflater.inflate(R.layout.activity_wordlist, container, false);


//      Defines arraylist and fill it
        final ArrayList<Event> madrid_todo = new ArrayList<>();
        madrid_todo.add(new Event(R.string.PRetiro1,R.string.PRetiro2, R.drawable.retiroboat));
        madrid_todo.add(new Event(R.string.Brunch1,R.string.Brunch2, R.drawable.brunch));
        madrid_todo.add(new Event(R.string.Opera1,R.string.Opera2, R.drawable.opera));
        madrid_todo.add(new Event(R.string.Latina1,R.string.Latina2, R.drawable.latina));
        madrid_todo.add(new Event(R.string.Toledo1,R.string.Toledo2,R.drawable.toledo));

//      Defines adapter and wraps the list in it
        EventAdapter ToDoAdapter = new EventAdapter(getActivity(),madrid_todo, R.color.category_todo);
        ListView listEvents = (ListView) rootView.findViewById(R.id.list);
        listEvents.setAdapter(ToDoAdapter);

//      When click on item pop ups an image
        listEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Get the whole item from arraylist and take just the image
                Event item = madrid_todo.get(i);
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
