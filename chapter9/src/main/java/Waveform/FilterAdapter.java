package Waveform;

import apply.Processor;


// ���������ԣ��޷��޸���Ҫʹ�õ���  �ɲ�������������
// �������еĴ��뽫��������ӵ�еĽӿڣ�������������Ҫ�Ľӿ�
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
