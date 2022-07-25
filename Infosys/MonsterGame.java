import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// While playing an RPG game, you were assigned to complete one of the hardest quests in this game. There are n monsters you’ll need to defeat in this quest. Each monster i is described with two integer numbers – poweri and bonusi. To defeat this monster, you’ll need at least poweri experience points. If you try fighting this monster without having enough experience points, you lose immediately. You will also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.

// The quest turned out to be very hard – you try to defeat the monsters but keep losing repeatedly. Your friend told you that this quest is impossible to complete. Knowing that, you’re interested, what is the maximum possible number of monsters you can defeat?

// (Question difficulty level: Hardest)

// Input:

// The first line contains an integer, n, denoting the number of monsters. The next line contains an integer, e, denoting your initial experience.
// Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents power of the corresponding monster.
// Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents bonus for defeating the corresponding monster.

// Input	Output	Output Description
// 2          2      Initial experience level is 123 points.
//123                Defeat the first monster having power of 78 and bonus of 10. Experience level is now 123+10=133.
// 78                 Defeat the second monster.
// 130
// 10
// 0	
// Input	Output	Output Description
// 3         2 
// 100
// 101
// 100
// 304
// 100
// 1
// 524


public class MonsterGame {
    public static Scanner scn=new Scanner(System.in);
    public static void input(int []arr){
      for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
      }
    }
    public static void main(String[] args) {
        int n=scn.nextInt();
        int exp=scn.nextInt();

        int []power=new int[n];
        input(power);
        int []bonus=new int[n];
        input(bonus);

        class Monster{
            public int power,bonus;
            public Monster(int power,int bonus){
                this.power=power;
                this.bonus=bonus;
            }
        }

        Monster[] monsters=new Monster[n];

        for(int i=0;i<n;i++){
            monsters[i]=new Monster(power[i], bonus[i]);
        }
        Arrays.sort(monsters, Comparator.comparingInt(m->m.power));
        
        int count=0;
       
        for(Monster m:monsters){
            if(exp>=m.power){
                count++;
                exp=exp+m.bonus;
            }
        }
        System.out.println(count);

    }
    
}
