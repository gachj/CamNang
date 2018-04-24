package code.camnang.camnang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
=======
>>>>>>> 1c943fbb8d8660be3b00d759c55fd2309618192a
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgCamnang, imgMonan, imgYoga, imgThongtin;
<<<<<<< HEAD
    Intent intent;
=======
>>>>>>> 1c943fbb8d8660be3b00d759c55fd2309618192a
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddControl();
<<<<<<< HEAD
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
=======
>>>>>>> 1c943fbb8d8660be3b00d759c55fd2309618192a
    }

    private void AddControl() {

<<<<<<< HEAD
        imgCamnang = findViewById(R.id.imgCamnang);
        imgMonan = findViewById(R.id.imgMonan);
        imgYoga = findViewById(R.id.imgYoga);
        imgThongtin = findViewById(R.id.imgThongtin);
=======
        imgCamnang.findViewById(R.id.imgCamnang);
        imgMonan.findViewById(R.id.imgMonan);
        imgYoga.findViewById(R.id.imgYoga);
        imgThongtin.findViewById(R.id.imgThongtin);
>>>>>>> 1c943fbb8d8660be3b00d759c55fd2309618192a
    }
}
