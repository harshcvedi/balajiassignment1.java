 public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

		long N= scn.nextLong();

		long[] arr = new long[18];

		int count = 0;

		while (N != 0) {
			long rem = N % 10;
			arr[count] = rem;
			count++;
			N = N / 10;
		}

		// count will tell total no. of digits

		for (int i = 0; i < count; i++) {

			if (i != count - 1) {
				if (arr[i] >= 5) {
					arr[i] = 9 - arr[i];
				}
			} else {
				if (arr[i] >= 5 && arr[i] <= 8) {
					arr[i] = 9 - arr[i];
				}
			}
		}

		for (int i = count - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
