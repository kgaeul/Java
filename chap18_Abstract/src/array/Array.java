package array;

import java.util.ArrayList;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		Animal[] Animal = new Animal[3];

		Animal[0]= new Animal("[토끼]","깡총깡총","당근",5);
		Animal[1]=new Animal("[원숭이]","우끼끼","바나나",7);
		Animal[2]=new Animal("[사자]","으르렁","고기",9);
		
		for(int i=0;i<Animal.length;i++) {
			System.out.println(Animal[i].name +"는 "+ Animal[i].sound+" 소리를 내어요. "
					+ Animal[i].name +"는 "+ Animal[i].먹이 +"을 먹어요. " 
					+ Animal[i].name +"는 "+Animal[i].나이+"살 이에요 ." );
		}
		
		System.out.println("================================");	
		
		List<String>Animal1= new ArrayList<>();
		
		Animal1.add("[토끼]");
		Animal1.add("[원숭이]");
		Animal1.add("[사자]");
						
		for(String Animals : Animal1) {
			System.out.print(Animals+ " ");
		}
	}

	

}
