package controller;

import java.util.Random;

import javax.swing.JTextField;

import view.Main;
public class Thread_3 extends Thread {
	
	JTextField tfNum3;
	int limite =0;
	public Thread_3(JTextField tfNum3, int limite) {
		
		this.tfNum3 = tfNum3;
		this.limite = limite;
		
	}
	
	public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int i = 0 ;
		int num =0;
		Random geradorNum = new Random();
		while(i<limite){
			num = geradorNum.nextInt(8);
			tfNum3.setText(Integer.toString(num));
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}