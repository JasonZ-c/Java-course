package firstJavaProject;

public class MultiplicationTable {
	void printMultiplicationTable() {
		printMultiplicationTable(1,4,7);
	}
	void printMultiplicationTable(int table,int start, int end) {
		for(int i=start;i<end;i++) {
			System.out.printf("%d*%d=%d",table,i,table*i).println();;
		}
	}
}
