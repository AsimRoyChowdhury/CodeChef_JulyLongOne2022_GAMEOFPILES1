
import java.util.Scanner;


class CodeChefCC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, pile[];
		while(t-- > 0){
			n = sc.nextInt();
			pile = new int[n];
			for(int i=0; i<n; i++){
				pile[i] = sc.nextInt();
			}
			int max = pile[0], min = pile[0];
			for(int i : pile){
				if(i > max){
					max = i;
					
				}
				else if(i < min){
					min = i;
				}
			}
			int turn = 0, pos = 0;
			if(min == 1) System.out.println("CHEF");
			else{
				while(max>2){
					for(int i=0; i<n; i++){
						if(pile[i] >= max){
							pos = i;
						}
					}
					pile[pos]--;
					max = pile[pos];
					turn++;
				}
				if(turn%2==0) System.out.println("CHEFINA");
				else System.out.println("CHEF");
			}
		}
		
	}         

}          
