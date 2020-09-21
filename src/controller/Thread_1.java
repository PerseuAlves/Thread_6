package controller;

import java.util.Random;

import javax.swing.JTextField;

import view.Main;

public class Thread_1 extends Thread {

	JTextField tfNum1;
	int limite = 0;

	public Thread_1(JTextField tfNum1, int limite) {
		this.tfNum1 = tfNum1;
		this.limite = limite;

	}

	public void run() {

		int i = 0;
		int num = 0;

		Random geradorNum = new Random();
		while (i < limite) {

			num = geradorNum.nextInt(8);
			tfNum1.setText(Integer.toString(num));

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}