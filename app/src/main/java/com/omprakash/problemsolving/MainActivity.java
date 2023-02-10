package com.omprakash.problemsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.omprakash.problemsolving.databinding.ActivityMainBinding;
import com.omprakash.problemsolving.reversestring.ReverseStringActivity;
import com.omprakash.problemsolving.threeprogrammers.ThreeProgrammersActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handle3Programmers();
        handleStringReverse();
    }

    private void handle3Programmers() {
        binding.threeProgrammersBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThreeProgrammersActivity.class);
            startActivity(intent);
        });
    }

    private void handleStringReverse() {
        binding.reverseStringBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ReverseStringActivity.class);
            startActivity(intent);
        });
    }
}