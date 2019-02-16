import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.BreakIterator;

public class IOUtils {
	private static Reader reader;
	private static BufferedReader bReader;
	private static FileWriter fWriter;

	static {
		try {
			reader = new InputStreamReader(System.in);
			bReader = new BufferedReader(reader);
			fWriter = new FileWriter("test.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean writeIntoFile(String message) throws IOException {
		try {
			fWriter.write(message);
			return true;
		} finally {
			fWriter.close();
		}
	}

	public static String readFromKeyboard() throws IOException {
		String message = bReader.readLine();

		return message;
	}

}
