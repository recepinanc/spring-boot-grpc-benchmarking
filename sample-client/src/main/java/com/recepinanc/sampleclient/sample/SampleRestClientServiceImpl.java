package com.recepinanc.sampleclient.sample;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SampleRestClientServiceImpl implements SampleRestClientService
{
    private final RestTemplate restTemplate;

    public SampleRestClientServiceImpl(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @Override
    public void randomNumbers(int count)
    {
        restTemplate.getForObject("http://localhost:4000/randomNumber/?count=" + count, List.class);
    }
}
