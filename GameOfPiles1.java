import java.util.Scanner;


class CodeChefCC {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		while(t-- > 0){
			n = sc.nextInt();
			long pile[] = new long[n];
			for(int i=0; i<n; i++){
				pile[i] = sc.nextLong();
			}
			long max = pile[0], min = pile[0];
			for(long i : pile){
				if(i > max){
					max = i;
				}
				else if(i < min){
					min = i;
				}
			}
			long turn = 0, pos = 0;
			if(min == 1) System.out.println("CHEF");
			else{
				for(int i=0; i<n; i++){
					if(pile[i] > 2){
						turn = turn + (pile[i]-2);
					}
				}	
				if(turn%2==0) System.out.println("CHEFINA");
				else System.out.println("CHEF");
			}
		}
		
	}         

}          
