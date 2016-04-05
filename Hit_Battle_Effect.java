import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hit_Battle_Effect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hit_Battle_Effect extends Actor
{
    
    String hitImages1;
    String hitImages2;
    String hitImages3;
    String hitImages4;
    String hitImages5;
    String hitImages6;
    
    int paICount = 0;
    
    int Count_ = 0;
    
    boolean check = true;
    
    public void act() 
    
    {
        
            background level = (background)this.getWorld();
            
            if (check)
            
            {
                
                if (paICount == 200)
                
                {
                    
                    Count_ = Count_ + 1;    
                
                }
                
            if (Count_ == 1)
            
                {
                    
                setImage(hitImages1);
                
            }
            
            else if (Count_ == 2)
            
                {
                    
                setImage(hitImages2);
                
            }   
            
            else if (Count_ == 3)
            
                {
                    
                setImage(hitImages3);
                
            }   
            
            else if (Count_ == 4)
            
                {
                    
                setImage(hitImages4);
                
            }   
            
            else if (Count_ == 5)
            
                {
                    
                setImage(hitImages5);
                
            }   
            
            else if (Count_ == 6)
            
                {
                    
                setImage(hitImages6);                                
                
            }
            
            else if (Count_ == 7)
            
                {
                    
                check = false;    
                    
            }
            
            
            paICount = (paICount + 1) % 201;
            
        }
    
        if (!(check))
        
        {
            
            Count_ = 0;
            
            level.removeObject(this);
            
        }
    
    }    
}
