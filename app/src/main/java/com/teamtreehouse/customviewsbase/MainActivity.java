package com.teamtreehouse.customviewsbase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    static final String PAST_WEEK = "Past Week";
    static final String PAST_MONTH = "Past Month";
    static final String PAST_YEAR = "Past Year";
    static final String ALL_DATA = "All Data";

    ChartView chartView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chartView = (ChartView) findViewById(R.id.chart_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(PAST_WEEK);
        menu.add(PAST_MONTH);
        menu.add(PAST_YEAR);
        menu.add(ALL_DATA);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getTitle().toString()) {
            case PAST_WEEK:
                chartView.showLast(7);
                break;
            case PAST_MONTH:
                chartView.showLast(30);
                break;
            case PAST_YEAR:
                chartView.showLast(365);
                break;
            case ALL_DATA:
                chartView.showLast();
                break;
            default:
                break;
        }
        return true;
    }
}
