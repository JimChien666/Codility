
public class MySolution {
	public static int sulation(int[] A){
	    int shineTimes = 0;
	    int currentMax = 0;
	    for(int index=0;index<A.length;index++){
	    	currentMax = Math.max(currentMax, A[index]-1);
	        if(index==currentMax){
	            shineTimes++;
	        }
	    }
	    return shineTimes;
	}
	public static void main(String[] args) {
		System.out.println(MySolution.sulation(new int[] {2, 1, 3, 5, 4}));
		System.out.println(MySolution.sulation(new int[] {2, 3, 4, 1, 5}));
		System.out.println(MySolution.sulation(new int[] {1, 3, 4, 2, 5}));
		
	}
}
