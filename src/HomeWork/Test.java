package HomeWork;

public class Test {
    @org.junit.Test
    public void ceshi(){
        String buffer1 = new String("12");
        String buffer2 = new String("12");
        StringBuffer buffer = new StringBuffer("12 12 13 ");
        int index = buffer.indexOf("12");
        System.out.println(buffer2.equals(buffer1));
        do {
            buffer.delete(index,index+3);
        }while (buffer.substring(index,index+3).equals("12 "));
        System.out.println(buffer);

    }
}
