//multi level inheritance
class animal{
	public void eat()
		{
			System.out.println("eating");
		}
	}
	class humanbeing{
			public void eat(){
				System.out.println("eating");
			}
	}
	class man extends animal,humanbeing {
			public void run(){
				System.out.println("running");
			}
	}
	
	public class multiple{
		public static void main(String[] args){
		man m = new man();
		m.run();
		m.eat();
		}
	}
	//in java multiple inheritance does not support so it gives u error