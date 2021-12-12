package com.ymou.grpc.server;

import com.ymou.grpc.HelloRequest;
import com.ymou.grpc.HelloResponse;
import com.ymou.grpc.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;

public class HelloService extends HelloServiceImplBase{

	@Override
	public void greet(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
		
		System.out.println(request);
		
		HelloResponse response = HelloResponse.newBuilder().setGreeting("Hello " + request.getName()).build();
		
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
	}

	
}
