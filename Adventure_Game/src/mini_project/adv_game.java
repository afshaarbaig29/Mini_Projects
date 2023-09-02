//NAME: Afshaar Baig
//Enrollment no.EBEON0523698622
//Batch code: 9899
//Mini project topic: ADVENTURE TEXT GAME

//Description:I have developed an exciting adventure text game using basic Java code in Eclipse console. 
//				In this game, players embark on a thrilling journey through a mysterious world filled with 
//			challenges and quests. They will make choices that shape their unique path and encounter various
//			characters and creatures along the way. The game offers a captivating storyline, engaging gameplay,
//			and an opportunity for players to test their decision-making skills. I look forward to presenting 
//    		this project to my teacher and sharing the fun and adventurous experience it offers to players.

//Keywords used: package,public,new,return,while,static,int,import,continue,break,boolean,if,class,true,void,else if,etc.
package mini_project;

import java.util.Scanner;
import java.util.Random;

public class adv_game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  //creating system objects
		Random rn=new Random();
		
		String[] enemies= {"Zombie","Skeleton","Goblin","Dragons"}; //game enemy variables
		int maxEnemyhealth=75;
		int enemyattackdamage=25;
		
		int health=100;   //game player variables
		int attackdamage=50;
		int numhealthpotions=3;
		int healthpotionhealamount =30;
		int healthpotiondropchance=50;   // in percentage
		
		boolean running=true;
		
		System.out.println("Welcome to the cave of dead");
		
		GAME:
		while(running) {
			System.out.println("--------------------------------------------");
			
			int enemyhealth=rn.nextInt(maxEnemyhealth);
			String enemy=enemies[rn.nextInt(enemies.length)];
			System.out.println("\033[0;31m\t# "+enemy+" has appeared! #\n");
			
			while(enemyhealth>0) {
				System.out.println("\033[0;33m\t Your HP is: "+health);
				System.out.println("\t"+enemy+"'s HP is:"+enemyhealth);
				System.out.println("\033[0;32m\n\tWhat would you do now?");
				System.out.println("\t1.Attack");
				System.out.println("\t2.Drink health potion");
				System.out.println("\t3.Run!");
				
				String input=sc.nextLine();
				if(input.equals("1")) {
					int damagedealt=rn.nextInt(attackdamage);
					int damagetaken=rn.nextInt(enemyattackdamage);
					
					enemyhealth -= damagedealt;
					health -= damagetaken;
					
					System.out.println("\033[0;34m\t You strike the "+enemy+" for "+damagedealt+" damage");
					System.out.println("\t You receive "+damagetaken+" in retaliation");
					
					if(health<1) {
						System.out.println("You have taken too much damage, you are too to move on");
						break;
					}
				}
				else if(input.equals("2")){
					if(numhealthpotions>0) {
						health -= healthpotionhealamount;
						numhealthpotions--;
						System.out.println("\033[0;35m\t> You drink health potion to heal yourself for "+healthpotionhealamount+" . "
								+"\n\t> You now have "+health+" HP"
								+"\n\t> You have "+numhealthpotions+" health potions left");
					}
					else {
						System.out.println("\tYou have no health potions left! Defeat one enemy for a chance to get one");
					}
				}
				else if(input.equals("3")) {
					System.out.println("\t You run away from the "+enemy+"!");
					continue GAME;
				}
				else {
					System.out.println("\033[0;31m\tInvalid Entry");
				}
			}
			
		if(health<1) {
			System.out.println("You limp out of the cave of dead, weak fom battle");
			break;
		}
					System.out.println("--------------------------------------");
					System.out.println("\033[0;36m\t# "+enemy+" was defeated! #");
					System.out.println("\t# You have "+health+" HP left #");
					if(rn.nextInt(100)<healthpotiondropchance) {
						numhealthpotions++;
						System.out.println("\033[0;37m\t# The "+enemy+" dropped a health potion! #");
						System.out.println("\t# You now have"+numhealthpotions+" health potion(s)");
					}
			System.out.println("----------------------------------------");
			System.out.println("\033[0;38m\\What would you like to do now?");
			System.out.println("1.Continue battling");
			System.out.println("2.Exit the cave");
			
			String input=sc.nextLine();
			
			while(!input.equals("1") && !input.equals("2")) {
				System.out.println("\033[0;31m\t Invalid command");
				input=sc.nextLine();
			}
			if(input.equals("1")) {
					System.out.println("You continue on your adventure");
					}
			else if(input.equals("2")){
				System.out.println("You came out of the dead cave, succesfully completing your adventure");
				break;
			}
			
			System.out.println("##################");
			System.out.println("\t# THANK YOU FOR PLAYING #");
			System.out.println("#################");
		}
	}

}
