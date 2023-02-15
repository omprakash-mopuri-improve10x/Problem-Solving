package com.omprakash.problemsolving.minutestoseconds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omprakash.problemsolving.InvalidInputException;
import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityMinutesToSecondsBinding;

public class MinutesToSecondsActivity extends AppCompatActivity implements MinutesToSecondsView{

    private ActivityMinutesToSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMinutesToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleSeconds();
    }

    @Override
    public void handleSeconds() {
        binding.secondsBtn.setOnClickListener(v -> {
            String minutes = binding.minutesTxt.getText().toString();
            int seconds = 0;
            try {
                seconds = new MinutesToSecondsControllerImpl().getSeconds(minutes);
                binding.showSecondsTxt.setVisibility(View.VISIBLE);
                binding.showSecondsTxt.setText(String.valueOf(seconds));
            } catch (Exception e) {
                e.printStackTrace();
                binding.showSecondsTxt.setVisibility(View.VISIBLE);
                binding.showSecondsTxt.setText("Invalid Input");
            }
        });
    }
}