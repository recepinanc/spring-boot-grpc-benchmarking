package com.recepinanc.samplespringbootserver.sample;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recepinanc.samplegrpcserver.sample.LargeObjectResponse;
import com.recepinanc.samplespringbootserver.pojo.LargeObjectPOJO;

@RestController
public class SampleController
{
    SampleService sampleService;

    public SampleController(SampleService sampleService)
    {
        this.sampleService = sampleService;
    }

    @RequestMapping("/randomNumbers")
    public List<Integer> getRandomNumbers(@RequestParam("count") int count)
    {
        return sampleService.getRandomNumbers(count);
    }

    /**
     * @param count
     * @return a Proto Object
     */
    @RequestMapping("/largeObjects")
    public LargeObjectResponse getLargeObjects(@RequestParam("count") int count)
    {
        return LargeObjectResponse.newBuilder()
                .addAllLargeObjects(sampleService.getLargeObjects(count))
                .build();
    }

    /**
     * 
     * @param count
     * @return a POJO List as JSON
     */
    @RequestMapping("/largeObjects/json")
    public List<LargeObjectPOJO> getLargeObjectsJson(@RequestParam("count") int count)
    {
        return sampleService.getLargeObjectPOJOs(count);
    }
}
