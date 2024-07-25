package pacote.cursodevdojo.javacore.resourcebundle.test;

import java.util.ResourceBundle;
import java.util.Locale; 

public class ResourceBundleTeste01 {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("pt","BR"));
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));
		System.out.println(bundle.getString("warning"));

		bundle = ResourceBundle.getBundle("messages",new Locale("en","US"));
		System.out.println(bundle.getString("hello"));
		System.out.println(bundle.getString("good.morning"));
		System.out.println(bundle.getString("warning"));
		
		
	}

}
