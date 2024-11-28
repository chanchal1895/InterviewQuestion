package SerializationEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Save s = new Save();
		s.i=10;
		
		File f = new File("Obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream  oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1=(Save)ois.readObject();
		
		System.out.println(obj1.i);
		
	}
	

}


class Save implements Serializable{
	int i;
}