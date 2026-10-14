public class Seat{
   private int Seatno;
   private boolean Reserved;
 Seat(int Seatno){
   this.Seatno=Seatno;
   this.Reserved=false;
}

public boolean reserve(){
    if(this.Reserved==false){
        this.Reserved=true;
    return true;
} 
else{
   return false;
}
}
public boolean isReserved(){
    if(this.Reserved==true){
 return true;
}
   else{
  return false;
}
}
int getSeatnumber(){
      return this.Seatno;
}
}