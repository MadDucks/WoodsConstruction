/*
Author: Chris H.
Purpose: Business Card app for class. Done for people building my house.
    Will probably build on this app. For now, most of the functionality is carried
    out in activity_main.xml, with some Java code here to create an intent for when
    the button is pressed.  If written correctly, it will open a browser.
Date: 04/30/18
 */


package com.cheyennelabs.woodsconstruction;

// All the imports of libraries.  Included content.Intent and net.Uri libraries to
// get browser opening functionality.
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Function that is called by button press in activity_main.xml
    public void goToWoods (View view) {
        newUrl ( "http://www.woodsbrothersconstruction.com");
    }

    // newUrl
    // input: String - URL to go to on internet
    // output: create's launchbrowser, which is then launched as a browser.
    // called by: goToWoods
    private void newUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
