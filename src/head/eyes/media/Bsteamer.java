package head.eyes.media;

import android.app.Activity;
import android.os.Bundle;
import android.media.*;
import android.widget.*;
import android.net.*;

public class Bsteamer extends Activity {
    /** Called when the activity is first created. */
    private MediaPlayer mp = new MediaPlayer();
        
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        String LINK = "http://video.ted.com/talks/podcast/DavidAgus_2009P.mp4";
        VideoView videoView = (VideoView) findViewById(R.id.VideoView01);
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        mc.setMediaPlayer(videoView);
        Uri video = Uri.parse(LINK);
        videoView.setMediaController(mc);
        videoView.setVideoURI(video);
        videoView.start();
    }
    
}