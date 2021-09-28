class MetroStation{
String stationName;
int stationId;
String location;
String ownerName;
boolean isAvailable;
String stations[]={"Magadi","Kengeri","Kuvempu","Majestic","Rajajinagar"};
public MetroStation(){
this("SangoliRaayanna",2456,"Near vidhanSoudha","GOVT",true);
System.out.println("Metro Station object is created");
}
public MetroStation(String stationName,int stationId,String location,String ownerName,boolean isAvailable){
this.stationName=stationName;
this.stationId=stationId;
this.location=location;
this.ownerName=ownerName;
this.isAvailable=isAvailable;
}
public void displayMetroStation(){
System.out.println(this.stationName+" "+this.stationId+" "+this.location+" "+this.ownerName+" "+this.isAvailable);
}
public void getstation(){
for(int i=0;i<this.stations.length;i++){
System.out.println(this.stations[i]);
}
}
}

