package oop.pratice.v3;

import oop.pratice.v1.InkType;
import oop.pratice.v1.Pen;

import java.lang.reflect.Constructor;

public class PenFactory {

	public static Pen getPen(String maker, String name, String color, InkType ink) {
		Pen newPen = null;
		try {
			Class cls = DemoApp.class;
			PenClass pc = (PenClass)cls.getDeclaredAnnotation(PenClass.class);

			Class<?> t = Class.forName(pc.name());
			Constructor<?> constructor = t.getConstructor(String.class, String.class, String.class, InkType.class);
	
			newPen = (Pen)constructor.newInstance(maker, name, color, ink);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newPen;
	}
}
