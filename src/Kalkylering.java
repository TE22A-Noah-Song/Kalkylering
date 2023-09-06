public class Kalkylering {
    public static void main(String[] args) throws Exception {
        int tal1=23;
        int tal2=45;
        double tal3=15;
        double tal4=4;
        int summa;
        int differens;
        int produkt;
        double kvot;
        summa=tal1+tal2;
        differens=tal1-tal2;
        produkt=tal1*tal2;
        kvot=tal3/tal4;
        System.out.println(tal1+"+"+tal2+"="+summa);
        System.out.println(tal1+"-"+tal2+"="+differens);
        System.out.println(tal1+"*"+tal2+"="+produkt);
        System.out.println(tal3+"/"+tal4+"="+kvot);
        int rest1 = 15%2;
        int rest2 = 8%3;
        System.out.println("Resten av 15/2 är "+rest1);
        System.out.println("Resten av 8/3 är "+rest2);

    }
}
