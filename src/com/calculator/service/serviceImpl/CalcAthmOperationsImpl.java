package com.calculator.service.serviceImpl;

import com.calculator.service.CalcAthmOperations;
 
/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : ��Ģ������ ����
 * <PRE>
 * -----------------------------
 * �����̷�
 * 2020. 6. 17. BRYANT : �����ۼ�
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
