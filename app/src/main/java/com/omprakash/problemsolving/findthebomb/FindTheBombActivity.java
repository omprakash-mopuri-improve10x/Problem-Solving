package com.omprakash.problemsolving.findthebomb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityFindTheBombBinding;

public class FindTheBombActivity extends AppCompatActivity implements FindTheBombView{

    private ActivityFindTheBombBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindTheBombBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Find The Bomb");
        handleCheckTheBomb();
    }

    @Override
    public void handleCheckTheBomb() {
        binding.checkTheBombBtn.setOnClickListener(v -> {
            String text = binding.inputTextTxt.getText().toString();
            if (text.equals("") == false) {
                String result = new FindTheBombControllerImpl().findTheBomb(text);
                binding.showResultTxt.setVisibility(View.VISIBLE);
                binding.showResultTxt.setText(result);
            } else {
                Toast.makeText(this, "Enter the text", Toast.LENGTH_SHORT).show();
            }
        });
    }
}