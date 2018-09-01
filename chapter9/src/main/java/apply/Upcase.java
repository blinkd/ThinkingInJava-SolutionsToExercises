package apply;

import Waveform.StringProcessor;

public class Upcase extends StringProcessor {
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
