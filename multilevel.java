class animal{
	public void eat(){
				System.out.println("eating");
		}
	}
	class dog extends animal{
			public void bark(){
				System.out.println("barking");
			}
	}
	class puppy extends dog {
			public void cry(){
				System.out.println("crying");
			}
	}
	
	public class multilevel{
		public static void main(String[] args){
		puppy p = new puppy();
		p.eat();
		p.bark();
		p.cry();
		}
	}
		