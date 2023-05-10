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
  public void setReplantTrees (int treesBurned, int replantTrees){
    replantTrees = treesBurned*300;
  }
  public void setCleanAshes (int cleanAshes){
    cleanAshes = 400;
  }
  public void setWaterQuality (int waterQuality){
    waterQuality = 3000;
  }
  public void setRebuildFacilities (int rebuildFacilities){
    rebuildFacilities = 375000;
  }
  public void setRelocateWildlife (int relocateWildlife){
    relocateWildlife = 4000;
  }
  public void setRescuWildlife (int rescueWildlife){
    rescueWilddlife = 4000;
  }
  public void setAnanguPeople (int ananguPeople){
    ananguPeople= 12500000;
  }
  public void setEmployeeNum (int employeeNum ){
    employeeNum = 1500;
  }
  public int getReplantTrees (int replantTrees){
    return replantTrees;
  } 
  public int getCleanAshes (int cleanAshes){
    return cleanAshes;
  }
  public int getWaterQuality (int waterQuality){
    return waterQuaity;
  } 
  public int getRebuildFacilities (int rebuildFacilities){
    return rebuildFacilities;
  }
  public int getRelocateWildlife (int relocateWildlife){
    return relocateWildlife;
  } 
  public int getRescuWildlife (int rescueWildlife){
    return rescueWildlife;
  }
  public int getAnanguPeople (int ananguPeople){
    return ananguPeople;
  }
  public int getEmployeeNum (int employeeNum ){
    return employeeNum;
  } 
  public int getMoneyLost (int replantTrees, int cleanAshes, int waterQuality, int rebuildFacilities, int relocateWildlife, int rescueWildlife, int ananguPeople, int employeeNum){
    int moneyLost = replantTrees+cleanAshes+waterQuality+rebuildFacilities+relocateWildlife+rescueWildlife+ananguPeople+employeeNum;
    System.out.print.ln("Total Money Lost: " + moneyLost);
    return moneyLost;
  } 

}
