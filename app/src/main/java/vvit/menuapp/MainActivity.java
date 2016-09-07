package vvit.menuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"You Have Selected ComputerScience and Engineering",Toast.LENGTH_LONG).show();
                return true;

            case R.id.item2:
                Toast.makeText(getApplicationContext(),"You Have Selected Information Technology",Toast.LENGTH_LONG).show();
                return true;

            case R.id.item3:
                Toast.makeText(getApplicationContext(),"You Have Selected Electronics and Communication Engineering",Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
