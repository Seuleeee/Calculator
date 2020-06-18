package com.calculator.service.serviceImpl;

import com.calculator.service.CalcAthmOperations;
 
/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : 사칙연산을 수행
 * <PRE>
 * -----------------------------
 * 개정이력
 * 2020. 6. 17. BRYANT : 최초작성
 * </PRE>
 */
public class CalcAthmOperationsImpl implements CalcAthmOperations{

	@Override
	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	@Override
	public double plus(double x, double y) {
		double result = x + y;
		return result;
	}

	@Override
	public int minus(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double minus(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiple(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multiple(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double divide(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
