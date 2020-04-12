package com.mdrayefenam.mosquitokiller;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    MediaPlayer player1,player2,player3,player4,player5,player6,player7,player8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void play(View v) {
        if (player1 == null) {
            player1 = MediaPlayer.create(this, R.raw.eight);
            player1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player1.start();
    }


    public void play2(View v) {
        if (player2 == null) {
            player2 = MediaPlayer.create(this, R.raw.ten);
            player2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player2.start();
    }

    public void play3(View v) {
        if (player3 == null) {
            player3 = MediaPlayer.create(this, R.raw.tweleve);
            player3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player3.start();
    }

    public void play4(View v) {
        if (player4 == null) {
            player4 = MediaPlayer.create(this, R.raw.fourteen);
            player4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player4.start();
    }

    public void play5(View v) {
        if (player5 == null) {
            player5 = MediaPlayer.create(this, R.raw.sixteen);
            player5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player5.start();
    }

    public void play6(View v) {
        if (player6 == null) {
            player6 = MediaPlayer.create(this, R.raw.seventeen);
            player6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player6.start();
    }

    public void play7(View v) {
        if (player7 == null) {
            player7 = MediaPlayer.create(this, R.raw.tweenty);
            player7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player7.start();
    }

    public void play8(View v) {
        if (player8 == null) {
            player8 = MediaPlayer.create(this, R.raw.tweektyone);
            player8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player8.start();
    }


/*    public void pause(View v) {
        if (player != null) {
            player.pause();
        }
    }*/

    public void stop(View v) {
        stopPlayer();
    }

    private void stopPlayer() {
        if (player1 != null) {
            player1.release();
            player1 = null;
            Toast.makeText(this, "08kHz Action Start", Toast.LENGTH_SHORT).show();
        }

        else if (player2 != null) {
            player2.release();
            player2 = null;
            Toast.makeText(this, "10kHz Action Start", Toast.LENGTH_SHORT).show();
        }

        else if (player3 != null) {
            player3.release();
            player3 = null;
            Toast.makeText(this, "12kHz Action Start", Toast.LENGTH_SHORT).show();
        }

        else if (player4 != null) {
            player4.release();
            player4 = null;
            Toast.makeText(this, "14kHz Action Start", Toast.LENGTH_SHORT).show();
        }

        else if (player5 != null) {
            player5.release();
            player5 = null;
            Toast.makeText(this, "16kHz Action Start", Toast.LENGTH_SHORT).show();
        }

        else if (player6 != null) {
            player6.release();
            player6 = null;
            Toast.makeText(this, "17kHz Action Start", Toast.LENGTH_SHORT).show();
        }

        else if (player7 != null) {
            player7.release();
            player7 = null;
            Toast.makeText(this, "20kHz Action Start", Toast.LENGTH_SHORT).show();
        }

        else if (player8 != null) {
            player8.release();
            player8 = null;
            Toast.makeText(this, "21kHz Action Start", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }

}