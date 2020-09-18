package iof;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class FCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream finput = new DataInputStream(
				new URL("http://pic1.win4000.com/pic/1/5c/b19b23087f.jpg").openStream());
		FileOutputStream foutput = new FileOutputStream(new File("D:\\aaa.jpg"));
		byte[] buffer = new byte[1024];
		int length;
		while ((length = finput.read(buffer)) > 0) {
			foutput.write(buffer, 0, length);
			;
		}
		finput.close();
		foutput.close();
	}

}
