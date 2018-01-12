import java.util.Random;
import java.util.ArrayList;
public class randomZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		ArrayList<Integer> numsRandom = new ArrayList<Integer>();
		//initialize the size
		for (int i =0; i<10;i++) {
			numsRandom.add(0);
		}
		//fill array with random number
		for(int i =0; i<numsRandom.size(); i++) {
			numsRandom.set(i,(int)(Math.random()*100) );
		}
		System.out.print("Random List: ");
		System.out.println(numsRandom);
		// reassign all elements to 0
		for(int i = 0; i<numsRandom.size();i++) {
			numsRandom.set(i, 0);
		}
		System.out.print("Modified List: ");
		System.out.println(numsRandom);
	}

}
