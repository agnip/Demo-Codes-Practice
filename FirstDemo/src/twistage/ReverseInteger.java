package twistage;

public class ReverseInteger {

	public static void reverse(int x) {

		try {
			if (x < 0) {
				int y = x * -1;
				String newi = String.valueOf(y);
				StringBuffer a = new StringBuffer(newi);
				StringBuffer b = a.reverse();
				String result = b.toString();
				int l = Integer.parseInt(result);
				int finalresult = l * -1;
				System.out.println("output is : " + finalresult);

			} else if (x < 10) {

				System.out.println("output is : " + x);

			} else if (x == 0) {
				System.out.println("output is : " + x);
			}

			else {
				String newi = String.valueOf(x);
				StringBuffer a = new StringBuffer(newi);
				StringBuffer b = a.reverse();
				String result = b.toString();
				int y = Integer.parseInt(result);
				System.out.println("output is : " + y);

			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		int x = 0;
		reverse(x);

	}

}
