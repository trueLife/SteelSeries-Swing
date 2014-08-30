package eu.hansolo.steelseries.gauges;   
  public enum TextAlignment   { 
  LEFT(-1),  CENTER(0),  RIGHT(1),  NONSET(2);
  
  private int textAlign;
  
  TextAlignment(int textAlign){
  
  this.textAlign =textAlign;
  }
  
  public int getTextAlign(){
  return textAlign;
  
  }
  public void setTextAlign(int textAlign)
  {
  this.textAlign=textAlign;
  }
  
  }