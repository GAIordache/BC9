package intf1;

public class PrivateIntfClass {
	public static interface MyInf {
		void pufi();
		
		default void doNimic() { System.out.println("Bau");};
		
		public static void sm() {
			
		}
	}
	
	class Ex1 implements MyInf {
		// $$ PrivateIntfClass.this
		int x;

		@Override
		public void pufi() {
			// TODO Auto-generated method stub
			System.out.println(PrivateIntfClass.this.x);
		}
		
	}
	
	private int x;
	
	// PrivateIntfClass
	Ex1 createEx1Instance() {
		return new Ex1();
	}
	
	static void test() {
		intf1.PrivateIntfClass.MyInf.sm();
		Ex1 e1 = new PrivateIntfClass().new Ex1();
		PrivateIntfClass p1 = new PrivateIntfClass();
		e1 = p1.new Ex1();
	}
}


