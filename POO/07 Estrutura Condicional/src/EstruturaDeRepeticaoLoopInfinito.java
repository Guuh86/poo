
public class EstruturaDeRepeticaoLoopInfinito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(;;) {
			System.out.println("Loop Infinito");
			}
			*/
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i > 5) {
				break;
				/* if (i % 2 == 0){
				 * continue;
				 * }
				 * System.out.println(i);
				 */
			}
		}
		

	}

}
