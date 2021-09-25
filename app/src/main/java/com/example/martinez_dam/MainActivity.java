package com.example.martinez_dam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends AppCompatActivity {

    TextView mostrarpoercentaje;
    CheckBox dirRetiro,terminosCond;
    EditText dirRetiroEdit;
    Switch aSwitch;
    Button botonPublicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // use findViewById() para variables
        mostrarpoercentaje = (TextView) findViewById(R.id.txtPorcentaje);
        SeekBar seekBar;
        seekBar = findViewById(R.id.seekBar2);
        aSwitch = findViewById(R.id.switch1);
        dirRetiro= findViewById(R.id.checkBox);
        dirRetiroEdit= findViewById(R.id.dirRetiro);
        terminosCond=findViewById(R.id.checkBox2);
        botonPublicar=findViewById(R.id.button1);

        // Valor Inicial
        //seekBar.setProgress(0);
        // Valot Final
        seekBar.setMax(100);
        seekBar.setVisibility(View.GONE);
        dirRetiroEdit.setVisibility(View.GONE);
        botonPublicar.setEnabled(false);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked = true)
                {
                    seekBar.setVisibility(View.VISIBLE);
                }
                else
                {
                    seekBar.setVisibility(View.GONE);
                }
            }
        });

        dirRetiro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(dirRetiro.isChecked())
                {
                    dirRetiroEdit.setVisibility(View.VISIBLE);
                }
                else
                {
                    dirRetiroEdit.setVisibility(View.GONE);
                }
            }
        });


        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            //hace un llamado a la perilla cuando se arrastra
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mostrarpoercentaje.setText("> " + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        terminosCond.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(terminosCond.isChecked())
                {
                    botonPublicar.setEnabled(true);
                }
                else
                {
                    botonPublicar.setEnabled(false);
                }
            }
        });







    }
}