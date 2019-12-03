import java.util.HashMap;
import java.util.Map;

//HackerRank, Day 8 of code tutorial
public class DictionaryPractice {

	public static void main(String[] args) {
		// English to Spanish Dictionary
		Map<String, String> englSpanDictionary = new HashMap<>();
		englSpanDictionary.put("Monday", "Lunes");
		englSpanDictionary.put("Tuesday", "Martes");
		englSpanDictionary.put("Wednesday", "Miercoles");
		englSpanDictionary.put("Thursday", "Jueves");
		englSpanDictionary.put("Friday", "Viernes");
		
		System.out.println(englSpanDictionary.get("Monday"));
		System.out.println(englSpanDictionary.get("Tuesday"));
		System.out.println(englSpanDictionary.get("Wednesday"));
		System.out.println(englSpanDictionary.get("Thursday"));
		System.out.println(englSpanDictionary.get("Friday"));
		
		System.out.println(englSpanDictionary.keySet());
		
		System.out.println(englSpanDictionary.values());
		
		System.out.println(englSpanDictionary.size());
		
		 
		System.out.println();
		System.out.println();
		
		//Shopping list
		Map<String, Boolean> shoppingList = new HashMap<>();
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", true);
		shoppingList.put("Oreos", true);
		shoppingList.put("Eggs", false);
		shoppingList.put("Sugar", false);
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Sugar"));
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
		
		shoppingList.remove("Eggs");
		
		
		shoppingList.replace("Bread", false);
		System.out.println(shoppingList.toString());
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
	}

}
