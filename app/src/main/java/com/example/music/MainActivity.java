package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import com.example.music.service.model.Request;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import cafsoft.foundation.HTTPURLResponse;
import cafsoft.foundation.URLSession;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();


    }
    public void initViews(){

    }
    public void initEvents(){

    }
    public void downloadAudioFile(URL remoteURL, String destFilename){
        URLSession.getShared().downloadTask(remoteURL, (localURL, response, error) -> {
            HTTPURLResponse resp = (HTTPURLResponse) response;

            if (error == null){

                if (resp.getStatusCode() == 200) {
                    File file = new File(localURL.getFile());

                    if (file.renameTo(new File(destFilename))) {
                        mediaPlayer = MediaPlayer.create(this, Uri.parse(destFilename));
                        mediaPlayer.start();
                    }

                }else{

                }
            }else{

            }
        }).resume();
    }
}