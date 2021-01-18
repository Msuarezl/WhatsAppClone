package com.example.whatsappclone.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsappclone.R;
import com.example.whatsappclone.adapter.Adapterchatlist;
import com.example.whatsappclone.model.ChatList;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class ChatsFragment extends Fragment {
    public ChatsFragment() {
        // Required empty public constructor
    }
    private List<ChatList> list = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        getChatList();
        return view;
    }

    private void getChatList() {
        list.clear();
        list.add(new ChatList("1","Bryan Daniel","Hola","21/01/2021","https://t2.pb.ltmcdn.com/es/posts/3/0/1/como_saber_si_le_gustas_a_una_persona_por_whatsapp_5103_orig.jpg"));
        list.add(new ChatList("2","Juan Pueblo","Que Hubo","21/01/2021","https://concepto.de/wp-content/uploads/2018/08/persona-e1533759204552.jpg"));
        list.add(new ChatList("3","Nathaly Poveda","Holii","21/01/2021","https://www.caritas.org.mx/wp-content/uploads/2019/02/cualidades-persona-humanitaria.jpg"));
        list.add(new ChatList("1","Michael Vlad","Que onda pana","21/01/2021","https://es.calcuworld.com/wp-content/uploads/sites/2/2018/04/cuanto-pesa-la-cabeza-de-un-ser-humano.jpg"));
        list.add(new ChatList("2","Homero Simpson","Vamos donde Moe","21/01/2021","https://estaticos.muyinteresante.es/media/cache/680x_thumb/uploads/images/article/55365cd93787b2187a1f09b7/gen-simpson-p.jpg"));
        list.add(new ChatList("3","Millhouse","Que hay!!!","21/01/2021","https://es.web.img3.acsta.net/newsv7/16/12/01/12/46/400187.jpg"));
        recyclerView.setAdapter(new Adapterchatlist(list,getContext()));
    }
}