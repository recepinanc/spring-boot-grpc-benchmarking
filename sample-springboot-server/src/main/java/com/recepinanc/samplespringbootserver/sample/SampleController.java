package com.recepinanc.samplespringbootserver.sample;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
    SampleService sampleService;

    public SampleController(SampleService sampleService)
    {
        this.sampleService = sampleService;
    }

    @RequestMapping("/randomNumber")
    public List<Integer> randomNumber(@RequestParam("count") int count)
    {
        return sampleService.randomNumbers(count);
    }
}
