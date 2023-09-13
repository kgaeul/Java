package com.kh.api.exam1;

public class StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer stm =new StringTokenizer();
	
		}
		public void STExam() {
				
		}
		public void STExam2	() {
			String text = "apple,banana,grape,orange";
			StringTokenizer tokenizer = new StringTokenizer(text , ",");
			
			while(tokenizer.hasMoreTokens()) {
				String fruit = tokenizer.nextToken();
				System.out.println(fruit);
			}
					
		}
		
		public void STExam3	() {
			String text = "";
			StringTokenizer tokenizer = new StringTokenizer();
			
			
		}
}
