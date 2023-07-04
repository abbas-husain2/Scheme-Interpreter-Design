package visitor;

import java.util.HashMap;
import java.util.Map;

public class Environment {
    Map<String, ReturnableValue> hashMap=new HashMap<String,ReturnableValue>();
    Environment linkedEnvironment;
}
