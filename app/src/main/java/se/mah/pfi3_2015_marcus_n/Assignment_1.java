package se.mah.pfi3_2015_marcus_n;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class Assignment_1 extends ActionBarActivity {
    TextView quoteTextView;

    private void setupTextView(){
        quoteTextView = (TextView) findViewById(R.id.textView2);
    }
    private void newQuote(){
        Resources res = getResources();                             //Create resource object
        String[] quotes = res.getStringArray(R.array.array_quotes); //get quotes array from that resource object
        Random r = new Random();                                    //New random object
        String tempQuote;                                           //Used to determine if randomly selected quote is the sme as the previously selected quote
        //Randomly select new quote, only exit loop if it differs from the previously selected quote.
        do{
            int randInt = r.nextInt(quotes.length);                 //New random int between 0 and length of array
            tempQuote = quotes[randInt];                            //Assign randomly chosen quote to the temporary variable
        }while(tempQuote.equals(Variables.quote));
        Variables.quote = tempQuote;                                          //When the program makes it out fo the do-while loop we can be sure that it's a ne quote, assign that to the global quote variable
    }

    //Connected to the new quote button
    public void btnNewQuote(View view){
        setupTextView();
        newQuote();
        quoteTextView.setText(Variables.quote);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("MyApp", "onCreate");
        setContentView(R.layout.activity_assignment_1);

        setupTextView();
        if (Variables.quote.equals("")) newQuote();
        quoteTextView.setText(Variables.quote);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyApp", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyApp", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyApp", "onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyApp", "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyApp", "onStop");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_assignment_1, menu);
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
