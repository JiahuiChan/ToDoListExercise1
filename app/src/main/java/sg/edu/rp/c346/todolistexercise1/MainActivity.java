package sg.edu.rp.c346.todolistexercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvItems;
    ArrayList<ToDoItems> itemsList;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.listViewToDo);

        itemsList = new ArrayList<ToDoItems>();

        Calendar d1 = Calendar.getInstance(); //Create a Calendar object with current date/time
        d1.set(2019,7,1);
        itemsList.add(new ToDoItems("MSA" , d1));

        Calendar d2 = Calendar.getInstance(); //Create a Calendar object with current date/time
        d2.set(2019,9,22);
        itemsList.add(new ToDoItems("Go for haircut" , d2));

        ca = new CustomAdapter(this, R.layout.row , itemsList);

        lvItems.setAdapter(ca);
    }
}
