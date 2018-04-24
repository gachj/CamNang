package code.camnang.camnang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgCamnang, imgMonan, imgYoga, imgThongtin;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddControl();
        AddEvent();
    }

    private void AddEvent() {
        imgCamnang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, CamnangActivity.class);
                startActivity(intent);
            }
        });
        imgYoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,Yoga.class);
                startActivity(intent);
            }
        });
        imgMonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,MonanActivity.class);
                startActivity(intent);
            }
        });
        imgThongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,ThongtinActivity.class);
                startActivity(intent);
            }
        });
    }

    private void AddControl() {

        imgCamnang = findViewById(R.id.imgCamnang);
        imgMonan = findViewById(R.id.imgMonan);
        imgYoga = findViewById(R.id.imgYoga);
        imgThongtin = findViewById(R.id.imgThongtin);
    }
}
