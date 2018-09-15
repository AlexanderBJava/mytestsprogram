public class ReceptSalata {
    public static void main(String[] args) {
       /* String plate = "Листья салата, ";
        plate = plate + "соль, ";
        plate = plate + "перец, ";


        plate = plate + blander("помидорки");
        plate = plate + " и все это помешать!!!";
        System.out.printf("Готовый салат:%S%n", plate);*/
int m=85;
double h=1.72;
double i;
i=indeksMass(m,h);
        System.out.printf("Индекс массы тела с массой: %d кг и ростом %.2f м равен %.2f кг на метр в квадрате!%n \n" +
                "Индекс массы тела\tСоответствие между массой человека и его ростом\n" +
                "16 и менее\tВыраженный дефицит массы\n" +
                "16—18.5\t  Недостаточная (дефицит) масса тела\n" +
                "18.5—25   \tНорма\n" +
                "25—30\tИзбыточная масса тела (предожирение)\n" +
                "30—35\tОжирение первой степени\n" +
                "35—40\tОжирение второй степени\n" +
                "40 и более\tОжирение третьей степени (морбидное)%n", m,h,i);

    }

    private static double indeksMass(int m, double h) {
        double result;
        result=m/(h*h);
        return result;



    }

   /* private static String blander(String forBlend) {
        String resultBlend;
        resultBlend = "порезаные " + forBlend;
        return resultBlend;


    }*/


}
