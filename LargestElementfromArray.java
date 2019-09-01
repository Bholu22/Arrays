import java.util.*;
public class Main
{
    static void printLargest(Vector<String> ar){
        Collections.sort(ar,new Comparator<String>(){
            public int compare(String x,String y){
                String xy=x+y;
                String yx=y+x;
                return xy.compareTo(yx)>0?-1:1;
            }
        });
        Iterator itr=ar.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Vector<String> ar=new Vector<String>();
		ar.add("60");
		ar.add("546");
		ar.add("548");
		ar.add("50");
		printLargest(ar);
		
	}
}
