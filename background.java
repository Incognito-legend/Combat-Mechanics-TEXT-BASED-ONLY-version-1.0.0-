import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class background extends World

{
    
    int p_HP = 100;
    int p_DEF = 10;
    int p_SPD = 2;
    int p_MAG = 8;
    
    int p_ATK = 20;
    
    int e_HP = 100;
    int e_DEF = 10;
    int e_SPD = 1;
    int e_MAG = 0;
    
    int e_ATK = 20;
    
    boolean Gamestart = false;
    boolean turn = true;
    boolean Game_Over = false;
    boolean Game_Victory = false;
    boolean penalty_check = false;
    boolean clearConsole = true;
    
    int Round = 1;
    
    int Wins = 0;
    
    int Defeats = 0;
    
    public background()
    
    {    

        super(600, 400, 1); 
        
        Gamestart = true;
        
        addObject(new Player(), 100, 200);
        addObject(new Enemy(), 500, 200);
        
    }
    
    public static int getRandomNumberRange(int start, int end)
    
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
    public boolean Next_Round(boolean nR)
    
    {
        
        if (nR)
        
        {
            
            if (Game_Over)
            
            {
                    
                    System.out.println("\f");
                    
                    Round = Round + 1;
                    
                    Defeats = Defeats + 1;
                    
                    System.out.println("--------------------------");
                        
                        System.out.println(" ");
                        
                        System.out.println(" ");                    
                        
                        System.out.println("You have been Defeated by Your Enemy!");
                        
                        System.out.println(" ");
                        
                        System.out.println("You Lose!");
                        
                        System.out.println(" ");
                        
                        System.out.println(" ");
                        
                    
                    
                    
                    System.out.println("--------------------------");
                    
                    System.out.println(" ");
                    
                    System.out.println("Round: " + Round);
                    
                    System.out.println(" ");
                    
                    System.out.println("Wins: " + Wins);
                    
                    System.out.println(" ");
                    
                    System.out.println("Defeats: " + Defeats);
                    
                    
                    
                    p_HP = 100;
                    
                    p_DEF = p_DEF + getRandomNumberRange(1,2);
                    
                    p_SPD = p_SPD + getRandomNumberRange(1,2);
                    
                    p_MAG = 8;
    
                    p_ATK = p_ATK + getRandomNumberRange(1,2);
                    
                    if (getRandomNumberRange(1,100) > 50)
                    
                    {
                        
                        System.out.println("0 penalty check");                                                
                        
                        e_DEF = e_DEF - 0;
                        
                        e_SPD = e_SPD - 0;
                    
                        e_MAG = e_MAG - 0;
                    
                        e_ATK = e_ATK - 0;

                        e_HP = 100;
                        
                    } 
                    
                    else if (getRandomNumberRange(1,100) <= 50)
                    
                    {
                        
                        System.out.println("-1 penalty check");                                                
                        
                        e_DEF = e_DEF - 1;
                        
                        e_SPD = e_SPD - 1;
                        
                        e_MAG = e_MAG - 1;
                        
                        e_ATK = e_ATK - 1;
                        
                        e_HP = 100;
                        
                        penalty_check = true;
                                                                        
                }
                
                if (e_ATK < 0)
                
                {
                    
                    e_ATK = 0;
                    
                }
                    
                    
                                    
                    
                    
                                     
                    
                    
                    System.out.println(" ");
                    
                    System.out.println("Game Restart Finished");
                    
                    System.out.println(" ");
                    
                    System.out.println("Player HP: " + p_HP);
                    
                    System.out.println(" ");
                    
                    System.out.println("Enemy HP: " + e_HP);
                    
                    System.out.println(" ");
                    
                    System.out.println("--------------------------");
                    
                    if ((e_HP == 100) && (p_HP == 100) && (penalty_check))
                    
                    {
                    
                    Game_Over = false;  
                    
                }
                
                
            }
            
            else if (Game_Victory)
            
            {
                
                System.out.println("\f");
                
                Round = Round + 1;
                
                Wins = Wins + 1;
                
                System.out.println("--------------------------");
                    
                    System.out.println(" ");
                    
                    System.out.println(" ");
                    
                    System.out.println("The Enemy has been Defeated!");
                    
                    System.out.println(" ");
                    
                    System.out.println("You Win!");
                    
                    System.out.println(" ");
                    
                    System.out.println(" ");
                    
              
                    
                System.out.println("--------------------------");
                
                System.out.println(" ");
                
                System.out.println("Round: " + Round);
                
                System.out.println(" ");
                
                System.out.println("Wins: " + Wins);
                
                System.out.println(" ");
                
                System.out.println("Defeats: " + Defeats);
                
               
                
                p_HP = 100;
                
                p_DEF = p_DEF - getRandomNumberRange(1,2);
                
                p_SPD = p_SPD - 1;
                
                p_MAG = p_MAG - getRandomNumberRange(1,2);

                p_ATK = p_ATK - getRandomNumberRange(1,2);
                
                
                
                e_HP = 100;
                
                e_DEF = e_DEF + getRandomNumberRange(1,2);
                
                e_SPD = e_SPD + getRandomNumberRange(1,2);
                
                e_MAG = e_MAG + getRandomNumberRange(1,2);
    
                e_ATK = e_ATK + getRandomNumberRange(1,2);
                
                
                
                
                                 
                
                System.out.println(" ");
                
                System.out.println("Game Restart Finished");
                
                System.out.println(" ");
                
                System.out.println("Player HP: " + p_HP);
                
                System.out.println(" ");
                
                System.out.println("Enemy HP: " + e_HP);
                
                System.out.println(" ");
                
                System.out.println("--------------------------");
                
                clearConsole = true;
                                 
                if ((e_HP == 100) && (p_HP == 100))
                
                    {
                        
                    turn = true;
                    Game_Victory = false;  
                    
                }
                
                
            }
            
            else if (((Game_Over) && (Game_Victory)) || ((e_HP <= 0) && (p_HP <= 0)))
            
            {
                
                System.out.println("Your enemy has brought you down with them! Defeat by Default!");
                
                Game_Victory = false;
                
            }
            
            
            
            if ((!(Game_Over)) && (!(Game_Victory)))
            
            {
                
                penalty_check = false;
                
                nR = false;
                
            }
            
        }
        
        return nR;
    }
    
}
