package com.calculator.service;

/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : »çÄ¢¿¬»ê ¸Þ¼Òµå ¼±¾ð
 * <PRE>
 * -----------------------------
 * °³Á¤ÀÌ·Â
 * 2020. 6. 17. BRYANT : ÃÖÃÊÀÛ¼º
 * </PRE>
 */
public interface CalcAthmOperations {
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : plus
	 * @return : int
	 * @Description : µ¡¼À ¼öÇà
	 */
	public int plus(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : plus
	 * @return : double
	 * @Description : double µ¡¼À ¼öÇà
	 */
	public double plus(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : minus
	 * @return : int
	 * @Description : int »¬¼À ¼öÇà
	 */
	public int minus(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : minus
	 * @return : double
	 * @Description : double »¬¼À ¼öÇà
	 */
	public double minus(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : multiple
	 * @return : int
	 * @Description : int °ö¼À ¼öÇà
	 */
	public int multiple(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : multiple
	 * @return : double
	 * @Description : double °ö¼À ¼öÇà
	 */
	public double multiple(double x, double y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : divide
	 * @return : int
	 * @Description : int ³ª´°¼À ½ÇÇà
	 */
	public int divide(int x, int y);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : divide
	 * @return : double
	 * @Description : double ³ª´°¼À ½ÇÇà
	 */
	public double divide(double x, double y);

}
