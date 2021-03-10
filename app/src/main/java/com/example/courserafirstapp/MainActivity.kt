package com.example.courserafirstapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import java.lang.Double.valueOf
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val km_cvt = findViewById<Button>(R.id.km_cvt)
        km_cvt.setOnClickListener {
            //JavaCodes: @Override
            //public void onClick(View v){
            var ml_ip = findViewById<EditText>(R.id.ml_ip)
            var km_ip = findViewById<EditText>(R.id.km_ip)
            var vMiles = valueOf(ml_ip.getText().toString())
            var vKm = vMiles / 0.62137
            var formatVal = DecimalFormat("##.##")
            km_ip.setText(formatVal.format(vKm))
        }
    }


}