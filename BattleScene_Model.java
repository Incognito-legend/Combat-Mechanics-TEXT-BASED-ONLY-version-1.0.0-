import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BattleScene_Model here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BattleScene_Model extends Actor
{
    GreenfootImage BSM = new GreenfootImage("BattleScene_Model.png");
    boolean df = true;
        public void act() 
    {
        
        background level = (background)this.getWorld();
        if (df)
        {
            setImage(BSM);
            getImage().scale(240*3, 160*3);
            //BSM.mirrorHorizontally();
            
            
            df = false;
        }
    }    
}
