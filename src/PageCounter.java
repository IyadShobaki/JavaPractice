//Hacker Rank
public class PageCounter {

	public static void main(String[] args) {
		System.out.println(pageCount(5, 4));

	}
	public static int pageCount(int n, int p) {
		if(n % 2 != 0) {
			n = n -1;
		}
		if(p == 1 || p == n) {
			return 0;
		}
		
		int lr = 2;
		int r = 0;
		while(lr <= p) {
			r++;
			lr+=2;
		}
		
		int rl = n -1;
		int l = 0;
		while(rl >= p) {
			l++;
			rl-=2;
		}
		System.out.println(r);
		System.out.println(l);
		if(l < r) {
			return l;
		}else {
			return r;
		}
		
		
		
    }
}
