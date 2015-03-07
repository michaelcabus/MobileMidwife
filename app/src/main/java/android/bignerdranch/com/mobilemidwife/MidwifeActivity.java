package android.bignerdranch.com.mobilemidwife;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.content.res.Resources;
import android.util.TypedValue;

//import android.os.Bundle;





public class MidwifeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout splashLayout = new RelativeLayout(this);

           //Button
        Button login = new Button(this);
        login.setText("Click me");
        login.setBackgroundColor(Color.RED);

        EditText username = new EditText(this);

        login.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams (
            RelativeLayout.LayoutParams.WRAP_CONTENT,
            RelativeLayout.LayoutParams.WRAP_CONTENT



        );

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams (

               RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT



        );

        //give rules to position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE,login.getId() );

        usernameDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        usernameDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        usernameDetails.setMargins(1,1,1,1);

       buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        //add widget to layout(button is now child)

        splashLayout.addView(login, buttonDetails);
        splashLayout.addView(username, usernameDetails);
        //Set this activities content/display to this view
        setContentView(splashLayout);
        // setContentView(R.layout.activity_midwife);
    }

}

  //  @Override
  //  public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
   //     getMenuInflater().inflate(R.menu.menu_main, menu);
  //      return true;
  //  }

        //public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      //  int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       // if (id == R.id.action_settings) {
        //    return true;
       // }

        //return super.onOptionsItemSelected(item);
    //}
//}
