package pl.Szymanek;

import pl.Szymanek.Classes.Address;
import pl.Szymanek.Classes.Platoon;
import pl.Szymanek.Classes.Soldier;
import pl.Szymanek.Classes.Squad;
import pl.Szymanek.Enums.Rank;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Soldier a=new Soldier("Test1","Test1", LocalDate.of(1995,10,02),new Address(), Rank.OR01);
        Soldier b=new Soldier("Test2","Test2", LocalDate.of(1995,10,02),new Address(),Rank.OR01);
        Soldier c=new Soldier("Test3","Test3", LocalDate.of(1995,10,02),new Address(),Rank.OR01);
        Soldier d=new Soldier("Test4","Test4", LocalDate.of(1995,10,02),new Address(),Rank.OR01);
        Soldier e=new Soldier("Test5","Test5", LocalDate.of(1995,10,02),new Address(),Rank.OR01);
        Soldier f=new Soldier("Test6","Test6", LocalDate.of(1995,10,02),new Address(),Rank.OR01);

        System.out.println(f.toString());
        System.out.println(f);
//        if(a.equals(b)){
//            System.out.println("Equals Work");
//        }
//        Squad squad=new Squad("Golden Eagles",123, List.of(a), List.of(a,b,c));
//        Squad squad1=new Squad("Golden NotEagles",122,List.of(d),List.of(d,e));
//
//        Platoon platoon=new Platoon("SomeName",123,List.of(f),List.of(squad,squad1));
//        System.out.println(platoon.count());
//        platoon.printInfo();

    }
}