/*
 * Copyright (c) 2017. Krishna Prasad Kuchur,
 *
 * This project is meant only for the use and assessment by Professor Timothy Lindquist of Arizona State Univeristy, for the course SER 423.
 *
 * @author Krishna Prasad Kuchur  kkuchur@asu.deu
 *
 * @version January 2017
 */

package assign2kkuchur.kkuchur.msse.asu.edu.assignment2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    /*
    * The OnCreate method gets called when the activity is created for the first time. This method can be called by:
    * Running the application from Android Studio. When the application launches, the Oncreate method of MainActivity gets called.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.w(this.getClass().getSimpleName(), "onCreate()" );


    }


    /*
    * The onRestart() function is called when the user navigates to the activity which was previously not visible to the user.
    * In the MainActivity, click the Home Button, this causes the Activity to go to OnStop, later go to the launcher and launch the
    * application. The onRestart() method gets called.
    * */
    @Override
    protected  void onRestart() {

        super.onRestart();
        Log.w(this.getClass().getSimpleName(), "onRestart()" );
    }



    /*
    * This method gets called, when we call the finish method or the system decides to free space.
    * In our MainActivity, onDestroy() gets called when we click the Back button, when we are in the MainActivity
    * */
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.w(this.getClass().getSimpleName(), "onDestroy()" );
    }


    /*
    * This method is called when the activity comes to the foreground. In this application there are two scenarios where the onResume is called:
    * 1. When the application is launched, the application quickly moves from OnCreate and moves to OnStart, and when the screen comes to the foreground
     * the OnResume is called.
     * 2. In the mainActivity, on clicking the Click ME button, the Mainactivity goes to onPause, and when AlertActivity is finished, the MainActivity goes back to
     * OnResume state and calls the OnResume() function.
    * */
    @Override
    protected void onResume(){
        super.onResume();
        Log.w(this.getClass().getSimpleName(), "onResume()" );
    }


    /*
    * The method is called when the activity enters the Start stage. This method just appears before the activity appears to the user, and
    * makes the activity appear to the user. This method gets called immediately after the onCreate method. For the activity MainActivity.
    * Launching the application causes the state to change to OnCreate and Subsequently changing to OnStart - calling the onStart Method
    * IT also gets called when the application moves from OnStop to OnRestart and when the activity comes back to the screen, the OnStart method
    * gets called again. To do this, Click on the Home Button of the application, on doing this the application moves to OnStop. To restart
    * the application, go to the Launcher and start the app, the OnRestart and OnStart method gets called.
    * */
    @Override
    protected void onStart(){
        super.onStart();
        Log.w(this.getClass().getSimpleName(), "onStart()" );
    }

    /*
    * The onPause() function gets called, when another activity is created and takes the center stage.
    * In our application, the Clicking of "Click Me" button in MainActivity, causes the call to OnPause, as AlertActivity comes into
    * the foreground.
    * */
    @Override
    protected void onPause(){
        super.onPause();
        Log.w(this.getClass().getSimpleName(), "onPause()" );
    }


    /*
    * The OnStop() method gets called when the activity is no longer visible to the user.
    * To call OnStop() method in MainActivity, we need to click on the Home Button of the emulator. This causes a call
    * to the OnStop() method of MainActivity.
    * */
    @Override
    protected void onStop(){
        super.onStop();
        Log.w(this.getClass().getSimpleName(), "onStop()" );
    }

    public void newactivity(View view){

        Intent swithcscreens = new Intent(this, AlertActivity.class);
        startActivity(swithcscreens);



    }
}
