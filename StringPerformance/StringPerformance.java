/* Checks the execution time between <String> concatenation and <StringBuilder> concatenation. */
public class StringPerformance {
	public void stringConcat(int n) {
		String string = "";
		for(int i=0; i<n;  ++i)
			string += "LOL ";
		String ex = string;
	}
	public void stringBuilderConcat(int n) {
		StringBuilder string = new StringBuilder("");
		for(int i=0; i<n;  ++i)
			string.append("LOL ");
		String ex = string.toString();
	}
	public static void main(String[] args) {
		StringPerformance lol = new StringPerformance();
		long start;
		long end;
		long tot;
		int n = 300;
		int min = 10;
		int max = 100;

		tot = 0;
		for(int i=0; i<n; ++i) {
			start = System.nanoTime();
			lol.stringConcat(min);
			end = System.nanoTime();
			tot += end-start;
		}
		System.out.println("\nString ("+min+" concat * "+n+").");
		System.out.println("\tExecution time: "+(tot/n)+" ms.\n");

		tot = 0;
		for(int i=0; i<n; ++i) {
			start = System.nanoTime();
			lol.stringBuilderConcat(min);
			end = System.nanoTime();
			tot += end-start;
		}
		System.out.println("StringBuilder ("+min+" concat * "+n+").");
		System.out.println("\tExecution time: "+(tot/n)+" ms.\n");

		tot = 0;
		for(int i=0; i<n; ++i) {
			start = System.nanoTime();
			lol.stringConcat(max);
			end = System.nanoTime();
			tot += end-start;
		}
		System.out.println("String ("+max+" concat * "+n+").");
		System.out.println("\tExecution time: "+(tot/n)+" ms.\n");

		tot = 0;
		for(int i=0; i<n; ++i) {
			start = System.nanoTime();
			lol.stringBuilderConcat(max);
			end = System.nanoTime();
			tot += end-start;
		}
		System.out.println("StringBuilder ("+max+" concat * "+n+").");
		System.out.println("\tExecution time: "+(tot/n)+" ms.\n");
	}
}
