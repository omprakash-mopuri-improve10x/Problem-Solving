package com.omprakash.problemsolving.convhrsminsintosecs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityConvHoursAndMinutesIntoSecondsBinding;

public class ConvHoursAndMinutesIntoSecondsActivity extends AppCompatActivity implements ConvHoursAndMinutesIntoSecondsView{

    private ActivityConvHoursAndMinutesIntoSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConvHoursAndMinutesIntoSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleConvertSeconds();
    }

    @Override
    public void handleConvertSeconds() {
        binding.convertSecondsBtn.setOnClickListener(v -> {
            String hours = binding.hoursTxt.getText().toString();
            String minutes = binding.minutesTxt.getText().toString();
            int seconds = 0;
            try {
                seconds = new ConvHoursAndMinutesIntoSecondsControllerImpl().getSeconds(hours, minutes);
                binding.showSecondsTxt.setVisibility(View.VISIBLE);
                binding.showSecondsTxt.setText("Seconds " + seconds);
            } catch (NumberFormatException ex) {
                ex.printStackTrace();
                binding.showSecondsTxt.setVisibility(View.VISIBLE);
                binding.showSecondsTxt.setText("Invalid Input");
            }
        });
    }
}