package com.chocodev.chocogen.test.gen.util;

public class ResponseWrapper<T> {
	private int statusCode;
	private T contents;
	public ResponseWrapper(T contents){
		this.contents=contents;
		this.statusCode=200;
	}
	public ResponseWrapper(int statusCode,T contents)
	{
		this.contents=contents;
		this.statusCode=statusCode;
	}
	public T getContents()
	{
		return contents;
	}
	public int getStatusCode()
	{
		return statusCode;
	}
}
