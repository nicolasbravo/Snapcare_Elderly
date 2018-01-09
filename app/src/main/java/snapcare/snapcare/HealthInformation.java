package snapcare.snapcare;

import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;

public class HealthInformation extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_information);

        ListView healthlist = (ListView) findViewById(R.id.health_listview);
        String[] item = new String[]{"Arthritis\n\t-20mg Humera with each meal", "Diabetes\n\t-20mL insulin every other day", "Supplements\n\t-Calcium supplement with each meal\n\t-Flintstones multivites with breakfast"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        healthlist.setAdapter(adapter);
    }
}
