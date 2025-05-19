package com.example.recyclerviewexample;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.a,"Sujeet Kumar", "7209106002"));
        arrContacts.add(new ContactModel(R.drawable.b,"Amar Kumar", "9000000000"));
        arrContacts.add(new ContactModel(R.drawable.c,"Akash Kumar", "9000000002"));
        arrContacts.add(new ContactModel(R.drawable.d,"Aditya Kumar", "9000000001"));
        arrContacts.add(new ContactModel(R.drawable.e,"Gopal Kumar", "9000000003"));
        arrContacts.add(new ContactModel(R.drawable.f,"Saket Kumar", "9000000004"));
        arrContacts.add(new ContactModel(R.drawable.g,"Manoj Kumar", "9000000005"));
        arrContacts.add(new ContactModel(R.drawable.h,"Sushant Kumar", "9000000006"));
        arrContacts.add(new ContactModel(R.drawable.i,"Amit Kumar", "9000000007"));
        arrContacts.add(new ContactModel(R.drawable.j,"Ritesh Kumar", "9000000008"));
        arrContacts.add(new ContactModel(R.drawable.k,"Dev Kumar", "9000000009"));
        arrContacts.add(new ContactModel(R.drawable.l,"Suraj Kumar", "9000000010"));
        arrContacts.add(new ContactModel(R.drawable.m,"Aman Kumar", "9000000011"));
        arrContacts.add(new ContactModel(R.drawable.n,"Badal Kumar", "9000000012"));
        arrContacts.add(new ContactModel(R.drawable.o,"Nitish Kumar", "9000000013"));
        arrContacts.add(new ContactModel(R.drawable.p,"Shubham Kumar", "9000000014"));
        arrContacts.add(new ContactModel(R.drawable.q,"Abhijeet Kumar", "9000000015"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

    }
}