package com.example.android.myyoutubeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {
    public static final String TAG="MainActivity";
    YouTubePlayerView mYouTubePlayerView;
    Button btPlay;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate++");
        btPlay=(Button)findViewById(R.id.bt_play);
        mYouTubePlayerView=(YouTubePlayerView)findViewById(R.id.vt_youtubePlayer);

        mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG,"onInitializationSuccess");
                youTubePlayer.loadVideo("u4jchTQ4EeA");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG," onInitializationFailure");
            }
        };

        btPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick : Initializing Youtube Player.");
                mYouTubePlayerView.initialize(YouTubeConfig.getApiKey(),mOnInitializedListener);
            }
        });
    }
}
