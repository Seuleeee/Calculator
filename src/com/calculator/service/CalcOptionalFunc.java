package com.calculator.service;

import java.util.ArrayList;

/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * @Description : reset, history �� �ΰ���� �޼ҵ� ����
 * <PRE>
 * -----------------------------
 * �����̷�
 * 2020. 6. 17. BRYANT : �����ۼ�
 * </PRE>
 */
public interface CalcOptionalFunc {

	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : reset
	 * @return : void
	 * @Description : reset ���
	 */
	public void reset(String btnType);
	
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : history
	 * @return : ArrayList<String>
	 * @Description : history ���
	 */
	public ArrayList<String> history(String btnType);
}
