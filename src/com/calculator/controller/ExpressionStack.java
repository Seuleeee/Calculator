package com.calculator.controller;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Date 2020. 6. 30.
 * @Time 오전 1:59:54
 * @author BRYANT
 * =====================
 * Writing Developer
 */
public class ExpressionStack {
	int max; // 스택용량
	int ptr; // 스택 포인터
	String[] stk; // 스택 본체
	
	// 실행시 예외 : 스택 가득 비어있음
	public class EmptyStackException extends RuntimeException{
		public EmptyStackException() {
			
		}
	}
	
	// 실행시 예외 : 스택 가득 참
	public class OverflowStackException extends RuntimeException{
		public OverflowStackException() {
			
		}
	}
	
	// 생성자
	public ExpressionStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new String[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	// stack에 추가(push)
	public String push(String c) throws OverflowStackException{
		if(ptr >= max) {
			throw new OverflowStackException();
		}
		return stk[ptr++] = c;
	}
	
	//stack에서 꺼내기(pop)
	public String pop() throws EmptyStackException{
		if(ptr <= 0) {
			throw new EmptyStackException();
		}
		stk[ptr--] = "";
		return stk[ptr--];
	}
	
	//최고점 값 (peek)
	public String peek() throws EmptyStackException{
		if(ptr <= 0) {
			throw new EmptyStackException();
		}
		return stk[ptr-1]; 
	}
	
	public int indexOf(String x) {
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i].equals(x)) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <=0;
	}
	
	public boolean isFull() {
		return ptr >=max;
	}
	
	public String dump() {
		String str = "";
		
		if (ptr <= 0) {
			System.out.println("stack is empty");
		}else {
			for(int i=0; i < ptr; i++) {
				System.out.print(stk[i]+" ");
				str += stk[i];
			}
			System.out.println();
		}
		return str;
	}

}
