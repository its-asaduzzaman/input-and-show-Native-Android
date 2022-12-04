package com.example.myapplication23;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication23.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edName;
    Button myButton;
    TextView tvDisplay;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        edName = findViewById(R.id.edName);
        myButton = findViewById(R.id.myButton);
        tvDisplay = findViewById(R.id.tvDisplay);


       myButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              String userName =  edName.getText().toString();
              tvDisplay.setText("Hello "+ userName + "\n Great work" );

           }
       });



    }


}