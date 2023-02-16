package com.omprakash.problemsolving.strechedword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityStrechedWordBinding;

public class StrechedWordActivity extends AppCompatActivity implements StrechedWordView {

    private ActivityStrechedWordBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStrechedWordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Streched Word");
        handleStrechedWord();
    }

    @Override
    public void handleStrechedWord() {
        binding.strechedWordBtn.setOnClickListener(v -> {
            String word = binding.wordTxt.getText().toString();
            String newWord = null;
            try {
                newWord = new StrechedWordControllerImpl().strechedWord(word);
                binding.showMessageTxt.setVisibility(View.VISIBLE);
                binding.showMessageTxt.setText(newWord);
            } catch (Exception e) {
                e.printStackTrace();
                binding.showMessageTxt.setVisibility(View.VISIBLE);
                binding.showMessageTxt.setText("Invalid Input");
            }
        });
    }
}