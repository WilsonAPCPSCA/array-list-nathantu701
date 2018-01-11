import java.util.ArrayList;
public class emperorsNewGrove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> emperorCast = new ArrayList<String>();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		// below is code to modify the list
		emperorCast.remove(1);
		emperorCast.add("");
		emperorCast.set(2,"Chaca");
		emperorCast.set(3,"Tipo");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		//test
		System.out.println(emperorCast);
	}

}
