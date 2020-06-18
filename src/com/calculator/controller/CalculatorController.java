package com.calculator.controller;

import com.calculator.service.serviceImpl.CalcAthmOperationsImpl;
import com.calculator.service.serviceImpl.CalcOptionalFuncImpl;
import com.calculator.service.serviceImpl.CalcTranscendFuncImpl;

/**
 * @since 2020. 6. 17.
 * @author BRYANT
 * <PRE>
 * -----------------------------
 * 개정이력
 * 2020. 6. 17. BRYANT : 최초작성
 * </PRE>
 */
public class CalculatorController extends BaseController{
	
	CalcAthmOperationsImpl athm_oper = new CalcAthmOperationsImpl(); // 사칙연산
	CalcTranscendFuncImpl trsc_oper = new CalcTranscendFuncImpl(); //초월함수
	CalcOptionalFuncImpl opt_oper = new CalcOptionalFuncImpl(); // 부가기능
	
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
