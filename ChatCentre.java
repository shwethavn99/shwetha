class ChatCentre{
String centreName;
int centreId;
String location;
String ownerName;
boolean isOpen;
String items[]=new String[6];
public ChatCentre(){
System.out.println("ChatCtentre object is createad");
}
public ChatCentre(String centreName,String location,String items[],int centreId,String ownerName,boolean isOpen){
this.centreName=centreName;
this.location=location;
this.centreId=centreId;
this.ownerName=ownerName;
this.items=items;
this.isOpen=isOpen;
}
public void displayChatCentre(){
System.out.println(centreName +" "+ centreId +" "+ ownerName +" "+ location +" "+ isOpen);
}
public void getitems(){
for(int i=0 ; i<items.length ; i++)
System.out.println(items[i]);
}
}



