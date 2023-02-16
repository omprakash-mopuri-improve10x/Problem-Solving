package com.omprakash.problemsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.omprakash.problemsolving.biggestnumberinarray.BiggestNumberInArrayActivity;
import com.omprakash.problemsolving.convhrsminsintosecs.ConvHoursAndMinutesIntoSecondsActivity;
import com.omprakash.problemsolving.databinding.ActivityMainBinding;
import com.omprakash.problemsolving.findthebomb.FindTheBombActivity;
import com.omprakash.problemsolving.minutestoseconds.MinutesToSecondsActivity;
import com.omprakash.problemsolving.reversestring.ReverseStringActivity;
import com.omprakash.problemsolving.strechedword.StrechedWordActivity;
import com.omprakash.problemsolving.threeprogrammers.ThreeProgrammersActivity;
import com.omprakash.problemsolving.vowels.VowelsActivity;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handle3Programmers();
        handleStringReverse();
        handleStrechedWord();
        handleBiggestNumberInArray();
        handleMinutesToSeconds();
        handleFindTheBomb();
        handleHowManyVowels();
        handleConvHoursAndMinutesIntoSeconds();
    }

    private void handle3Programmers() {
        binding.threeProgrammersBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThreeProgrammersActivity.class);
            startActivity(intent);
        });
    }

    private void handleStringReverse() {
        binding.reverseStringBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ReverseStringActivity.class);
            startActivity(intent);
        });
    }

    private void handleStrechedWord() {
        binding.strechedWordBtn.setOnClickListener(v -> {
           Intent intent = new Intent(this, StrechedWordActivity.class);
           startActivity(intent);
        });
    }

    private void handleBiggestNumberInArray() {
        binding.biggestNumberBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, BiggestNumberInArrayActivity.class);
            startActivity(intent);
        });
    }

    private void handleMinutesToSeconds() {
        binding.minsToSecsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MinutesToSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void handleFindTheBomb() {
        binding.findTheBombBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindTheBombActivity.class);
            startActivity(intent);
        });
    }

    private void handleHowManyVowels() {
        binding.howManyVowelsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, VowelsActivity.class);
            startActivity(intent);
        });
    }

    private void handleConvHoursAndMinutesIntoSeconds() {
        binding.convHrsMisIntoSecsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ConvHoursAndMinutesIntoSecondsActivity.class);
            startActivity(intent);
        });
    }
}