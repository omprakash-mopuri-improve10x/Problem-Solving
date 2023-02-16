package com.omprakash.problemsolving.reversestring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.omprakash.problemsolving.R;
import com.omprakash.problemsolving.databinding.ActivityReverseStringBinding;

public class ReverseStringActivity extends AppCompatActivity implements ReverseStringView {

    private ActivityReverseStringBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReverseStringBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Reverse String");
        handleReverseString();
    }

    @Override
    public void handleReverseString() {
        binding.showRevStringBtn.setOnClickListener(v -> {
            String text = binding.inputTextTxt.getText().toString();
            if (text.equals("") == false) {
                String result = new ReverseStringControllerImpl().revString(text);
                binding.reverseTextTxt.setVisibility(View.VISIBLE);
                binding.reverseTextTxt.setText(result);
            } else {
                Toast.makeText(this, "Enter the text", Toast.LENGTH_SHORT).show();
            }
        });
    }
}