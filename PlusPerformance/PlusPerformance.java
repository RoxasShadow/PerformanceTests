/* Checks the execution time between i++ and ++i in a for loop. */
public class PlusPerformance {
	public void aPlus(int n) {
		for(int i=0; i<n; i++) {}
	}
	public void bPlus(int n) {
		for(int i=0; i<n; ++i) {}
	}
	public static void main(String[] args) {
		PlusPerformance lol = new PlusPerformance();
		long start;
		long end;
		long tot;
		int n = 300;

		tot = 0;
		for(int i=0; i<n; i++) {
			start = System.nanoTime();
			lol.aPlus(n);
			end = System.nanoTime();
			tot += end-start;
		}
		System.out.println("\ni++ ("+n+" * "+n+").");
		System.out.println("\tExecution time: "+(tot/n)+" ms.\n");

		tot = 0;
		for(int i=0; i<n; i++) {
			start = System.nanoTime();
			lol.bPlus(n);
			end = System.nanoTime();
			tot += end-start;
		}
		System.out.println("++i ("+n+" * "+n+").");
		System.out.println("\tExecution time: "+(tot/n)+" ms.\n");
	}
}
