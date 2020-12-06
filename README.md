# Spring Boot and gRPC Benchmarking



This is a demo project that shows how to use gRPC and Spring Boot in their most basic forms.




# Project Structures



![sample_grpc_project_architecture](https://github.com/recepinanc/spring-boot-grpc-benchmarking/blob/main/sample_grpc_project_architecture.png)

*Single Spring Boot client backed by a GRPC and a Spring Boot Servers.*  



## sample-client

A Spring Boot project that accepts JSON and Protocol Buffer responses.  



**Port:** 5000

**Endpoints**

```
// REST

/rest/randomNumbers?count={n} -> Generates {n} random numbers as JSON List
/rest/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
/rest/largeObjects/json?count={n} -> Generates {n} LargeObjectPOJOs as JSON List

// GRPC

/grpc/randomNumbers?count={n} -> Generates {n} random numbers as Protocol Buffer Object
/grpc/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
```



- `/rest/**` calls are handled by `sample-springboot-server`  
- `/grpc/**` calls are handled by  `sample-grpc-server`



> This project has `sample-grpc-codegen` as dependency in its `pom.xml`.

  


## sample-springboot-server

A basic Spring Boot project.



**Port:** 4000

**Endpoints**

```
/rest/randomNumbers?count={n} -> Generates {n} random numbers as JSON List
/rest/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
/rest/largeObjects/json?count={n} -> Generates {n} LargeObjectPOJOs as JSON List
```

  

## sample-grpc-server

A basic gRPC Server.



**Port:** 3000

**Endpoints**

```
/grpc/randomNumbers?count={n} -> Generates {n} random numbers as Protocol Buffer Object
/grpc/largeObjects?count={n} -> Generates {n} LargeObjects as Protocol Buffer Object
```



> This project has `sample-grpc-codegen` as dependency in its `pom.xml`.

  


## sample-grpc-codegen

This project is the gist of the gRPC part of the main project.   

The sole purpose of this project is to generate the code based on the given Protobuff file to enable the Server (*sample-grpc-server*) and the Client (*sample-client*) to make Remote Procedure Calls (RPC) as if the methods they call are local methods.  



For this project, there's a `Sample.proto` and a `LargeObject.proto`  file located under `/src/proto/`.   



With the help of plugins, whenever the project is compiled and installed, it generates the required code (hence we call it ***codegen***) under `/targets/generated-sources` folder.

  

# Benchmarking



This benchmarking compares the **performances** of **"gRPC with Protocol Buffers"** against **"REST with JSON"** during **data transportation**.



## Motivation



As we are all witnessing the world moving towards the microservices architecture, gRPC's popularity is on the rise. It is mainly because it is said to be more performant than REST and its drawbacks are somewhat negligible if we are planning to use it to design our internal APIs.



So, I wanted to experiment the implementation of such API, its interaction with other frameworks and the its performance compared to REST APIs using JMeter.



## Setup



Compared to JSON (commonly used in REST APIs as the transfer object), Protocol Buffer offers a great performance improvement thanks to the way it represents the data during transportation. 

Using HTTP/1.1 with JSON is a text-based communication whereas using gRPC and protocol buffers we are able to make use of HTTP/2 and transport our data in binary format - which helps us increase performance and throughput.



> *Disclamer: This benchmarking tests ignores the throughput comparisons - for now - but focuses on the difference in the latency.*



To clearly see the effects of using Protocol Buffers, I created a really big object as Proto and Java object, named it  `LargeObject`, `LargeObjectPOJO` and tested the APIs by fetching instances of this object at different sizes - as it can be set for each endpoint with the `count` parameter.



### Constraints

In order to be able to focus directly on the performances of data transportation and serialization/deserialization, the benchmarking setup has the following constraints:

- No Database Connection
- No Business Logic
- No Logging



To remove the effects of generating the LargeObjectResponse (proto object) and LargeObjectPOJO (java object), I call the *"SetUp Thread Group"* and let the **servers generate the objects** and **cache** them. 

This way I can **focus only on the performance aspect of both gRPC and REST approaches during data transportation**.



### Test Scenarios

#### SetUp Thread Group

SetUp Thread Group's main purpose is to trigger all endpoints individually to generate the data that other test scenarios are going to ask for and let the servers cache the responses before they are asked.



#### Other Thread Groups

- The Test Plans scenarios starts from **1 user and ramps up to 100 users in 10 seconds** *(Every second 10 requests are sent).*

- The same test plan is run for both the **REST** and the **gRPC**.

- There are 6 Different thread groups in total, **3 for REST** and 3 for GRPC. 

- Each protocol is tested againts 1, 100, 1000 *LargeObjects* to test the performance differences with regards to input size.

- Thread Groups are executed sequentially *(1 Thread Group runs at a time)*.



## Results

![collage](https://github.com/recepinanc/spring-boot-grpc-benchmarking/blob/main/benchmarking/response-time-graphs/collage.png)



It is clear with higher amounts of data that **gRPC and Protobuff** really out-performs **REST and JSON**!



**Key takeaway** 

- REST is great for public facing API Designs.
- gRPC is great for internal APIs.




# What I learned?



✏️ Differences **between gRPC and REST**.

✏️ Theory behind **gRPC** and **Protocol Buffer**.

✏️ Setup a simple **gRPC** **Server** and **Client**.

✏️ Make use of **protobuff** for **code generation**.

✏️ Integrate **REST APIs** with **Protocol Buffers**.

✏️ Do **benchmarking** with **JMeter**.