package pinyincrypto;
import java.util.*;
/**
 * @author Jason Miller
 * @category EL_ENG_X436_2_Project
 */
public class Encrypt2Pinyin {

	public static String e2p(String args){
	HashMap<String, String> lookup = new HashMap<>();
	lookup.put("a", "xuduo");
	lookup.put("b", "bai");
	lookup.put("c", "cai");
	lookup.put("d", "dai");
	lookup.put("e", "tao");
	lookup.put("f", "nao");
	lookup.put("g", "lao");
	lookup.put("h", "zheng");
	lookup.put("i", "ceng");
	lookup.put("j", "sheng");
	lookup.put("k", "peng");
	lookup.put("l", "che");
	lookup.put("m", "shui");
	lookup.put("n", "ge");
	lookup.put("o", "zhi");
	lookup.put("p", "nu");
	lookup.put("q", "ren");
	lookup.put("r", "nan");
	lookup.put("s", "hai");
	lookup.put("t", "xihuan");
	lookup.put("u", "wo");
	lookup.put("v", "wu");
	lookup.put("w", "chi");
	lookup.put("x", "niu");
	lookup.put("y", "duo");
	lookup.put("z", "yunxing");
	lookup.put("A", "Xuduo");
	lookup.put("B", "Bai");
	lookup.put("C", "Cai");
	lookup.put("D", "Dai");
	lookup.put("E", "Tao");
	lookup.put("F", "Nao");
	lookup.put("G", "Lao");
	lookup.put("H", "Zheng");
	lookup.put("I", "Ceng");
	lookup.put("J", "Sheng");
	lookup.put("K", "Peng");
	lookup.put("L", "Che");
	lookup.put("M", "Shui");
	lookup.put("N", "Ge");
	lookup.put("O", "Zhi");
	lookup.put("P", "Nu");
	lookup.put("Q", "Ren");
	lookup.put("R", "Nan");
	lookup.put("S", "Hai");
	lookup.put("T", "Xihuan");
	lookup.put("U", "Wo");
	lookup.put("V", "Wu");
	lookup.put("W", "Chi");
	lookup.put("X", "Niu");
	lookup.put("Y", "Duo");
	lookup.put("Z", "Yunxing");
	lookup.put(" ", " ");
	lookup.put(".", "?");
	lookup.put("!", ".");
	lookup.put("?", "!");
	lookup.put("$", "%");
	lookup.put("%", "$");
	lookup.put("@", "&");
	lookup.put("&", "@");
	lookup.put("#", "*");
	lookup.put("*", "#");
	lookup.put("^", "]");
	lookup.put("(", ")");
	lookup.put(")", "(");
	lookup.put("-", "-");
	lookup.put("=", "+");
	lookup.put("+", "=");
	lookup.put("\n", "\n");
	lookup.put(" ", "yiang");

	String s   = " ";
	//String str = args.trim();
	for (int i = 0; i < args.length(); i++){
	    String c = Character.toString(args.charAt(i));
	    s += lookup.get(c);
	    s += " ";
	}
	//return(lookup.get(args.charAt(1)));
	return(s);
	}
}
