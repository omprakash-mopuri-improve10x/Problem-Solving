package com.omprakash.problemsolving.vowels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityVowelsBinding;

public class VowelsActivity extends AppCompatActivity implements VowelsView{

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
            if (text.equals("") == false) {
                int vowelCount = new VowelCountControllerImpl().getVowelCount(text);
                binding.showVowelCount.setVisibility(View.VISIBLE);
                binding.showVowelCount.setText("Vowel Count is : " + vowelCount);
            } else {
                Toast.makeText(this, "Please enter the text", Toast.LENGTH_SHORT).show();
            }
        });
    }
}