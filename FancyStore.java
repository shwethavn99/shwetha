class FancyStore{
String storeName;
String location;
int storeId;
String ownerName;
boolean avaliable;
String items[]=new String[6];
public FancyStore(){
System.out.println("FancyStore object is created");
}
public FancyStore(String storeName,String location,String items[],int storeId,String ownerName,boolean avaliable){
this.storeName=storeName;
this.location=location;
this.storeId=storeId;
this.ownerName=ownerName;
this.items=items;
this.avaliable=avaliable;
}
public void displayFancyStore(){
System.out.println(storeName +" "+ storeId +" "+ location +" "+ ownerName +" "+ avaliable);
}
public void getitems(){
for(int i=0 ; i<items.length ; i++)
System.out.println(items[i]);
}
}