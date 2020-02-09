import java.io.*;
import java.util.Scanner;

public  class Pokemon {

    public int pk_hp,pk_Exp,pk_maxExp,pk_lv,pk_atk,pk_ele;

    public Pokemon(){
        this.pk_hp = 35;
        this.pk_Exp = 0;
        this.pk_maxExp = 100;
        this.pk_lv = 1;
        this.pk_atk = 5;
    }

    //Status Pokemon
    public String Status1(){
        System.out.println("Pokemon Name: \"Bulbasaur\"");
        System.out.println("Pokemon Element: \"Grass/Poison\"");
        System.out.println("Pokemon Level: "+pk_lv);
        System.out.println("Pokemon HP: "+pk_hp);
        System.out.println("Pokemon Attack Damage: "+pk_atk);
        System.out.println("Pokemon Exp: "+pk_Exp+"/"+pk_maxExp);
        return "";
    }

    public String Status2(){
        System.out.println("Pokemon Name: \"Squirtle\"");
        System.out.println("Pokemon Element: \"Water\"");
        System.out.println("Pokemon Level: "+pk_lv);
        System.out.println("Pokemon HP: "+pk_hp);
        System.out.println("Pokemon Attack Damage: "+pk_atk);
        System.out.println("Pokemon Exp: "+pk_Exp+"/"+pk_maxExp);
        return "";
    }

    public String Status3(){
        System.out.println("Pokemon Name: \"Charmander\"");
        System.out.println("Pokemon Element: \"Fire\"");
        System.out.println("Pokemon Level: "+pk_lv);
        System.out.println("Pokemon HP: "+pk_hp);
        System.out.println("Pokemon Attack Damage: "+pk_atk);
        System.out.println("Pokemon Exp: "+pk_Exp+"/"+pk_maxExp);
        return "";
    }
}