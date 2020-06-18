package com.calculator.service;

import java.util.ArrayList;

/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : reset, history 등 부가기능 메소드 선언
 * <PRE>
 * -----------------------------
 * 개정이력
 * 2020. 6. 17. BRYANT : 최초작성
 * </PRE>
 */
public interface CalcOptionalFunc {

	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : reset
	 * @return : void
	 * @Description : reset 기능
	 */
	public void reset(String btnType);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : history
	 * @return : ArrayList<String>
	 * @Description : history 기능
	 */
	public ArrayList<String> history(String btnType);
}
