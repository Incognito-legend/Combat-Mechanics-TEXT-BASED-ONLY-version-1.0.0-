import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor

{
    int p_damage_count = 0;
    int p_hitChanceBonus = 0;
    boolean keyPressed = false;
    public void act() 
    
    {
        
            background level = (background)this.getWorld();
            
        if (level.Gamestart)
        
        {
            
           if (!(level.Next_Round(true)))
            
            {
                       
                    
                    if (level.turn)
                    
                    {
                        
                        if ((Greenfoot.isKeyDown("1")) && (!(keyPressed)))
                        
                        {
                            
                            if (level.clearConsole)
                            
                            {
                                
                                System.out.println("\f");
                                
                                level.clearConsole = false;
                                
                            }
                            
                            p_hitChanceBonus = level.p_SPD - level.e_SPD;
                            
                            if (level.getRandomNumberRange(1,100) > (25 + p_hitChanceBonus))
                            
                            {              
                                
                                System.out.println("--------------------------");
                                
                                System.out.println(" ");
                                
                                System.out.println("You Hit the Enemy!");
                                
                                System.out.println(" ");   
                                
                                p_damage_count = level.p_ATK - level.e_DEF;
                                
                                level.e_HP = level.e_HP - p_damage_count;
                                
                                System.out.println("You dealt " + p_damage_count + " to the Enemy!");
                                
                                System.out.println(" ");
                                
                                System.out.println("Enemy HP: " + level.e_HP);
                                
                                System.out.println(" ");
                                
                                System.out.println("--------------------------");
                                
                                keyPressed = true;
                                
                                level.turn = false;
                                
                            }
                            
                            else if (level.getRandomNumberRange(1,100) <= (25 - p_hitChanceBonus))
                            
                            {
                                
                                System.out.println("--------------------------");
                                
                                System.out.println(" ");
                                
                                System.out.println(" ");
                                
                                System.out.println(" ");
                                
                                System.out.println("You Missed!");
                                
                                System.out.println(" ");
                                 
                                System.out.println(" ");
                                
                                System.out.println(" ");
                                
                                System.out.println("--------------------------");
                                
                                keyPressed = true;
                                
                                level.turn = false;
                                
                            }
                            
                            
                            
                        }
                        
                        else if ((!(Greenfoot.isKeyDown("1"))) && (keyPressed))
                        
                        {
                            
                            keyPressed = false;
                            
                        }
                        
                    }
                    
                        //                 }
                
                    if (!(level.Game_Victory))
                    
                    {
                
                        if (level.e_HP <= 0)
                        
                    {
                        
                        
                 
                        level.Game_Victory = true;
                        
                    }                         
                
                }
    
                 
                    
                    if (level.Game_Over)
                        
                        {                
                            
                            level.clearConsole = false;
                            
                            level.Next_Round(true);
                            
                            level.removeObject(this);
                            
                        }        
                
                }
                
        }
        
        
        
    }    
    
}
