import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.lang.String;

public class Strings {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String S="";
		String S = "Коля Болокан,/    компьютер Я!\"№;% как %:?*( ты комплимент";
		int count = 0;	
		int count2=0;
		String[] words = S.split("[,/\\s!\"№;%:?*()_+=-]+");
		 Arrays.sort(words,String::compareToIgnoreCase);
		 
		System.out.println("Строка: ");
		System.out.println(S);
		for (String word : words) {
			System.out.print(word);
			System.out.println("(" + word.length() + ")");
			count++;
		}
		for(String word : words) {
			if(word.toLowerCase().startsWith("комп")) {
				 count2++;
			}
		}
	
		System.out.println("Количество слов: " + count);
		System.out.println("Количество слов, начинающихся на \"Комп\": "+count2);
		

	}

}
