package com.calculator.controller;

import com.calculator.service.serviceImpl.CalcAthmOperationsImpl;
import com.calculator.service.serviceImpl.CalcOptionalFuncImpl;
import com.calculator.service.serviceImpl.CalcTranscendFuncImpl;

/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * <PRE>
 * -----------------------------
 * �����̷�
 * 2020. 6. 17. BRYANT : �����ۼ�
 * </PRE>
 */
public class CalculatorController extends BaseController{
	
	CalcAthmOperationsImpl athm_oper = new CalcAthmOperationsImpl(); // ��Ģ����
	CalcTranscendFuncImpl trsc_oper = new CalcTranscendFuncImpl(); //�ʿ��Լ�
	CalcOptionalFuncImpl opt_oper = new CalcOptionalFuncImpl(); // �ΰ����
	
	int result;
	int x = 10;
	int y = 10;
	/**
	 * @Author : BRYANT
	 * @Date : 2020. 6. 17.
	 * @Method Name : select
	 * @return : void
	 * @Description : 
	 */
	public void select() {
		
		athm_oper.plus(x, y);
		
	}
	
	
}
