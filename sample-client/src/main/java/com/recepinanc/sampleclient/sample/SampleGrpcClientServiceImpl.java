package com.recepinanc.sampleclient.sample;

import org.springframework.stereotype.Service;

import com.recepinanc.samplegrpcserver.sample.SampleGrpc;
import com.recepinanc.samplegrpcserver.sample.SampleRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

@Service
public class SampleGrpcClientServiceImpl implements SampleGrpcClientService
{
    public void randomNumbers(int count)
    {
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:3000")
                .usePlaintext()
                .build();

        SampleGrpc.SampleBlockingStub stub = SampleGrpc.newBlockingStub(channel);
        SampleRequest request = SampleRequest.newBuilder()
                .setCount(count)
                .build();

        stub.randomNumber(request);
        channel.shutdownNow();
    }
}
