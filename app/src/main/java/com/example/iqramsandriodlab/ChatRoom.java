package com.example.iqramsandriodlab;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ChatRoom extends AppCompatActivity {

    ActivityChatRoomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityChatRoomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recycleView.setAdapter(new RecyclerView.Adapter < MyRowHolder > ())

        class MyRowHolder extends RecyclerView.ViewHolder {
            public MyRowHolder(@NonNull View itemView) {
                super(itemView);
            }
        }

    }
}