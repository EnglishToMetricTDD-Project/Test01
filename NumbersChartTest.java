package imperialToMetic;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NumbersChartTest
{

	@Test
	public void test()
	{
		ArrayList<Double> grid = new ArrayList<Double>();
		for (Double i = 0.5; i < 999.9; i++)
		{
			grid.add(i);
		}

		System.out.println(grid);

	}

}
