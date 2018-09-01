package apply;

public interface Processor {
    String name();
    Object process(Object input);
}
