public class moneyLost
{
  private int replantTrees;
  private int cleanAshes = 400;
  private int waterQuality = 3000;
  private int rebuildFacilities = 375000;
  private int relocateWildlife = 4000;
  private int rescueWildlife = 4000;
  private int ananguPeople = 12500000;
  private int employeeNum = 60000;
  
  public moneyLost(int replantTrees, int cleanAshes, int waterQuality, int rebuildFacilities, int relocateWildlife, int rescueWildlife, int ananguPeople, int employeeNum){
    this.replantTrees = replantTrees;
    this.cleanAshes = cleanAshes;
    this.waterQuality = waterQuality;
    this.rebuildFacilities = rebuildFacilities;
    this.relocateWildlife = relocateWildlife;
    this.rescueWildlife = rescueWildlife;
    this.employeeNum = employeeNum;
  }
  /**
  *
  * sets the amount of money to replant the trees 
  *@return
  */
  public void setReplantTrees (int treesBurned, int replantTrees){
    replantTrees = treesBurned*300;
  }
   /**
  *
  *sets the amount of money to clean ashes
  *@param cleanAshes
  */
  public void setCleanAshes (int cleanAshes){
    this.cleanAshes = cleanAshes;
  }
   /**
  *
  * sets the amount of money to fix water quality
  *@param waterQuality
  */
  public void setWaterQuality (int waterQuality){
    this.waterQuality = waterQuality;
  }
   /**
  *
  * sets the amount of money to rebuild facilites
  *@param rebuildFacilites
  */
  public void setRebuildFacilities (int rebuildFacilities){
    this.rebuildFacilities = rebuildFacilities;
  }
   /**
  *
  * sets the amount of money to reclocate wildlife
  *@param reclocateWildlife
  */
  public void setRelocateWildlife (int relocateWildlife){
    this.relocateWildlife = relocateWildlife;
  }
   /**
  *
  * sets the amount of money to rescue wildlife
  *@param rescueWildlife
  */
  public void setRescuWildlife (int rescueWildlife){
    this.rescueWildlife = rescueWildlife;
  }
   /**
  *
  *sets the amount of money to give to the anagu people
  *@param ananguPeople
  */
  public void setAnanguPeople (int ananguPeople){
    this.ananguPeople = ananguPeople;
  }
   /**
  *
  * sets the amount of money to pay the employyes
  *@param employeeNum
  */
  public void setEmployeeNum (int employeeNum ){
    this.employeeNum = employeeNum;
  }
   /**
  *
  * gets the amount of money to replay trees
  *@param replantTrees
  *@return 
  */
  public int getReplantTrees (){
    return replantTrees;
  } 
   /**
  *
  * gets the amount of money to clean the ashes
  *@param cleanAshes
  */
  public int getCleanAshes (){
    return cleanAshes;
  }
   /**
  *
  * gets the amount of money to fix the water quality 
  * @param waterQuality
  *@return
  */
  public double getWaterQuality (){
    return waterQuality;
  } 
   /**
  *
  * gets the amount of money to rebuild the burnt facillities
  *@param rebuildFacilites
  *@return
  */
  public int getRebuildFacilities (){
    return rebuildFacilities;
  }
   /**
  *
  * gets the amount of money to relocate wildlife
  *@param relocateWildlife
  *@return
  */
  public int getRelocateWildlife (){
    return relocateWildlife;
  } 
   /**
  *
  * gets the amount of money to rescue the wildlife 
  *@param rescueWildlife
  *@return
  */
  public int getRescuWildlife (){
    return rescueWildlife;
  }
   /**
  *
  * gets the amount of money the park needs to give the anangu people
  *@param ananguPeople
  *@return
  */
  public int getAnanguPeople (){
    return ananguPeople;
  }
   /**
  *
  * gets the amount of money you need to pay employeees
  *@param employeeNum
  *@return
  */
  public int getEmployeeNum (){
    return employeeNum;
  } 
   /**
  *
  * Adds together all of the money that was spent after the fire
  * @param replantTrees
  * @param cleanAshes
  * @param waterQuality
  * @param rebuildFacilities
  * @param relocateWildlife
  * @param rescueWildlife
  * @param ananguPeople
  * @param employeeNum
  *@return
  */
  public int getMoneyLost (int replantTrees, int cleanAshes, int waterQuality, int rebuildFacilities, int relocateWildlife, int rescueWildlife, int ananguPeople, int employeeNum){
    int moneyLost = replantTrees+cleanAshes+waterQuality+rebuildFacilities+relocateWildlife+rescueWildlife+ananguPeople+employeeNum;
    System.out.println("Total Money Lost: " + moneyLost);
    return moneyLost;
  } 

}
