package com.recepinanc.sampleclient.sample;

public interface SampleGrpcClientService
{
    void getRandomNumbers(int count);

    void getLargeObjects(int count);
}
