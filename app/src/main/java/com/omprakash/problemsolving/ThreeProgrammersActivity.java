package com.omprakash.problemsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.omprakash.problemsolving.databinding.ActivityThreeProgrammersBinding;

public class ThreeProgrammersActivity extends AppCompatActivity implements ThreeProgrammersView{

    private ActivityThreeProgrammersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThreeProgrammersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleFindDifference();
    }

    @Override
    public void handleFindDifference() {
        binding.findDiffBtn.setOnClickListener(v -> {
            String p1Salary = binding.programmer1SalaryTxt.getText().toString();
            String p2Salary = binding.programmer2SalaryTxt.getText().toString();
            String p3Salary = binding.programmer3SalaryTxt.getText().toString();
            if (p1Salary.equals("") == false && p2Salary.equals("") == false && p3Salary.equals("") == false) {
                int diffMaxAndMin = new ThreeProgrammersImpl().getDiffMaxAndMin(p1Salary, p2Salary, p3Salary);
                binding.showDiffTxt.setVisibility(View.VISIBLE);
                binding.showDiffTxt.setText(String.valueOf(diffMaxAndMin));
            } else {
                Toast.makeText(this, "Please enter details", Toast.LENGTH_SHORT).show();
            }
        });
    }
}