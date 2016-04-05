import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor

{
    int e_damage_count = 0;
    int e_hitChanceBonus = 0;
    
    public void act() 
    
    {
        
            background level = (background)this.getWorld();
            
            if (level.Gamestart)
                
            {
                 if (!(level.Next_Round(true)))
            
            {                            
                    //             if (level.e_HP > 0)
                    //             
                    //             {
                    
                if (!(level.turn))
                
                {          
                    
                        if (!(level.clearConsole))
                        
                        {                           
                            
                            level.clearConsole = true;
                            
                        }
                    
                            e_hitChanceBonus = level.e_SPD - level.p_SPD;
                            // ^ if negative e_hitChanceBonus -> then 25 - e_hitChanceBonus = 25 + value = smaller chance at hitting player or larger chance at missing as enemy ;
                        if (level.getRandomNumberRange(1,100) > (25 - e_hitChanceBonus))
                        
                        {              
                                                            
                            System.out.println(" ");
                            
                            System.out.println("The Enemy Hit You!");
                            
                            System.out.println(" ");
                            
                            e_damage_count = level.e_ATK - level.p_DEF;
                            
                            if (e_damage_count < 0)
                            {
                                e_damage_count = 0;
                            }
                            
                            level.p_HP = level.p_HP - e_damage_count;
                            
                            System.out.println("The Enemy dealt " + e_damage_count + " to You!");
                            
                            System.out.println(" ");
                            
                            System.out.println("(You) Player HP: " + level.p_HP);
                            
                            System.out.println(" ");
                            
                            System.out.println("--------------------------");
                                                                                   
                            level.turn = true;
                            
                        }
                            
                        else if (level.getRandomNumberRange(1,100) <= (25 - e_hitChanceBonus))
                            
                        {
                                                                                        
                            System.out.println(" ");
                            
                            System.out.println(" ");
                            
                            System.out.println(" ");
                            
                            System.out.println("The Enemy Missed!");
                            
                            System.out.println(" ");
                            
                            System.out.println(" ");
                            
                            System.out.println(" ");
                            
                            System.out.println("--------------------------");
                            
                            
                            
                            level.turn = true;
                                
                        }                                                
                        
                }                                                                                                    
                                            
                    if (!(level.Game_Over))
                    
                    {
                    
                        if (level.p_HP <= 0)
                    
                    {
                                                                                               
                        level.Game_Over = true;
                        
                    }                         
                             
                }                        
                
                if (level.Game_Victory)
                    
                    { 
                        level.clearConsole = true;
                        level.Next_Round(true);
                        //level.removeObject(this);
                        
                    }
            
            }
            
        }    
        
       
        
    }    
    
}
