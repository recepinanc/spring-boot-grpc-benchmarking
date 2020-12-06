package com.recepinanc.sampleclient.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController
{
    SampleRestClientServiceImpl sampleRestClientService;
    SampleGrpcClientServiceImpl sampleGrpcClientService;

    public SampleController(SampleRestClientServiceImpl sampleRestClientService,
                            SampleGrpcClientServiceImpl sampleGrpcClientService)
    {
        this.sampleRestClientService = sampleRestClientService;
        this.sampleGrpcClientService = sampleGrpcClientService;
    }

    @RequestMapping("/rest/randomNumbers")
    public void restRandomNumber(@RequestParam("count") int count)
    {
        sampleRestClientService.getRandomNumbers(count);
    }

    @RequestMapping(value = "/rest/largeObjects/json")
    public void restLargeObjectsJson(@RequestParam("count") int count)
    {
        sampleRestClientService.getLargeObjectsJson(count);
    }

    @RequestMapping(value = "/rest/largeObjects")
    public void restLargeObjects(@RequestParam("count") int count)
    {
        sampleRestClientService.getLargeObjects(count);
    }

    @RequestMapping("/grpc/randomNumbers")
    public void grpcRandomNumber(@RequestParam("count") int count)
    {
        sampleGrpcClientService.getRandomNumbers(count);
    }

    @RequestMapping("/grpc/largeObjects")
    public void grpcLargeObjects(@RequestParam("count") int count)
    {
        sampleGrpcClientService.getLargeObjects(count);
    }
}
