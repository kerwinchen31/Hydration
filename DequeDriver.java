//StillCold (Fiona Cai, Kevin Feng, Alexia Leong)
//APCS2 pd1
//QQKachoo Driver
/*
__---~~~~--__                      __--~~~~---__
`\---~~~~~~~~\\                    //~~~~~~~~---/'
 \/~~~~~~~~~\||                  ||/~~~~~~~~~\/
             `\\                //'
               `\\            //'
                 ||          ||
       ______--~~~~~~~~~~~~~~~~~~--______
  ___ // _-~                        ~-_ \\ ___
 `\__)\/~                              ~\/(__/'
  _--`-___                            ___-'--_
/~     `\ ~~~~~~~~------------~~~~~~~~ /'     ~\
/|        `\         ________         /'        |\
| `\   ______`\_      \------/      _/'______   /' |
|   `\_~-_____\ ~-________________-~ /_____-~_/'   |
`.     ~-__________________________________-~     .'
`.      [_______/------|~~|------\_______]      .'
`\--___((____)(________\/________)(____))___--/'
 |>>>>>>||                            ||<<<<<<|
*/

public class DequeDriver{
  public static void main(String[] args) {
    QQKachoo<String> iscream = new QQKachoo<String>();

    System.out.println("-----Adding to front------");
    iscream.addFirst("Chocolate");
    System.out.println(iscream.peekFirst()); //Chocolate
    iscream.addFirst("Vanilla");
    System.out.println(iscream.peekFirst()); //Vanilla
    iscream.addFirst("Strawberry");
    System.out.println(iscream.peekFirst()); //Strawberry
    iscream.addFirst("Mint");
    System.out.println(iscream.peekFirst()); //Mint

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate

    System.out.println("");

    System.out.println("-----Adding to end------");
    iscream.addLast("Pistachio");
    System.out.println(iscream.peekLast()); //Pistachio
    iscream.addLast("Coffee");
    System.out.println(iscream.peekLast()); //Coffee
    iscream.addLast("S'mores");
    System.out.println(iscream.peekLast()); //S'mores

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("-----Removing from front-----");
    //iscream.pollFirst(); //Mint  dies
    System.out.println(iscream.peekFirst()); //Strawberry

    System.out.println("");

    System.out.println("-----Removing from end-----");
    //iscream.pollLast(); //S'mores dies
    System.out.println(iscream.peekLast()); //Coffee

    System.out.println("");

    System.out.println("------Current Deque------");
    System.out.println(iscream); //Mint Strawberry Vanilla Chocolate Pistachio Coffee S'mores

    System.out.println("");

    System.out.println("------REMOVING EVERYTHING------");
    //iscream.pollFirst();
    System.out.println(iscream);
    //iscream.pollLast();
    System.out.println(iscream);
    //iscream.pollFirst();
    System.out.println(iscream);
    //iscream.pollLast();
    System.out.println(iscream);
    //iscream.pollFirst();
    System.out.println(iscream);
    //System.out.println("Empty now?: "+iscream.isEmpty()); //true
  }





}
