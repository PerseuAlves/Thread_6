package controller;

import java.util.Random;

import javax.swing.JTextField;

import view.Main;

public class Thread_2 extends Thread {

	JTextField tfNum2;
	int limite = 0;

	public Thread_2(JTextField tfNum2, int limite) {

		this.tfNum2 = tfNum2;
		this.limite = limite;

	}

	public void run() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int i = 0;
		int num = 0;

		Random geradorNum = new Random();
		while (i < limite) {
			num = geradorNum.nextInt(8);
			tfNum2.setText(Integer.toString(num));
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}