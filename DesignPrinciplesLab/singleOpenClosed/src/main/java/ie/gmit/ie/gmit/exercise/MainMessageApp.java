package ie.gmit.exercise;

import java.io.IOException;

public class MainMessageApp {

	public static void main(String[] args) throws IOException {

		Message msg = new Message("This is a message");
		MessagePrinter printer = new MessagePrinter();
		printer.writeMessage(msg, "test_msg.txt");
	}

}
