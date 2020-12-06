package com.recepinanc.sampleclient.sample;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.recepinanc.samplegrpcserver.sample.LargeObjectResponse;

@Service
public class SampleRestClientServiceImpl implements SampleRestClientService
{
    private final RestTemplate restTemplate;

    public SampleRestClientServiceImpl(RestTemplate restTemplate)
    {
        this.restTemplate = restTemplate;
    }

    @Override
    public void getRandomNumbers(int count)
    {
        restTemplate.getForObject("http://localhost:4000/randomNumbers/?count=" + count, List.class);
    }

    /**
     * Get LargeObjectResponse as Proto
     *
     * @param count
     */
    @Override
    public void getLargeObjects(int count)
    {
        restTemplate.getForObject("http://localhost:4000/largeObjects/?count=" + count, LargeObjectResponse.class);
    }

    /**
     * Get LargeObject List as JSON
     *
     * @param count
     */
    @Override
    public void getLargeObjectsJson(int count)
    {
        restTemplate.getForObject("http://localhost:4000/largeObjects/json/?count=" + count, List.class);
    }
}
