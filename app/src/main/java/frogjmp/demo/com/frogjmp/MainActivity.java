package frogjmp.demo.com.frogjmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int x=10;
        int y=85;
        int d=30;
        int jumps;

        jumps = (y-x)/d;

        if((y-x)%d > 0){
            jumps++;
        }

        Log.d("jumps", String.valueOf(jumps));

    }
}
