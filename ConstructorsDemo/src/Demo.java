
public class Demo {

	public static void main(String[] args) {
//		Student s = new Student();
//		
//		Student s2 = new Student("Ali", 100);
		
		int []list = {10,20,30,40,50};
		
		for (int i = 0; i < list.length; i++) {
			
			list[i] *= 10; //list[i] = list[i] * 10
		}
		
		for(int item:list)
		{
			
			System.out.print(item  + " ");
		}
		
		String []names = new String[5];
		for(String item:names)
		{
			System.out.print(item + " ");
		}
	}
}
