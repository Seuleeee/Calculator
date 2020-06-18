package com.calculator.service;


/** 
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : �ʿ��Լ��� ����ϴ� Method ����
 * <PRE>
 * -----------------------------
 * �����̷�
 * 2020. 6. 17. BRYANT : �����ۼ�
 * </PRE>
 */
public interface CalcTranscendFunc {
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : log
	 * @return : double
	 * @Description : log ����
	 */
	public double log(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : trigonometric
	 * @return : double
	 * @Description : �ﰢ�Լ�
	 */
	public double trigonometric(double x, double y);
}
