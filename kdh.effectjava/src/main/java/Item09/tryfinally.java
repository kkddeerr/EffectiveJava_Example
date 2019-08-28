package Item09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;

public class tryfinally {
	
	static void copy(String src, String dst) throws Exception {
		FileInputStream in = new FileInputStream(src);
		try {
			FileOutputStream out = new FileOutputStream(dst);
			try {
				throw new FileNotFoundException();
//				byte[] buf = new byte[2048];
//				int n;
//				while ((n = in.read(buf)) >= 0 )
//					out.write(buf,0,n);
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				out.close();
				throw new IOException();
			}
		} catch(Exception e) { 
			e.printStackTrace();
		} 
		finally {
			in.close();
		}
	}
	
	static String firstLineOfFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(Path));
		try {
			return br.readLine();
		} finally {
			br.close();
		}
	}
}
