package code.camnang.camnang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgCamnang, imgMonan, imgYoga, imgThongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddControl();
    }

    private void AddControl() {

        imgCamnang.findViewById(R.id.imgCamnang);
        imgMonan.findViewById(R.id.imgMonan);
        imgYoga.findViewById(R.id.imgYoga);
        imgThongtin.findViewById(R.id.imgThongtin);
    }
}
