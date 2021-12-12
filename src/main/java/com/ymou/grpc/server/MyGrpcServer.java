package com.ymou.grpc.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class MyGrpcServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Server server = ServerBuilder.forPort(8080).addService(new HelloService()).build();
		
		server.start();
		
		System.out.println("Server started at " + server.getPort());
		
		server.awaitTermination();
	}
}
