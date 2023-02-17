package com.omprakash.problemsolving.convagetodays;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityConvertAgeToDaysBinding;

public class ConvertAgeToDaysActivity extends AppCompatActivity implements ConvAgeToDaysView{

    private ActivityConvertAgeToDaysBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConvertAgeToDaysBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleConvAgeToDays();
    }

    @Override
    public void handleConvAgeToDays() {
        binding.convAgeToDaysBtn.setOnClickListener(v -> {
            String age = binding.ageTxt.getText().toString();
            try {
                int days = new ConvAgeToDaysControllerImpl().getDays(age);
                binding.showDaysTxt.setVisibility(View.VISIBLE);
                binding.showDaysTxt.setText("Days: " + days);
            } catch (Exception e) {
                e.printStackTrace();
                binding.showDaysTxt.setVisibility(View.VISIBLE);
                binding.showDaysTxt.setText("Invalid Input");
            }
        });
    }
}