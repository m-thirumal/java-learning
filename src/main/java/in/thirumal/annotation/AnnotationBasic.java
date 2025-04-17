/**
 * 
 */
package in.thirumal.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 */
public class AnnotationBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plant plant = new Plant();
		Animal animal = new Animal();
		if (plant.getClass().isAnnotationPresent(SampleAnnotation.class)) {
			System.out.println("Plant is annotated");
		} else {
			System.out.println("Plant is not annotated");
		}
		if (animal.getClass().isAnnotationPresent(SampleAnnotation.class)) {
			System.out.println("Animal Class is annotated");
			SampleAnnotation sampleAnnotation = animal.getClass().getAnnotation(SampleAnnotation.class);
			System.out.println(sampleAnnotation.fast());
		} else {
			System.out.println("Animal class is not annotated");
		}
	}

}


class Plant {
	void food() {
		System.out.println("Water, Co2, SunLight");
	}
}

@SampleAnnotation(fast = 100)
class Animal {
	void food() {
		System.out.println("Meat, Plant, Water");
	}
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface SampleAnnotation {
	int fast();
}