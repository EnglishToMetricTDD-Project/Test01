package imperialToMetic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InteractionTest extends NumbersChart
{

	@Test
	public void test()
	{
		Io iO = new Io();

		String inputMessage = "please enter a number";
		String outputMessage = "this is the number";
		validateNumber(iO.Input(inputMessage));
		Io.display(outputMessage + getNumber());

	}
}
