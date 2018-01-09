package snapcare.snapcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ComingUp extends AppCompatActivity {

    List item = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coming_up);

        ListView cominguplist = (ListView) findViewById(R.id.coming_up_listview);
        item.add("Take medicine at 6:00 PM");
        item.add("Dinner at 6:30 PM");
        item.add("Wake up at 7:00 AM");
        item.add("Breakfast at 7:30 AM");
        item.add("Take medicine at 7:30 AM");
        item.add("Walk at 8:00 AM");
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        cominguplist.setAdapter(adapter);
    }
}
