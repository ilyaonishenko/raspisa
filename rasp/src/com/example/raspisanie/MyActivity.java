package com.example.raspisanie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyActivity extends Activity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    Button btnMon,btnTue,btnWen,btnThu,btnFri,btnSat;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnFri = (Button)findViewById(R.id.btnFri);
        btnMon = (Button)findViewById(R.id.btnMon);
        btnSat = (Button)findViewById(R.id.btnSat);
        btnThu = (Button)findViewById(R.id.btnThu);
        btnTue = (Button)findViewById(R.id.btnTue);
        btnWen = (Button)findViewById(R.id.btnWen);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId())
        {
            case R.id.btnFri:
                intent = new Intent(this,somedayActivity.class);
                intent.putExtra("day","fri");
                startActivity(intent);
                break;
            case R.id.btnMon:
                intent = new Intent(this,somedayActivity.class);
                intent.putExtra("day","mon");
                startActivity(intent);
                break;
            case R.id.btnSat:
                intent = new Intent(this,somedayActivity.class);
                intent.putExtra("day","sat");
                startActivity(intent);
                break;
            case R.id.btnThu:
                intent = new Intent(this,somedayActivity.class);
                intent.putExtra("day","thu");
                startActivity(intent);
                break;
            case R.id.btnTue:
                intent = new Intent(this,somedayActivity.class);
                intent.putExtra("day","tue");
                startActivity(intent);
                break;
            case R.id.btnWen:
                intent = new Intent(this,somedayActivity.class);
                intent.putExtra("day","wen");
                startActivity(intent);
                break;
        }
    }
}
