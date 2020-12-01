public abstract class Number{
  public abstract double getValue();

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
}
