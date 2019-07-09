package sg.edu.rp.c346.todolistexercise1;

import java.util.Calendar;

public class ToDoItems {

    private String tasks;
    private Calendar date;

    public ToDoItems(String tasks, Calendar date) {
        this.tasks = tasks;
        this.date = date;
    }

    public String getTasks() {

        return tasks;
    }

    public void setTasks(String tasks) {

        this.tasks = tasks;
    }

    public Calendar getDate() {

        return date;
    }

    public void setDate(Calendar date) {

        this.date = date;
    }


    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);
        return str;
    }
    @Override
    public String toString() {
        return "ToDoItems{" +
                "tasks='" + tasks + '\'' +
                ", date='" + getDateString() + '\'' +
                '}';
    }
}
