package com.exercises.administrador.nowreduxc7;

import android.os.Bundle;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.Date;

public class NowReduxC7Activity extends Activity
        implements View.OnClickListener{

    private static final String TAG = "NowReduxC7";

    Button btn;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        Log.i(TAG, "In OnCreate() callback method");
        super.onCreate(icicle);

        setContentView(R.layout.activity_now_redux_c7);

        //btn=(Button)findViewById(R.id.button);
        //btn=new Button(this);

        btn.setOnClickListener(this);

        updateTime();
        setContentView(btn);

        Log.i(TAG, "Out OnCreate() callback method");

    }

    public void onClick(View view) {
        Log.i(TAG, "In OnClick() callback method");
        updateTime();
        Log.i(TAG, "Out OnClick() callback method");
    }

    private void updateTime() {
        btn.setText(new Date().toString());
        Log.println(Log.ASSERT,"Tag","Updated!");
    }

}

/*
public class NowReduxC7Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_redux_c7);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_now_redux_c7, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/