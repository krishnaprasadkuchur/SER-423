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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class AlertActivity extends AppCompatActivity {


    /*
    * The OnCreate method gets called when the activity is created for the first time. This method can be called by:
    * navigating to the AlertActivity, which is by clicking on the "Click Me" button in the MainActivity. When the activity is first created,
     * the Oncreate() method of AlertActivity gets called.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        Log.w(this.getClass().getSimpleName(), "onCreate()" );


    }

    /*
    * The onRestart() function is called when the user navigates to the activity which was previously not visible to the user.
    * In the AlertActivity, click the Home Button, this causes the Activity to go to OnStop, later go to the launcher and launch the
    * application. The onRestart() method gets called.
    * */
    @Override
    protected  void onRestart() {

        super.onRestart();
        Log.w(this.getClass().getSimpleName(), "onRestart()" );
    }


    /*
    * This method gets called, when we call the finish method or the system decides to free space.
    * In our AlertActivity, onDestroy() gets called when we click the Back button, when we are in the AlertActivity
    * Also, on the clicking the button "OK", the finish() method is called, which in turn destroys the AlertActivity
    * */
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.w(this.getClass().getSimpleName(), "onDestroy()" );
    }

    /*
    * This method is called when the activity comes to the foreground.
    *  When the AlertActivity is launched, the application quickly moves from OnCreate and moves to OnStart, and when the screen comes to the foreground
    * the OnResume is called.
    */
    @Override
    protected void onResume(){
        super.onResume();
        Log.w(this.getClass().getSimpleName(), "onResume()" );
    }


    /*
    * The method is called when the activity enters the Start stage.
     * For the activity AlertActivity.
    * Clicking the "Click Me" button in MainActivity causes the AlertActivity to go to state of OnCreate and Subsequently changing to OnStart - calling the onStart Method
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
    * The AlertActivity briefly goes to the OnPause state, and calls OnPasue() when the back button is clicked, while we are in
    * AlertActivity.
    * */
    @Override
    protected void onPause(){
        super.onPause();
        Log.w(this.getClass().getSimpleName(), "onPause()" );
    }

    /*
   * The OnStop() method gets called when the activity is no longer visible to the user.
   * To call OnStop() method in AlertActivity, we need to click on the Home Button of the emulator. This causes a call
   * to the OnStop() method of AlertActivity.
   * */
    @Override
    protected void onStop(){
        super.onStop();
        Log.w(this.getClass().getSimpleName(), "onStop()" );
    }

    public void finsihactivity(View view){
        this.finish();


    }

}
