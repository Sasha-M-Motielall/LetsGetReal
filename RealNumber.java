public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }
//---------------------------------------
  public boolean equals(RealNumber other){
    if(this.getValue() == 0){
      return other.getValue() == 0;
    }
    else if(Math.abs(this.getValue() - other.getValue())/((this.getValue() + other.getValue())/2) * 100 <= 0.001){
      return true;
    }
    else{
      return false;
    }
  }

  public RealNumber add(RealNumber other){
     RealNumber sum = new RealNumber(getValue() + other.getValue());
     return sum;
  }

  public RealNumber multiply(RealNumber other){
    RealNumber product = new RealNumber(getValue() * other.getValue());
    return product;
  }

  public RealNumber divide(RealNumber other){
    RealNumber quotient = new RealNumber(getValue() / other.getValue());
    return quotient;
  }

  public RealNumber subtract(RealNumber other){
    RealNumber difference = new RealNumber(getValue() - other.getValue());
    return difference;
  }
}
