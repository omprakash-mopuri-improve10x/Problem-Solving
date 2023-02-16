package com.omprakash.problemsolving.vowels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityVowelsBinding;

public class VowelsActivity extends AppCompatActivity implements VowelsView {

    private ActivityVowelsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVowelsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("How Many Vowels");
        handleVowelCount();
    }

    @Override
    public void handleVowelCount() {
        binding.vowelCountBtn.setOnClickListener(v -> {
            String text = binding.inputTextTxt.getText().toString();
            int vowelCount = 0;
            try {
                vowelCount = new VowelCountControllerImpl().getVowelCount(text);
                binding.showVowelCount.setVisibility(View.VISIBLE);
                binding.showVowelCount.setText("Vowel Count is : " + vowelCount);
            } catch (Exception e) {
                e.printStackTrace();
                binding.showVowelCount.setVisibility(View.VISIBLE);
                binding.showVowelCount.setText("Invalid Input");
            }
        });
    }
}