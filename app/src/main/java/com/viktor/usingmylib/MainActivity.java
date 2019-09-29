package com.viktor.usingmylib;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.viktor.rtable.RecyclerViewTable;
import com.viktor.rtable.components.ColumnHeader;
import com.viktor.rtable.events.OnRowClicked;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerViewTable table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        table = findViewById(R.id.grid_recycler);
        table.configure(new ColumnHeader[]{
                new ColumnHeader(100, "Id"),
                new ColumnHeader(300, "Name")
        }, setupList(), MyBean.class);
    }

    private List<Object> setupList() {
        return (List) Arrays.asList(
                new MyBean("1", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("2", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("3", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("4", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("5", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("6", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("7", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("8", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("9", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("10", "Viktor SecondName ThirdName Last Name Last Name Name"),
                new MyBean("11", "Viktor SecondName ThirdName Last Name Last Name Name")
        );
    }

}
