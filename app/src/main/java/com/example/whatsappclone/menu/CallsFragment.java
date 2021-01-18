package com.example.whatsappclone.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsappclone.R;
import com.example.whatsappclone.adapter.Adaptercalllist;
import com.example.whatsappclone.model.CallList;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class CallsFragment extends Fragment {



    public CallsFragment() {
        // Required empty public constructor
    }

    /**

     */
    // TODO: Rename and change types and number of parameters


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewcall);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<CallList> lists = new ArrayList<>();
        lists.add(new CallList("1","Bryan Daniel","17/01/2021 22:30","https://t2.pb.ltmcdn.com/es/posts/3/0/1/como_saber_si_le_gustas_a_una_persona_por_whatsapp_5103_orig.jpg","voice","in","accepted"));
        lists.add(new CallList("5","Homero Simpson","12/01/2021 18:40","https://estaticos.muyinteresante.es/media/cache/680x_thumb/uploads/images/article/55365cd93787b2187a1f09b7/gen-simpson-p.jpg","voice","in","declined"));
        lists.add(new CallList("3","Nathaly Poveda","12/01/2021 12:20","https://www.caritas.org.mx/wp-content/uploads/2019/02/cualidades-persona-humanitaria.jpg","video","out","accepted"));
        lists.add(new CallList("5","Homero Simpson","12/01/2021 18:40","https://estaticos.muyinteresante.es/media/cache/680x_thumb/uploads/images/article/55365cd93787b2187a1f09b7/gen-simpson-p.jpg","voice","in","declined"));
        lists.add(new CallList("3","Nathaly Poveda","12/01/2021 13:20","https://www.caritas.org.mx/wp-content/uploads/2019/02/cualidades-persona-humanitaria.jpg","video","out","accepted"));


        recyclerView.setAdapter(new Adaptercalllist(lists,getContext()));
        return view;
    }
}