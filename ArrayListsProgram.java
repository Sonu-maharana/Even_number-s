import java.util.*;
class  ArrayListsProgram
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add(123);
		System.out.println(list);
		//String s = (String) list.get(1);
		/* ArrayList<String> list1 = new ArrayList<>();
		list1.add("Hii");
		list1.add("sonu");
		list1.add(2,"hello");
		String s = list1.get(2);
		
		System.out.println(list1);
		System.out.println(s); */
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		List<String> moreFruits = List.of("mango","Orange");
		List<String> cars = List.of("bmw","bugati");
		boolean result = fruits.addAll(moreFruits);
		boolean result1 = fruits.addAll(cars);
		System.out.println(fruits);
		System.out.println(result1);
		fruits.clone();
		//fruits.clear();
		


		System.out.println("After clear : "+fruits);	
		System.out.println(fruits.size());
		System.out.println(fruits.contains("kiwe"));
		System.out.println(fruits.get(3));
	}
}
