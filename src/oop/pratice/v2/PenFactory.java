package oop.pratice.v2;

import oop.pratice.v1.InkType;
import oop.pratice.v1.Pen;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class PenFactory {	
	public static Pen getPen(String maker, String name, String color, InkType ink) {
		Pen newPen = null;
		try {
			FileReader resources= new FileReader("pen.properties");
			Properties p = new Properties();
			p.load(resources);

			Class<?> t = Class.forName(p.getProperty("pen.type"));
			Constructor<?> constructor = t.getConstructor(String.class, String.class, String.class, InkType.class);
	
			newPen = (Pen)constructor.newInstance(maker, name, color, ink);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newPen;
	}
}