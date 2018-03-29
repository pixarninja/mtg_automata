import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Action {

	private int type;
	private String data;
	private static final Map<String, String> table; //key: state, value: action
	static {
        Map<String, String> map = new HashMap<String, String>();
        map.put("state", "action");
        table = Collections.unmodifiableMap(map);
    }
	
	public Action(String state) {
		//TODO: initialize type and data based on action table
		data = table.get(state);
	}
	
}
