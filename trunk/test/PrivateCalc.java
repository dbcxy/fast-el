import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;

public class PrivateCalc {
	public static void main(String[] args) {
		FelEngine fel = FelEngine.instance;
		Object re = fel.eval("'abc'.indexOf('bc')");
		System.out.println(re);
		fel.getContext().set("t", "ABCDE");
		String str = "'A' == 'A' || 'B' == 'B' && 'ABCD' == t &&  'A' == 'A'";
		Expression r = fel.compile(str, fel.getContext());
		System.out.println(r.eval(fel.getContext()));
		System.out.println(fel.eval(str));
		boolean b = 'A' == 'A' || 'B' == 'B' && 'A' == 'A' && 'A' == 'A';
		System.out.println(b);

	}
}
