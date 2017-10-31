package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
        Button mTopButton;
        Button mBotButton;
        TextView mStoryView;
        int mStoryIndex =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mTopButton =(Button) findViewById(R.id.buttonTop);
            mBotButton=(Button) findViewById(R.id.buttonBottom);
            mStoryView= (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            mTopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                if(mStoryIndex==1|| mStoryIndex==3){
                    mStoryView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBotButton.setText(R.string.T3_Ans2);
                    mStoryIndex=2;
                }else if (mStoryIndex==2){
                    mStoryView.setText(R.string.T6_End);
                    mStoryIndex=1;
                    mTopButton.setVisibility(View.GONE);
                    mBotButton.setVisibility(View.GONE);
                }
                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            mBotButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mStoryIndex==1){
                        mStoryView.setText(R.string.T2_Story);
                        mTopButton.setText(R.string.T2_Ans1);
                        mBotButton.setText(R.string.T2_Ans2);
                        mStoryIndex=3;

                    }else if (mStoryIndex==2){
                        mStoryView.setText(R.string.T5_End);
                        mStoryIndex=1;
                        mBotButton.setVisibility(View.GONE);
                        mTopButton.setVisibility(View.GONE);
                    }else{
                        mStoryView.setText(R.string.T4_End);
                        mTopButton.setVisibility(View.GONE);
                        mBotButton.setVisibility(View.GONE);
                    }
                }
            });

    }
}
