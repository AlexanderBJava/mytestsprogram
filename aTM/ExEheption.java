package aTM;

public class ExEheption {


    public void test() {
        try {
            doFukingTest();
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("ERROR "+e.getMessage()+" !!!!");
        }
    }

    private void doFukingTest() throws Exception {
    String[] month=new String[12];
    month[14]="Uhu";
        Exception exeption=new 	Exception("month out of limit (12)");						//	Exeption(“Вот это вот и выводит”);
    throw exeption;
    }
}
