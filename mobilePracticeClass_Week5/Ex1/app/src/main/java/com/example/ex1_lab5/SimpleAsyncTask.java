package com.example.ex1_lab5;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.widget.TextView;

import java.util.Random;


class SimpleAsyncTask extends AsyncTask<Void, Void, String> {

    // The TextView where we will show results
    @SuppressLint("StaticFieldLeak")
    private final TextView mTextView;

    // Constructor that provides a reference to the TextView from the MainActivity
    public SimpleAsyncTask(TextView tv) {
        mTextView = tv;
    }

    @Override
    protected String doInBackground(Void... voids) {

        // Generate a random number between 0 and 10
        Random r = new Random();
        int n = r.nextInt(11);

        // Make the task take long enough that we have
        // time to rotate the phone while it is running
        int s = n * 200;

        // Sleep for the random amount of time
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return a String result
        return "Each of your clicks will donate " + s + " to disadvantaged children ❤️";
    }


    protected void onPostExecute(String result) {
        mTextView.setText(result);
    }
}
