package net.bounceme.memes.clicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by stallun on 1/13/17.
 */

public class SplashScreen extends Activity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        final ImageView iv = (ImageView) findViewById(R.id.imageView);

    }
}
