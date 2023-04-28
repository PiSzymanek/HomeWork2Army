package pl.Szymanek

import pl.Szymanek.Classes.Address
import pl.Szymanek.Classes.Platoon
import pl.Szymanek.Classes.Soldier
import pl.Szymanek.Classes.Squad
import pl.Szymanek.Enums.Rank
import spock.lang.Specification
import spock.lang.Subject

import java.time.LocalDate

class SquadSpec extends Specification{


    @Subject
    static Soldier soldier1;

    @Subject
    static Soldier soldier2;

    @Subject
    static Soldier soldier3;


    void setup(){
        soldier1=new Soldier("Test","test", LocalDate.of(1999,1,1),new Address(), Rank.OR01);
        soldier2=new Soldier("Test1","test1", LocalDate.of(1999,1,1),new Address(),Rank.OR01)
        soldier3=new Soldier("Test2","test2", LocalDate.of(1999,1,1),new Address(),Rank.OR01)
    }


    def "count should return NullPointException when Commanders and ListOfSolider is null"(){
        given:
        Squad emptySquad=new Squad()
        when:
        emptySquad.count();
        then:
        thrown NullPointerException;
    }

    def "count should return NullPointException when Commanders"(){
        given:
        Squad emptySquad=new Squad("test1",1,List.of(soldier1),List.of());
        when:
        emptySquad.count();
        then:
        thrown NullPointerException;
    }
    def "count should return NullPointException when Soldiers"(){
        given:
        Squad emptySquad=new Squad("test1",1,List.of(),List.of(soldier1));
        when:
        emptySquad.count();
        then:
        thrown NullPointerException;
    }


    def "count should return c when Soldiers list is equals a and commanders list is equals b "(){
        expect:
        Squad emptySquad=new Squad("test1",1, a as List<Soldier>, b as List<Soldier>);
        emptySquad.count()==c
        where:
        a|b|c
        List.of(soldier1,soldier2) | List.of(soldier1)|2
        List.of(soldier1) | List.of(soldier1)|1
        List.of(soldier1,soldier2,soldier3) | List.of(soldier1)|3
        List.of(soldier1,soldier2,soldier3) | List.of(soldier1,soldier2,soldier3)|3
        List.of(soldier1) | List.of(soldier3)|2
    }

    def "Two same Squad will give true"(){
        given:
        Squad emptySquad=new Squad("test1",1, List.of(soldier1), List.of(soldier1));
        Squad emptySquad2=new Squad("test1",1, List.of(soldier1), List.of(soldier1));
        expect:
        emptySquad.equals(emptySquad2)


    }


    def "Test count for Platoon"(){
        given:
        Squad emptySquad=new Squad("test1",1, List.of(soldier1), List.of(soldier1));
        Squad emptySquad2=new Squad("test1",1, List.of(soldier2), List.of(soldier2,soldier3));
        Platoon platoon=new Platoon("SomeName",123,List.of(new Soldier("Test6","Test6", LocalDate.of(1995,10,02),new Address(),Rank.OR01)),List.of(emptySquad,emptySquad2));
        when:
        int result=platoon.count()
        then:
        result==4;

    }




}
