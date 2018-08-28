package Ex4;

import java.text.DateFormat;

class Dad{

}

class Son extends Dad{
    protected void print(){System.out.println("Son");}
}


abstract class SecondDad{
    abstract protected void print();
}

class SecondSon extends SecondDad{
    protected void print(){System.out.println("SecondSon");}
}


public class Ex4 {
    //����һ���������� Ȼ��������ת����������
    public static void testPrint(Dad d){
        ((Son)d).print();
    }

    //�����������ͨ���������
    // 1 ��ʼ��˳�� �빹�����ĵ���˳��
    // 2 ����ת��������ת��
    // ���⣺���󷽷�����ͨ���� ����������ͨ������� �ľ�������
    // ԭ�ģ�����������Ҫ���ع����� ���ǿ���ʹ���Ǻ����׵Ľ������������ż̳в�νṹ�����ƶ�
    // ����ex3�е�print�ڳ������еĹ������ĵ���
    // ����ex4�еĻ�����������ת������ü̳��෽��������ת���ڳ������е�ʡ��

    //��̬�󶨻���
    public static void secondTestPrint(SecondDad sd){
        sd.print();
    }

    public static void main(String[] args){
        Son s = new Son();
        Ex4.testPrint(s);

        SecondDad ss = new SecondSon();
        Ex4.secondTestPrint(ss);
    }

}
