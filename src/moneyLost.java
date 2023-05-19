public class moneyLost
{
  private int replantTrees;
  private int cleanAshes;
  private int waterQuality;
  private int rebuildFacilities;
  private int relocateWildlife;
  private int rescueWildlife;
  private int ananguPeople;
  private int employeeNum;
  
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
    cleanAshes = 400;
  }
   /**
  *
  * sets the amount of money to fix water quality
  *@param waterQuality
  */
  public void setWaterQuality (int waterQuality){
    waterQuality = 3000;
  }
   /**
  *
  * sets the amount of money to rebuild facilites
  *@param rebuildFacilites
  */
  public void setRebuildFacilities (int rebuildFacilities){
    rebuildFacilities = 375000;
  }
   /**
  *
  * sets the amount of money to reclocate wildlife
  *@param reclocateWildlife
  */
  public void setRelocateWildlife (int relocateWildlife){
    relocateWildlife = 4000;
  }
   /**
  *
  * sets the amount of money to rescue wildlife
  *@param rescueWildlife
  */
  public void setRescuWildlife (int rescueWildlife){
    rescueWildlife = 4000;
  }
   /**
  *
  *sets the amount of money to give to the anagu people
  *@param ananguPeople
  */
  public void setAnanguPeople (int ananguPeople){
    ananguPeople= 12500000;
  }
   /**
  *
  * sets the amount of money to pay the employyes
  *@param employeeNum
  */
  public void setEmployeeNum (int employeeNum ){
    employeeNum = 60000;
  }
   /**
  *
  * gets the amount of money to replay trees
  *@param replantTrees
  *@return 
  */
  public int getReplantTrees (int replantTrees){
    return replantTrees;
  } 
   /**
  *
  * gets the amount of money to clean the ashes
  *@param cleanAshes
  */
  public int getCleanAshes (int cleanAshes){
    return cleanAshes;
  }
   /**
  *
  * gets the amount of money to fix the water quality 
  * @param waterQuality
  *@return
  */
  public double getWaterQuality (double waterQuality){
    return waterQuality;
  } 
   /**
  *
  * gets the amount of money to rebuild the burnt facillities
  *@param rebuildFacilites
  *@return
  */
  public int getRebuildFacilities (int rebuildFacilities){
    return rebuildFacilities;
  }
   /**
  *
  * gets the amount of money to relocate wildlife
  *@param relocateWildlife
  *@return
  */
  public int getRelocateWildlife (int relocateWildlife){
    return relocateWildlife;
  } 
   /**
  *
  * gets the amount of money to rescue the wildlife 
  *@param rescueWildlife
  *@return
  */
  public int getRescuWildlife (int rescueWildlife){
    return rescueWildlife;
  }
   /**
  *
  * gets the amount of money the park needs to give the anangu people
  *@param ananguPeople
  *@return
  */
  public int getAnanguPeople (int ananguPeople){
    return ananguPeople;
  }
   /**
  *
  * gets the amount of money you need to pay employeees
  *@param employeeNum
  *@return
  */
  public int getEmployeeNum (int employeeNum ){
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
