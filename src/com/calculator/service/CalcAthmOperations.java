package com.calculator.service;

/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : ��Ģ���� �޼ҵ� ����
 * <PRE>
 * -----------------------------
 * �����̷�
 * 2020. 6. 17. BRYANT : �����ۼ�
 * </PRE>
 */
public interface CalcAthmOperations {
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : plus
	 * @return : int
	 * @Description : ���� ����
	 */
	public int plus(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : plus
	 * @return : double
	 * @Description : double ���� ����
	 */
	public double plus(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : minus
	 * @return : int
	 * @Description : int ���� ����
	 */
	public int minus(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : minus
	 * @return : double
	 * @Description : double ���� ����
	 */
	public double minus(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : multiple
	 * @return : int
	 * @Description : int ���� ����
	 */
	public int multiple(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : multiple
	 * @return : double
	 * @Description : double ���� ����
	 */
	public double multiple(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : divide
	 * @return : int
	 * @Description : int ������ ����
	 */
	public int divide(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : divide
	 * @return : double
	 * @Description : double ������ ����
	 */
	public double divide(double x, double y);

}
