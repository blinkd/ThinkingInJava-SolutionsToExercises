package apply;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Apply {
    //����ת����������÷���

    //����ģʽ  ���������ݵĲ�������ͬ�����в�ͬ��Ϊ�ķ��� ��Ϊ����ģʽ
    //���
    public static void process(Processor p, Object s){
        println("Using Processor  " + p.name() );
        System.out.println(p.process(s));
    }
}
