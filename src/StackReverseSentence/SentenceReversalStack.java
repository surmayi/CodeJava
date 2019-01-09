package StackReverseSentence;

import java.util.LinkedList;

public class SentenceReversalStack {

	public static void main(String[] args) {
		String sentence ="This is a sentence";
		LinkedList<String> word = new LinkedList<String>();
		LinkedList<String> reversed = new LinkedList<String>();
		
		for(int i=0;i<sentence.length();i++) {
			String tmp = String.valueOf(sentence.charAt(i));
			if(tmp.equals(" ")) {
				if(!word.isEmpty()) {
					while(!word.isEmpty()) {
						reversed.push(word.pop());
					}
					reversed.push(" ");
				}
			}
			else {
				word.push(tmp);
			}
		}
		while(!word.isEmpty()) {
			reversed.push(word.pop());
		}
		String str ="";
		while(!reversed.isEmpty()) {
			str=str+reversed.pop();
		}
		System.out.println(str);
	}

}
