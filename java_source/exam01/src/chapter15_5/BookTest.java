package chapter15_5;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Book implements Externalizable {
	private String name;
	private int price;
	
	public Book() {}
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "책 이름 : " + name + ", 가격 : " + price;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(price);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		price = in.readInt();
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book("자바 프로그래밍 입문", 25000);
		
		try (FileOutputStream fos = new FileOutputStream("book.obj");    
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("book.obj");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			oos.writeObject(book);
			
			Book book1 = (Book)ois.readObject();
			System.out.println(book1);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
