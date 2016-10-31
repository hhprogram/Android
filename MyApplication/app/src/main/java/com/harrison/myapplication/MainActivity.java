package com.harrison.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hosts the 'activity_main_xml (ie launches it)
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button
     * Called by the 'Android:onClick' line in the XML.
     * */
    public void sendMessage(View view) {
        //retrieves the android:CONTENTDESCRIPTION field in button corresponding to VIEW
        CharSequence title = "This will launch the " + view.getContentDescription() +
                " application.";
        //create a context object to feed as a parameter for our Toast object
        Context button = view.getContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(button, title, duration);
        //shows the toast with the above 3 parameters
        toast.show();
    }
}
