/**
 * 
 */
package in.thirumal.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author thirumal
 *
 */
public interface LamdaInterface {

	default <M> List<M> filter(List<M> list, Predicate<M> p) {
		List<M> result = new ArrayList<>();
		for (M m : list) {
			if (p.test(m)) {
				result.add(m);
			}
		}
		return result;
	}
	
}
