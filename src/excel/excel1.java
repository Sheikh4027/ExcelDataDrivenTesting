package excel;


	import java.io.IOException;
	import java.util.ArrayList;

	public class excel1 {

		public static void main(String[] args) throws IOException {
			
			
			dataDriver1 d =new dataDriver1();
			ArrayList data =d.getData("Id");
		
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));

		}
	}
	

