package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.recepinanc.samplegrpcserver.sample.SampleGrpc;
import com.recepinanc.samplegrpcserver.sample.SampleRequest;
import com.recepinanc.samplegrpcserver.sample.SampleResponse;

import io.grpc.stub.StreamObserver;

public class SampleServiceImpl extends SampleGrpc.SampleImplBase
{
    private static final Random RANDOM_GENERATOR = new Random();

    @Override
    public void randomNumber(SampleRequest request, StreamObserver<SampleResponse> responseObserver)
    {
        System.out.println(request);

        int count = request.getCount();

        List<Integer> randomNumbers = getRandomNumbers(count);

        SampleResponse response = SampleResponse.newBuilder()
                .addAllRandomNumber(randomNumbers)
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();
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
