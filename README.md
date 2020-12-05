# gRPC and Spring Boot Benchmarking



This is a demo project that shows how to use gRPC and Spring Boot in their most basic forms.



- [ ]  Do benchmarking, share results

- [ ] Add "How to run?" before Structure


# Structure



![sample_grpc_project_architecture](/Users/recep.inanc/playground/grpc/sample/spring-boot-grpc-benchmarking/sample_grpc_project_architecture.png)



## sample-client

**Port:** 5000

Accepts calls to `/rest/randomNumber?count={N}` and `/grpc/randomNumber?count={N}` routes.

For `/rest/` calls uses `sample-springboot-server` as the server and for `/grpc/` calls uses `sample-grpc-server`.



> This project has `sample-grpc-codegen` imported as dependency in its `pom.xml`.



## sample-springboot-server

**Port:** 4000

This is a basic Spring Boot project that responds to the call `/randomNumber?count={N}`.

Just generates N random numbers and **does not return anything**.



## sample-grpc-server

**Port:** 3000

This is a basic gRPC Server that responds to the call `/randomNumber?count={N}`.

Just like `sample-springboot-server`,  this server generates N random numbers and **does not return anything** too.



> This project has `sample-grpc-codegen` imported as dependency in its `pom.xml`.



## sample-grpc-codegen

This project is the gist of the gRPC part of the main project. 

The sole purpose of this project is to generate the code based on the given Protobuff file to enable the Server (*sample-grpc-server*) and the Client (*sample-client*) to make Remote Procedure Calls (RPC) as if the methods they call are local methods.



For this project, there's a `Sample.proto` file located under `/src/proto/`. 

With the help of plugins, whenever the project is compiled and installed, it generates the required code (hence we call it ***codegen***) under `/targets/generated-sources` folder.



# What I learned?



✏️ Setup a simple **gRPC** Server and Client.

✏️ Make use of **protobuff** for **code generation**.
