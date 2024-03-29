package sg.edu.rp.c346.todolistexercise1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ToDoItems> {
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItems> ToDoList;

    public CustomAdapter(Context context , int resource, ArrayList<ToDoItems> objects){
        super(context, resource , objects);

        parent_context = context;
        layout_id = resource;
        ToDoList = objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvTask = rowView.findViewById(R.id.textViewTask);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        // Obtain the Android Version information based on the position
        ToDoItems currentVersion = ToDoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTask.setText(currentVersion.getTasks());
        tvDate.setText(currentVersion.getDateString());

        return rowView;
    }
}
