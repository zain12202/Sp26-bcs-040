public class Bus{
   private String busNo;
   Seat[][] seats;
 Bus(){
 this("Default",2);
}

Bus(String busNo, int rows){
   this.busNo=busNo;
   seats=new Seat[rows][];
   int count=0;
  for(int i=0;i<seats.length;i++){
     seats[i]=new Seat[4];
     for(int j=0;j<seats[i].length;j++){
         seats[i][j]=new Seat(count++);
}
}
}
public void SeatsDisplay(){
   for(int i=0;i<seats.length;i++){
      for(int j=0;j<seats[i].length;j++){
 if(j==2){
   System.out.print(" || ");
}
    System.out.print(" "+seats[i][j].getSeatnumber());
}
System.out.println();
}

}
 
public void reservedSeat(int seatNumber) {
    if (seatNumber<0 || seatNumber >= seats.length * 4) {
        System.out.println("Invalid seat number");
        return;
    }

    int row = (seatNumber - 1) / 4;
    int col = (seatNumber - 1) % 4;

    if (seats[row][col].reserve()) {
        System.out.println("Reserving Seat " + seatNumber + ": Successful");
    } else {
        System.out.println("Reserving Seat " + seatNumber + ": Already Reserved");
    }
}
 public void isAvailable(){
   int counts=0;
  for(int i=0;i<seats.length;i++){
     for(int j=0;j<seats[i].length;j++){
if(!seats[i][j].isReserved()){
          counts++;
}    
}
}
 System.out.println("Total available: "+counts);
}
    
 


}


