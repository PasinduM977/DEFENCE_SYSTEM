/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CollectedInfo {
 int SoldierCount;
 int AmmoCount;
 int FuelAmount;
 int OxeygenLevel;
 
 public void setSoldierCount(int SoldierCount)
 {
    this.SoldierCount=SoldierCount; 
 }
 
  public void setAmmoCount(int AmmoCount)
 {
    this.AmmoCount=AmmoCount; 
 }
  
   public void setFuelAmount(int FuelAmount)
 {
    this.FuelAmount=FuelAmount; 
 }
    public void setOxeygenLevel(int OxeygenLevel)
 {
    this.OxeygenLevel=OxeygenLevel; 
 }
    
    public int getSoldierCount()
    {
        return SoldierCount;
    }
    
    public int getAmmoCount()
    {
        return AmmoCount;
    }
    
    public int getFuelAmount()
    {
        return FuelAmount;
    }
    
    public int getOxeygenLevel()
    {
        return OxeygenLevel;
    }
   
 
}
