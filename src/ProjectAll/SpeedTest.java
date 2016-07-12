package ProjectAll;


import java.util.*;

public class SpeedTest

{

    public static void main(String[] args)
    {
        int[] mas = new int[1000000];
        HashSet<Integer> hash = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> link = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();


        Date data1 = new Date();
        for (int i = 0; i < 1000000; i++)
        {
            mas[i] = i;
        }
        Date data2 = new Date();
        System.out.println("В обычный массив заносим за " + (data2.getTime() - data1.getTime()));


        Date data3 = new Date();
        for (int i = 0; i < 1000000; i++)
        {
            hash.add(i);
        }
        Date data4 = new Date();
        System.out.println("В HashSet заносится за " + (data4.getTime() - data3.getTime()));


        Date data5 = new Date();
        for (int i = 0; i < 1000000; i++)
        {
            map.put(i, i);
        }
        Date data6 = new Date();
        System.out.println("В HeshMap заносится за " + (data6.getTime() - data5.getTime()));


        Date data7 = new Date();
        for (int i = 0; i < 1000000; i++)
        {
            link.add(i);
        }
        Date data8 = new Date();
        System.out.println("В LinkedList заносится за " + (data8.getTime() - data7.getTime()));


        Date data9 = new Date();
        for (int i = 0; i < 1000000; i++)
        {
            array.add(i);
        }
        Date data10 = new Date();
        System.out.println("В ArrayList заносится за " + (data10.getTime() - data9.getTime()));




        Date data11 = new Date();
        for(int i=0;i<mas.length;i++){
            int a=mas[i];
        }
        Date data12 = new Date();
        System.out.println("Гет из обычного массива "+(data12.getTime()-data11.getTime()));


        Iterator<Integer> iterator1 = hash.iterator();
        Date data13 = new Date();
        while(iterator1.hasNext()){
            int b = iterator1.next();
        }
        Date data14 = new Date();
        System.out.println("Гет из HeshSet "+(data14.getTime()-data13.getTime()));


        Iterator<Map.Entry<Integer,Integer>> iterator2 = map.entrySet().iterator();
        Date data15 = new Date();
        while(iterator2.hasNext()){
            int a = iterator2.next().getKey();
        }
        Date data16 = new Date();
        System.out.println("Гет из HeshMap "+(data16.getTime()-data15.getTime()));





        Date data19 = new Date();
        for(int i=0;i<array.size();i++){
            int a = array.get(i);
        }
        Date data20 = new Date();
        System.out.println("Гет из ArrayList "+(data20.getTime()-data19.getTime()));

        /*Date data17 = new Date();
        for(int i=0;i<link.size();i++){
            int a = link.get(i);
        }
        Date data18 = new Date();
        System.out.println("Гет из линкеда "+(data18.getTime()-data17.getTime()));*/
        System.out.println("Гет из LinkedList ОЧЕНЬ ДОЛГО");










    }


}