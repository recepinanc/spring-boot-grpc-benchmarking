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

    @RequestMapping("/rest/randomNumber")
    public void restRandomNumber(@RequestParam("count") int count)
    {
        sampleRestClientService.randomNumbers(count);
    }

    @RequestMapping("/grpc/randomNumber")
    public void grpcRandomNumber(@RequestParam("count") int count)
    {
        sampleGrpcClientService.randomNumbers(count);
    }
}
