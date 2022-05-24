import java.util.Scanner;
import java.util.Random; //changed

public class FinalExam{
	public static void main (String[] args) { //changed
		Scanner input = new Scanner(System.in); //changed

		System.out.print("Enter the amount of times a pair of dice will roll: ");
		int times = input.nextInt(); //changed
		
		int[][] dicePairs = rollDicePairs(times); //changed
		System.out.println("The rolled pairs of numbers are:");
		printDicePairs(dicePairs);
		
		System.out.println("The sum of each pairs of numbers are:");
		int[] dicePairsSums = addDicePairs(dicePairs); //changed
		printDicePairsSum(dicePairsSums); //changed

	}

	public static int[][] rollDicePairs(int times){ //changed
		int[][] dice = new int[times][2];
		Random die = new Random();
		
		for(int x=0; x<times;x++){
			for(int y=0; y<2; y++){
				dice[x][y] = 1+die.nextInt(6);
			}
		}
		
		return dice;
	}
	
	public static void printDicePairs(int[][] dicePairs){
		for(int[] pair: dicePairs){
			for(int roll: pair){
				System.out.print(roll+" ");
			}
			System.out.println("");
		}
	}
	
	public static int[] addDicePairs(int [][] dicePairs){ //changed
		int[] pairSums = new int[dicePairs.length];
		for(int x=0; x<pairSums.length; x++){
			int sum = 0;
			for(int y=0; y<dicePairs[x].length; y++){
				sum+= dicePairs[x][y];
				pairSums[x] = sum; //transferred and changed
			}
		}
		return pairSums;
	}
	
	public static void printDicePairsSum(int[] dicePairsSums){
		for(int sum: dicePairsSums){
			System.out.print(sum + " "); //changed
		}
	}
}
        
    

