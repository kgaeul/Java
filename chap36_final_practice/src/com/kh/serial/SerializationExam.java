package com.kh.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExam {

	public static void main(String[] args) {

		Person p = new Person("kh",30);
		
		try {
			FileOutputStream fileout = new FileOutputStream("person.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
//			Person deSerialPerson = (Person) out.readObject();
			out.writeObject(p);
			out.close();
			fileout.close();
			System.out.println("Perzon 객체가 직렬화되어 person.txt 파일에 저장됨");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		//파일에 객체를 역직렬화 하여 읽어옴
		FileInputStream filein = new FileInputStream("person.txt");
		ObjectInputStream in = new ObjectInputStream(filein);
		Person deSerialPerson = (Person) in.readObject();
		System.out.println("person.txt 파일에서 역직렬화하였습니다.");
		System.out.println("객체정보 : "+deSerialPerson);
		
		in.close();
		filein.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
