package lesson8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class StringCalculation {
    public String result (String expression) {
        ScriptEngineManager sem = new ScriptEngineManager();
        ScriptEngine engine = sem.getEngineByExtension("js");

        try {
            return engine.eval(expression).toString();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return "error";
    }
}
