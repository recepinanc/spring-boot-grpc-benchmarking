package com.recepinanc.samplespringbootserver.sample;

import java.util.List;

import com.recepinanc.samplegrpcserver.sample.LargeObject;
import com.recepinanc.samplespringbootserver.pojo.LargeObjectPOJO;

public interface SampleService
{
    List<Integer> getRandomNumbers(int count);

    List<LargeObject> getLargeObjects(int count);

    List<LargeObjectPOJO> getLargeObjectPOJOs(int count);
}
