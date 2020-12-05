import io.grpc.Server;
import io.grpc.ServerBuilder;
import sample.SampleServiceImpl;

public class Application
{
    public static void main(String[] args) throws Exception
    {
        Server server = ServerBuilder.forPort(3000)
                .addService(new SampleServiceImpl())
                .build();

        server.start();

        System.out.println("gRPC Server started.");

        server.awaitTermination();
    }
}
