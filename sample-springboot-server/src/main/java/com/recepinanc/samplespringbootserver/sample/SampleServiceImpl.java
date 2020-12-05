package com.recepinanc.samplespringbootserver.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService
{
    private static final Random RANDOM_GENERATOR = new Random();

    @Override
    public List<Integer> randomNumbers(int count)
    {
        System.out.println(count);

        List<Integer> randomNumbers = getRandomNumbers(count);

        return randomNumbers;
    }

    private List<Integer> getRandomNumbers(int count)
    {
        List<Integer> randomNumbers = new ArrayList<Integer>();
        for (int i = 0; i < count; i++)
        {
            randomNumbers.add(RANDOM_GENERATOR.nextInt(10) + 1);
        }
        return randomNumbers;
    }
}
