package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public int inputNumber() throws IOException, NumberFormatException {
		String input = br.readLine();
		return Integer.parseInt(input);
	}

}
