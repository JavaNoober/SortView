package xiaoqi.sortview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Students> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        SortAdapter adapter = new SortAdapter(dataList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(
                this, DividerItemDecoration.VERTICAL_LIST));
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new SortItemCallback(adapter));
        itemTouchHelper.attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(adapter);
    }

    private void initData() {
        dataList = new ArrayList<>();
        dataList.add(new Students("1"));
        dataList.add(new Students("2"));
        dataList.add(new Students("3"));
        dataList.add(new Students("4"));
        dataList.add(new Students("5"));
        dataList.add(new Students("6"));
        dataList.add(new Students("7"));
        dataList.add(new Students("8"));
        dataList.add(new Students("9"));
        dataList.add(new Students("10"));
        dataList.add(new Students("11"));
        dataList.add(new Students("12"));
        dataList.add(new Students("13"));
        dataList.add(new Students("14"));
        dataList.add(new Students("15"));
        dataList.add(new Students("16"));
        dataList.add(new Students("17"));
        dataList.add(new Students("18"));
        dataList.add(new Students("19"));
    }
}
