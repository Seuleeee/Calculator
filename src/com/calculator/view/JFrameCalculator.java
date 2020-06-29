package com.calculator.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameCalculator extends JFrame implements ActionListener {

	JPanel jpButton, jpResult; // 패널 초기화
	JLabel jlbResult1, jlbResult2; // 레이블 초기화
	JButton[] jbButton = null; // 버튼배열 초기화
	String[] numStr = {
			"MR", "MC", "HIS", "C", "←",
			"x^2", "1/x", "|x|", "exp", "mod",
			"x^3", "(", ")", "n!", "÷",
			"x^n", "7", "8", "9", "×",
			"10^x", "4", "5", "6", "－",
			"log", "1", "2", "3", "＋",
			"ln", "+/-", "0", ".", "=",
			}; // 버튼에 들어갈 값

	public JFrameCalculator(){
		super("5Works_Machinegun"); // 타이틀 바
		getContentPane().setLayout(new BorderLayout()); // 전체 레이아웃을 BorderLayout

		
		/** 레이블 시작 */
		jpResult = new JPanel(new GridLayout(2,1));
                // jpResult라는 패널에 GrideLayot을 적용, 2 x 1
		jpResult.setBackground(Color.WHITE); // jpResult라는 패널에 흰색 배경적용 
		jlbResult1 = new JLabel("", JLabel.RIGHT); 
                // jlbResult1라는 값 없는 레이블, 우측정렬
		jlbResult2 = new JLabel("0", JLabel.RIGHT); 
                // jlbResult2라는 기본값 0인 레이블, 우측정렬
		jlbResult2.setFont(new Font("굴림", Font.BOLD, 20)); 
                // jlbResult2 레이블에 폰트는 굴림, 진하게, 크게20 적용

		jpResult.add(jlbResult1); // jpResult 패널에 jlbResult1 레이블 추가
		jpResult.add(jlbResult2); // jpResult 패널에 jlbResult2 레이블 추가
		/** 레이블 끝 */

		/** 버튼 시작 */
		jpButton = new JPanel(new GridLayout(7, 5, 2, 2)); 
                // jpButton라는 패널, GridLayout적용, 5 x 4, 간격은 가로세로 2씩
		jpButton.setBackground(Color.WHITE); // jpButton 패널 배경은 흰색
		jbButton = new JButton[numStr.length]; // jbButton 버튼 배열 초기화

		// jbButton에 표기할 값들 적용
		for(int i=0; i<numStr.length; i++) {
			jbButton[i] = new JButton(numStr[i]);
			jbButton[i].setFont(new Font("굴림", Font.BOLD, 20));
			jpButton.add(jbButton[i]);
			jbButton[i].addActionListener(this);
		}

		/** 버튼 색 시작 */
		for(int j=0; j<numStr.length; j++) {
			if(j < 5) {
				jbButton[j].setForeground(Color.RED);
			}else if(j==9 || j==14 || j==19 || j==24 || j==29 || j==34 ) {
				jbButton[j].setForeground(Color.BLUE);
			}
		}
		jbButton[0].setForeground(Color.RED);
		/** 버튼 색 끝 */

		getContentPane().add("North", jpResult);
		getContentPane().add("Center", jpButton);
		setSize(485, 606);
		getContentPane().setBackground(Color.WHITE);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	Double[] eqs = {};

	@Override
	public void actionPerformed(ActionEvent e) {
		String btnName = e.getActionCommand();
		
		if (jlbResult2.getText().equals("0")) {
			System.out.println(btnName);
			jlbResult2.setText(btnName);	
		}else {
			jlbResult2.setText(jlbResult2.getText() + btnName);
		}
		
	}
	/** 버튼 이벤트 끝 */

	public static void main(String[] args) {
		
		JFrameCalculator v = new JFrameCalculator();
		
	}

}
