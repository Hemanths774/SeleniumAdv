package Generic;

public class Runner {
	public static void main(String[] args) {
		String Val1 = dataTesting.getdata("Sheet1", 3, 0);
		System.out.println(Val1);
		String Val2 = dataTesting.getdata("Sheet2", 3, 0);
		System.out.println(Val2);
		String val3 = dataTesting.getdata("Sheet3", 3, 0);
		System.out.println(val3);
	}

}
