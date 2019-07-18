package sg.edu.rp.dmsd.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv =findViewById(R.id.iv);
      //  iv.setImageResource(R.mipmap.ic_launcher);

        String imageUrl = "http://jsibbold.github.io/zoomage/";
        Picasso.with(this).load(imageUrl).into(iv);

    }
}
