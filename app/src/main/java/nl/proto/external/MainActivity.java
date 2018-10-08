package nl.proto.external;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double money = 0.0d;
    private ProgressBar pb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        money = 1000;
         initViews();
         pb.setProgress((int) money);
         tv.setText(Double.toString(money));
    }

    public void initViews() {
        pb = findViewById(R.id.progressBar);
        tv = findViewById(R.id.textView);


    }
}
