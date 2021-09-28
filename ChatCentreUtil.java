class ChatCentreUtil{
public static void main(String a[]){
ChatCentre centre=new ChatCentre();
centre.items[0]="PaniPuri";
centre.items[1]="Kachori";
centre.items[2]="PavBhaji";
centre.items[3]="vadapav";
centre.items[4]="Sandwich";
centre.items[5]="Sevpuri";
ChatCentre centre1=new ChatCentre("Sai Chats","near KLE Ground",centre.items,66,"Ranganath",true);
centre1.displayChatCentre();
centre1.getitems();
}
} 