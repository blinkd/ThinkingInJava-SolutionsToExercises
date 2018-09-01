package Waveform;

import apply.Processor;


// 适配器策略：无法修改想要使用的类  可采用适配器策略
// 适配器中的代码将接受你所拥有的接口，并产生你所需要的接口
class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    public String name(){return filter.name();}
    public Waveform process(Object input){
        return filter.process((Waveform)input);
    }

}
