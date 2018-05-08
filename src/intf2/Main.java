package intf2;

import java.util.Arrays;

public class Main {
	static class TaskGoodBy implements Runnable {

		@Override
		public void run() {
			System.out.println("GoodBy");

		}

	}
	
	private static Runnable __task1 = new Runnable() { // private class NU_SE_STIE extends Object implements Runnable
		
		@Override
		public void run() {
			System.out.println("Dynamic message in static var with anonymous class");
			
		}
	};
	private static Runnable __task2 = () -> System.out.println("Dynamic message in static var with LAMBDA");
	
	static abstract class AbstractTask1 implements Runnable { 
		
	}
	
	static class Task2Class implements Runnable {

		@Override
		public void run() {
			System.out.println("NASPA - NU ASTA VREAU EXECUTAT");
		}
		
	}

	public static void main(String[] args) {
		TaskExecutor te = new TaskExecutor();
		Runnable t1 = new TaskBonjour();
		te.execute(t1);
		te.execute(new Main.TaskGoodBy());
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Dynamic message");
			}
		};
		te.execute(t2);
		te.execute(() -> {
			System.out.println("BAU");
			});
		te.execute(__task1);
		te.execute(__task2);
		AbstractTask1 t3 = new AbstractTask1() { // private class NU_SE_STIE extends AbstractTask1 // implements Runnable (via inheritance)
			
			@Override
			public void run() {
				System.out.println("Message from AbstractTask1");
				
			}
		};
		te.execute(t3);
		Task2Class t4 = new Task2Class() {
			@Override
			public void run() {
				System.out.println("ASTA VOIAM");
				xxx();
			}
			
			/**
			 * Folositi in loc metoda yyyy
			 */
			@Deprecated
			void xxx() {
				
			}
			
			void yyy() {
				
			}
		};
		te.execute(t4);
		
		IntArrayHolder iah = new IntArrayHolder() {
			{
				mValue = new int[10];
				mValue[0] = 1;
				mValue[9] = 99;
			}
			
			
		};
		iah.printContent();
		iah = new IntArrayHolder() {
			{
				this.mValue = new int[10];
				mValue[0] = -1;
				mValue[9] = -99;
			}
			
			@Override
			public void printContent( ) {
				System.out.println("MODICAT:" + Arrays.toString(mValue));
				super.printContent();
			}
			
			
		};
		iah.printContent();

	}

}
