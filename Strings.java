import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.lang.String;

public class Strings {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String S="";
		String S = "���� �������,/    ��������� �!\"�;% ��� %:?*( �� ����������";
		int count = 0;	
		int count2=0;
		String[] words = S.split("[,/\\s!\"�;%:?*()_+=-]+");
		 Arrays.sort(words,String::compareToIgnoreCase);
		 
		System.out.println("������: ");
		System.out.println(S);
		for (String word : words) {
			System.out.print(word);
			System.out.println("(" + word.length() + ")");
			count++;
		}
		for(String word : words) {
			if(word.toLowerCase().startsWith("����")) {
				 count2++;
			}
		}
	
		System.out.println("���������� ����: " + count);
		System.out.println("���������� ����, ������������ �� \"����\": "+count2);
		

	}

}
