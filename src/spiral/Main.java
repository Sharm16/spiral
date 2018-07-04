package spiral;

import java.lang.reflect.Array;

public class Main {

	public static void main(String[] args) {

		// 1 = up, 2=right, 3=down, 4=left

		int size = 3;
		spiral(size);
		// going right x++
		// going left x--
		// going up Y++
		// going down y--

	}

	public static void spiral(int size) {

		int numbers[][] = new int[(size * size) - 1][2];
		int x = 0;
		int y = size - 1;
		int i = 0;
		numbers[i][0]=1;
	
		// go right until reach edge x>size

		while (numbers[i][0] <= size) {
			System.out.println(numbers[i][0]);
			System.out.println(size);
			
			if(numbers[i][0] <= size) {
			System.out.println(numbers[i][0]);
			x = x + 1;
			System.out.println(x);
			numbers[i][0] = x;
			
			numbers[i][1] = y;
			i++;
			}
		}
		// down
		while (numbers[i][1] > 0) {
			numbers[i][0] = x;
			numbers[i][1] = y - 1;
			y = y - 1;
		}

		// left
		while (numbers[i][0] > 0) {
			numbers[i][0] = x - 1;
			x = x - 1;
			numbers[i][1] = y;
			i++;

			// up
			while (numbers[i][1] < size) {
				numbers[i][0] = x;
				numbers[i][1] = y + 1;
				y = y + 1;
			}

			System.out.println(numbers);
			// for (int j=0;j<numbers.length;j++) {
			//
			//
			//
			// }

		}

	}
}
