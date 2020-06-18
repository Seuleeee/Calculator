package com.calculator.service;


/** 
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : 초월함수를 계산하는 Method 선언
 * <PRE>
 * -----------------------------
 * 개정이력
 * 2020. 6. 17. BRYANT : 최초작성
 * </PRE>
 */
public interface CalcTranscendFunc {
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : log
	 * @return : double
	 * @Description : log 연산
	 */
	public double log(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : trigonometric
	 * @return : double
	 * @Description : 삼각함수
	 */
	public double trigonometric(double x, double y);
}
