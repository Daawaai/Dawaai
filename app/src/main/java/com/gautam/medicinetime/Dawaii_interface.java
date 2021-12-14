package com.gautam.medicinetime;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

import com.gautam.medicinetime.medicine.MedicineActivity;



public class Dawaii_interface extends AppCompatActivity {
    public Button button_Tasks;
    public Button button_Reminders2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dawaii_interface);

        button_Reminders2 = (Button) findViewById(R.id.button_Reminders);

        button_Reminders2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dawaii_interface.this, MedicineActivity.class);
                startActivity(intent);
            }
        });

        button_Tasks= (Button) findViewById(R.id.button_Tasks);
        button_Tasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Dawaii_interface.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }








}