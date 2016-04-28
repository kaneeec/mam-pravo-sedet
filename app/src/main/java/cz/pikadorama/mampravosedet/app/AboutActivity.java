package cz.pikadorama.mampravosedet.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import cz.pikadorama.mampravosedet.R;

public class AboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return true;
    }
}
