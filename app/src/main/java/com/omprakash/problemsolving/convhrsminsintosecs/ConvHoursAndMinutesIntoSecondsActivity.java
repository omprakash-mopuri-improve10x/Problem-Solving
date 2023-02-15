package com.omprakash.problemsolving.convhrsminsintosecs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityConvHoursAndMinutesIntoSecondsBinding;

public class ConvHoursAndMinutesIntoSecondsActivity extends AppCompatActivity implements ConvHoursAndMinutesIntoSecondsView{

    private ActivityConvHoursAndMinutesIntoSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConvHoursAndMinutesIntoSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    public void handleConvertSeconds() {

    }
}